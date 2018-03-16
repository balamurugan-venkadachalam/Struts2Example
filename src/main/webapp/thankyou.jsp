<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Registration Successful</title>
  </head>
  <body>
  <s:debug />
    <h3>Thank you for registering for a prize.</h3>

    <p>Your registration information: <s:property value="personBean.firstName"  /> </p>
    <s:property value="#session.value"/>

    <p><a href="<s:url action='index' />" >Return to home page</a>.</p>
  </body>
</html>