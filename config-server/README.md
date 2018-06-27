#SpringCloud Config

- 1.用于分布式项目配置文件读取，文件可存在git仓库或者本地，有config-server端读取，
    config-client从config-server端读取。
- 2.可用Bus消息总线（利用RabbitMq消息,需要安装RabbitMq服务端），在配置文件更改的情况下，无需重启服务，实现对
    配置文件的读取更新。    