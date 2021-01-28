# 项目背景

Java新手，耗时7小时。
自己不想写文章，就用这个水吧。
使用框架为SpringBoot+MybatisPlus。可扩展相当丰富的功能。目前功能比较单一。

本项目测试博客地址：goupi.dnmd.me

仅作查看效果，服务器很垃圾，接口就不开放了。
# 安装

拉取代码后编辑*resource*目录的*application.yml*文件。

填写好数据库相关信息。

随后使用maven编译本项目。

`mvn package`

然后在target找到

`WordPress-BullshitGenerator-SpringBoot-1.0-SNAPSHOT.jar`

安装好了jdk或者jre的前提下使用如下命令运行

`java -jar WordPress-BullshitGenerator-SpringBoot-1.0-SNAPSHOT.jar`

随后访问地址:

  http://localhost:9527
# 使用

使用示例

访问接口：

`http://localhost:9527/bullshit?title=为什么要加班&circulate=1`

参数title为文章标题，必填。circulate为文章数量，可不填，默认为1。

# 相关项目

https://github.com/menzi11/BullshitGenerator

