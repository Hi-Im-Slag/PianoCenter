<%-- 
    Document   : search
    Created on : Jul 11, 2022, 6:39:21 AM
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
        <title>Search</title>
    </head>
    <body>
        <div class="container text-center">
            <form action="MainController" method="post">
                Course's name: <input type="text" name="txtSearchValue" value="" />
                <input type="submit" value="Search" name="btAction"/>
            </form>
        </div>
        <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
	<script src="node_modules/popper.js/dist/umd/popper.min.js"></script>
	<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
    </body>
</html>
