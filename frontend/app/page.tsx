"use client";
import { SetStateAction, useEffect, useState } from "react";
import "./page.css";
import axios from "axios";

export default function Home() {
    type Greeting = {
        lang: string;
        name: string;
    };

    const [greetingList, setGreetingList] = useState([
        { lang: "", name: "--言語を選択してください--" },
    ]);

    useEffect(() => {
        const fetchOptions = async () => {
            const res = await axios.get("/api/api/options");
            let newList: Greeting[] = [...greetingList];
            Object.keys(res.data).forEach((key) => {
                newList = [...newList, { lang: key, name: res.data[key] }];
            });
            setGreetingList(newList);
        };
        fetchOptions();
    }, []);

    const [select, setSelect] = useState("");
    const changeSelect = (e: { target: { value: SetStateAction<string> } }) => {
        setSelect(e.target.value);
    };

    const [text, setText] = useState("");

    useEffect(() => {
        const fetchText = async () => {
            if (select !== "") {
                const res = await axios.get(`/api/api/greeting?lang=${select}`);
                setText(res.data);
            } else {
                setText("");
            }
        };
        fetchText();
    }, [select]);

    return (
        <div>
            <div>
                <h1>言語を選択してください</h1>
                <select
                    className="selectBox"
                    value={select}
                    onChange={changeSelect}>
                    {greetingList.map((value: Greeting) => (
                        <option key={value.lang} value={value.lang}>
                            {value.name}
                        </option>
                    ))}
                </select>
                <p>{text}</p>
            </div>
        </div>
    );
}
