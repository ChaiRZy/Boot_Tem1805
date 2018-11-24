<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Freemarker操作集合数据信息</title>
</head>
<body>

<h1>遍历集合：</h1>
<h2>
    <ul>
<#list list1 as l >
    <li>${l_index}、${l}</li>
</#list>

    </ul>

</h2>
<h2>
    Set集合：
    <ol>
        <#list set1 as s>
            <li>${s}</li>
        </#list>
    </ol>
</h2>
<hr/>
<h2>
    Map集合：
    <ol>
        <#list map1?keys as m>
            <li>键：${m}--->值：${map1[m]}</li>
        </#list>

    </ol>
</h2>

</body>
</html>