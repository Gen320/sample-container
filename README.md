# 検証用docker-compose
> nginx + Next.js + Spring Boot + postgresql で構成されている

## 1.
dockerデスクトップが立ち上がっていることを確認する

## 2.
- 変更なし、一度立ち上げたことがある時のコンテナの起動方法
```bash
docker-compose up
```
- コード変更後
```bash
docker-compose up --build
```

## 3.
以下にアクセス </br>
[http://localhost:80](http://localhost:80)

