# zookeeper demo
安装zookeeper：`wget http://archive.apache.org/dist/zookeeper/stable/zookeeper-3.4.6.tar.gz`

解压文件 `tar -zxvf zookeeper-3.4.6.tar.gz -C /usr/local`

我是将解压的文件放入 `/usr/local/` 文件夹中

将解压出来的文件`mv /usr/local/zookeeper/conf/zoo_sample.cfg /usr/local/zookeeper/conf/zoo.cfg` 改名为`zoo.cfg`

编辑配置文件`vi /usr/local/zookeeper/conf/zoo.cfg`

添加`data=数据存储目录`

添加`dataLogDir=数据日志存储目录`

修改客户端使用的端口`clientPort=2188`

启动zookeeper `/usr/local/zookeeper/bin/zkServer.sh start`

查看zookeeper状态 `/usr/local/zookeeper/bin/zkServer.sh status`

停止zookeeper `/usr/local/zookeeper/bin/zkServer.sh stop`
