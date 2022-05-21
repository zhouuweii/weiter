#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/weiter_20210908.sql ./mysql/db
cp ../sql/weiter_config_20220114.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../weiter-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy weiter-gateway "
cp ../weiter-gateway/target/weiter-gateway.jar ./weiter/gateway/jar

echo "begin copy weiter-auth "
cp ../weiter-auth/target/weiter-auth.jar ./weiter/auth/jar

echo "begin copy weiter-visual "
cp ../weiter-visual/weiter-monitor/target/weiter-visual-monitor.jar  ./weiter/visual/monitor/jar

echo "begin copy weiter-modules-system "
cp ../weiter-modules/weiter-system/target/weiter-modules-system.jar ./weiter/modules/system/jar

echo "begin copy weiter-modules-file "
cp ../weiter-modules/weiter-file/target/weiter-modules-file.jar ./weiter/modules/file/jar

echo "begin copy weiter-modules-job "
cp ../weiter-modules/weiter-job/target/weiter-modules-job.jar ./weiter/modules/job/jar

echo "begin copy weiter-modules-gen "
cp ../weiter-modules/weiter-gen/target/weiter-modules-gen.jar ./weiter/modules/gen/jar

