# -d参数是让容器后台运行
# 8087为部署后实际代理端口,8089为程序的端口
cd signIn
sudo docker build . -t sign_in:v1.0
sudo docker run -d -p 12345:12345 --name sign_in sign_in:v1.0 
cd ..
cd api
sudo docker build . -t api:v1.0
sudo docker run -d -p 12346:12346 --name api api:v1.0 
cd ..