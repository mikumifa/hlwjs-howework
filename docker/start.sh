# -d参数是让容器后台运行
# 8087为部署后实际代理端口,8089为程序的端口
cd signIn
sudo docker run -d -p 12345:12345 --name test-demo test-demo:v1.0 
cd ..
cd api
sudo docker run -d -p 12346:12346 --name test-demo test-demo:v1.0 
cd ..