<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Hello</title>
</head>
<body>
${message} <br/>  <%--This comes from ModelAndView--%>
ModelAndView: <%= request.getAttribute("message")%> <br/>   <%--This comes from ModelAndView--%>
<%--<%= session.getAttribute("name")%> <br/> <br/> <br/>--%>
${name2}
</body>
</html>