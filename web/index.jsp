<%-- 
    Document   : index
    Created on : Jul 11, 2022, 5:36:46 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
        <link href="styles.css" rel="stylesheet">
        <link rel="stylesheet" href="node_modules/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="node_modules/bootstrap-social/bootstrap-social.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="text-center">Login Page</h1><br/>
        
        <form class="text-center" action="MainController" method="post">
            Username: <input type="text" name="txtUsername" value="" /><br/>
            Password: <input type="password" name="txtPassword" value="" /><br/>
            <input type="submit" value="Login" name="btAction" />
            <input type="reset" value="Reset" name="Reset" />
        </form>
        <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
	<script src="node_modules/popper.js/dist/umd/popper.min.js"></script>
	<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>

    </body>
</html>
