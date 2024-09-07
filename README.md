# web security emulator

> 本工程旨在通过代码模拟各种漏洞，观察其前后端


+ 环境配置
  + mysql:5.7.31-log
  + java:java version "17" 2021-09-14 LTS

+ thymeleaf
  + 用th:text不会解析html，用th:utext会解析html，在页面中显示相应的样式




## graalvm native
+ 1 .切换到graalvm java环境
  - graalvm-jdk-22_macos-x64_bin
+ 2 .在项目根路径下执行
  - `./mvnw native:compile -Pnative`
+ 3 .mybatis打包失败
  + [Adding mybatis-spring-native artifact](https://github.com/mybatis/spring-native/wiki/Quick-Start)
