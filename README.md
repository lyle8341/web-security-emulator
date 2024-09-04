# web security emulator

+ 环境配置
  + mysql:5.7.31-log
  + java:java version "17" 2021-09-14 LTS


---
## sql injection
  ```html
  productCode参数传递 < '+OR+1=1--+ >
  ```  
  > http://localhost:8080/sql/p2?productCode='+OR+1=1--+
  ```html
  执行sql如下:
   select * from products where productCode = '' OR 1=1-- ' AND productID = 1001;
  ```
























## graalvm native
+ 1 .切换到graalvm java环境
  - graalvm-jdk-22_macos-x64_bin
+ 2 .在项目根路径下执行
  - `./mvnw native:compile -Pnative` 
