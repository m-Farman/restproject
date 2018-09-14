<html>
<body>
<h2>Payment Types Accpeted At Hotel: ${message}</h2>  

=======================<br>
===  Payment List  ====<br>
=======================<br>
<#list payments?keys as key>
    ${key} = ${payments[key]} <br>
</#list>

</html>
</body>