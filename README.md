# 検証用docker-compose
> nginx + Next.js + Spring Boot + postgresql で構成されている

## 1.
- 変更なし、一度立ち上げたことがある時のコンテナの起動方法
```bash
docker-compose up
```
- コード変更後
```bash
docker-compose up --build
```

## 2.
以下にアクセス
```bash
http://localhost:80
```
