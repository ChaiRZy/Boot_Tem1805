<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Freemarker应用</title>
</head>
<body>

<h1>欢迎：${name}</h1>
<h2>整型：${num1}</h2>
<h2>boolean1：${num2?c}</h2>
<h2>boolean2：${num2?string("true","false")}</h2>
<h2>字符串：${str1}</h2>
<h2>字符串方法：${str1?length}</h2>
<h2>学生姓名：${stu.name}</h2>
<h2>学生年龄：${stu.age}</h2>
<h2>日期：${mydate?date}</h2>
<h2>时间：${mydate?time}</h2>

</body>
</html>