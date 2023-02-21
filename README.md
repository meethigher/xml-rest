创建文本test.txt

```xml
<machine>
    <create-date>2023-02-17T10:04:12.247Z</create-date>
    <creator>你好</creator>
    <id>hello</id>
    <online>0</online>
    <safe-pro-type>0</safe-pro-type>
</machine>
```

执行insert

``` sh
curl -X POST -H "Content-Type:application/xml" -d @test.txt http://127.0.0.1:9999/xml/insert
```

执行query

```sh
curl -X GET http://127.0.0.1:9999/xml/query
```

