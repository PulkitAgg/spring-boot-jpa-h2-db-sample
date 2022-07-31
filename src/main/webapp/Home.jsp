<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<h1>Add ALient</h1>
<form action="addAlien">
		<input type="text" name="aId"/ placeholder="Id"><br>
		<input type="text" name="aName" placeholder="Name"/><br>
		<input type="text" name="tech" placeholder="Tech"/><br>
		<button type="submit"> Submit </button>
	</form>
</div>
	
	
	<div>
	<h1>Search by Id</h1>
	<form action="getAlien">
		<input type="text" name="aId"/><br>
		<button type="submit"> Submit </button>
	</form>
	</div>
	
</body>
</html>