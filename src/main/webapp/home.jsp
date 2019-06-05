<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link rel = "stylesheet" type = "text/css" href = "styles/main.css"/>
</head>
<body>
Hello Telesko
<form action="addAlien">
<input type="text" name="aid" />
<input type="text" name="aname" />
<input type="text" name="tech" />
<input type="submit" name="save"/>
</form>

<form action="getAlien">
<input type="text" name="aid" />
<input type="submit" name="save"/>
</form>

</body>
</html>