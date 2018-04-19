<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.sql.*"%>

<html>
<head>
<title>Create a Database using jsp</title>
</head>

<h1>Create a database using jsp </h1>

<%
 
 Connection con = null;
 
try{
  Class.forName("com.mysql.jdbc.Driver").newInstance();
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
  Statement st = con.createStatement();
  String query = "create database jsp";
  st.executeUpdate(query);
  out.println("<i>Database test created successfully.</i>");
}
catch(Exception e){
	out.println("<i style='color:red'> An error occured.</i>");
}
%>

</html>