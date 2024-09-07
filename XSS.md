# xss

---
+ 反射型XSS演示流程
  - [users > http://localhost:8080/xss/reflected?search=电饭锅](http://localhost:8080/xss/reflected?search=电饭锅)
  - [attacker > http://localhost:8080/xss/reflected?search=<script\>alert(1)\</script>](http://localhost:8080/xss/reflected?search=%3cscript%3ealert(1)%3c%2fscript%3e)
---

+ 存储型XSS演示流程
  + 1 .在录入页面录入恶意脚本
    + http://localhost:8080/xss/stored
    + ```
      postId: 3
      comment: <script>alert(1)</script>
      name: 雪莲峰
      email: 867708794@qq.com
      website: https://github.com/lyle8341
      ```
  + 2 .提交
  + 3 .列表页面查看刚才录入的内容
    + http://localhost:8080/xss/storedList
---


+ DOM型XSS演示
  - [http://localhost:8080/xss/dom?search=">&lt;svg onload=alert(1)>](http://localhost:8080/xss/dom?search=%22%3E%3Csvg%20onload=alert(1)%3E)

 - Source
   > any JS property or function that accepts user input from somewhere on the page. 
   >> An example of a source is the location.search property because it reads input from the query string.
   - document.URL
   - document.documentURI
   - document.URLUnencoded
   - document.baseURI
   - location.search
   - document.cookie
   - document.referrer
 - Sink
   > Basically, if the function returns input back to the screen as output without security checks, it’s considered a sink.
   - document.write()
   - document.writeln()
   - document.domain
   - element.innerHTML
   - element.outerHTML
   - element.insertAdjacentHTML
   - element.onevent






