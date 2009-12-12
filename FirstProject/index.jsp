<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>First Java EE 6 Example</title>
</head>
<body>
  <p><a href="hello">Execute Servlet (GET)</a></p>
  
  <hr width="100%" noshade="noshade"/>
  
  <form action="hello" method="post">
    <p>Name:<input type="text" name="username"/></p> 
    <p><button type="submit">Execute Servlet (POST)</button></p>
  </form>
</body>
</html>