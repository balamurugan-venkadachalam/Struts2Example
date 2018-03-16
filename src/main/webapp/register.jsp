<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
  </head>
  <body>
    <h3>Register for a prize by completing this form.</h3>
<s:debug />

<s:if test="%{#session.valid == true}">
	<h1>#session.valid == true value is working</h1>
</s:if>


<s:if test="%{#session.user.persion == null}">
	<h1>#session.user.persion == null is working</h1>
</s:if>

<h1><s:property value="getText('action.welcome.username')"/></h1>

<p><a href="">Hello Bala ${session.valid }</a></p>

    <s:form action="register">
      <s:textfield name="personBean.firstName" label="First name" />
      <s:textfield name="personBean.lastName" label="Last name" />
      <s:textfield name="personBean.email"  label ="Email"/>  
      <s:textfield name="personBean.age"  label="Age"  />
      <s:submit/>
    </s:form>	
    
    
  </body>
</html>
