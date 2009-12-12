<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
  <meta name="author" content="Rodrigo Lazoti"/>
  <title>First Java EE 6 Example</title>
</head>
<body>
  <h2>Result: ${requestScope.message}</h2><br/>
  <h3>This servlet was executed ${requestScope.amountOfRequests} time(s).</h3><br/>
  <hr width="100%" noshade="noshade"/>
  <h4><a href="index.jsp">Back to main page</a></h4>
</body>
</html>