<%-- 
    Document   : newjsp
    Created on : Feb. 5, 2024, 6:13:19 p.m.
    Author     : aditi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    // Retrieve the values of num1 and num2 from the request parameters
    String num1Str = request.getParameter("num1");
    String num2Str = request.getParameter("num2");

   
        // Convert the strings to integers
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Calculate the product
        int product = num1 * num2;
%>
        <h2>Result:</h2>
        <p>Number 1: <%= num1 %></p>
        <p>Number 2: <%= num2 %></p>
        <p>Product: <%= product %></p>
<%
    %>   
 </body>

