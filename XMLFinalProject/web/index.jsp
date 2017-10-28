<%-- 
    Document   : index
    Created on : Oct 27, 2017, 2:44:20 PM
    Author     : frankLX
--%>

<%@page import="main.ExportToXMLFiles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% ExportToXMLFiles.run(); %>
        <h1>Hello World!</h1>
    </body>
</html>
