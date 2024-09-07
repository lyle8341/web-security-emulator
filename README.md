# web security emulator

+ 环境配置
  + mysql:5.7.31-log
  + java:java version "17" 2021-09-14 LTS



## graalvm native
+ 1 .切换到graalvm java环境
  - graalvm-jdk-22_macos-x64_bin
+ 2 .在项目根路径下执行
  - `./mvnw native:compile -Pnative`
+ 3 .mybatis打包失败
  + [Adding mybatis-spring-native artifact](https://github.com/mybatis/spring-native/wiki/Quick-Start)
