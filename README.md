![](./docs/images/30560482_205656421684_4.jpg)

小破站签到脚本,原作者已经删库,自主维护版



2022-04-26 

1.增加是否大会员的开关,避免(我们这些穷逼)浪费执行时间 

```json
"taskConfig": {
	"isVip": false,
	......
```

2.增加每天随机看几个视频的功能,毕竟像我这种万年不登录的,一天怎么不可能啥视频都没看

3.修复了一点小BUG

4.增加Gotify推送

```json
"pushConfig": {
    "GOTIFY_PUSH_URL": "",
    "GOTIFY_TOKEN": "",
    ......
```

5.全局配置 mother = null;

2021-11-30 

去除自动更新的连接(反正没什么用

[原来的说明文档](OLDREADME.md)

