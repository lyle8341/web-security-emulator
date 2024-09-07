# xss

+ thymeleaf
  + 用th:text不会解析html，用th:utext会解析html，在页面中显示相应的样式


+ 反射型XSS演示流程
  - [http://localhost:8080/xss/reflected?search=<script\>alert(1)\</script>](http://localhost:8080/xss/reflected?search=%3cscript%3ealert(1)%3c%2fscript%3e)


+ 存储型XSS演示流程
  + 1 .在录入页面录入恶意脚本
    + http://localhost:8080/xss/stored
  + 2 .提交
  + 3 .列表页面查看刚才录入的内容
    + http://localhost:8080/xss/storedList

+ DOM型XSS演示