<html>
<body>
<h2>Payment Types Accpeted At Hotel: ${message}</h2>  

=======================<br>
===  Payment List  ====<br>
=======================<br>
<#list payments?keys as key>
   <#if key!='check'>
    ${key} = ${payments[key]} <br>
   </#if>
</#list>

<!--<h3>${payments.amex}</h3>-->
<h3>${payments.check.test}</h3>
</html>
</body>