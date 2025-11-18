# 検証用docker-compose
> nginx + Next.js + Spring Boot + postgresql で構成されている

### 1. docker立ち上げ
dockerデスクトップ(dockerエンジン)が立ち上がっていることを確認する

### 2. 起動
- コンテナの起動方法
```bash
docker-compose up
```
- コード変更した時のコンテナの起動方法
```bash
docker-compose up --build
```

### 3. サイトにアクセス
以下にアクセス </br>
[http://localhost:80](http://localhost:80)

## 検証用アプリケーションの概要
> セレクトボックスで言語を選択すると、選択した言語の挨拶が表示される

## 構成
![](./img/system-architecture.svg)

## リクエストシーケンス


