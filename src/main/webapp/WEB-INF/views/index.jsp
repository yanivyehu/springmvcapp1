<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h2>Hello World!</h2>

	<form:form method="POST" action="submitFormController/modelAttribute" modelAttribute="user">
 		Id <form:input path="id" type="text"/>
		<br>
 		Name <form:input path="name" type="text"/>
		<br>
 		Password <form:input path="password" type="text" />
		<br>
		<input type="submit">
	</form:form>


	<form action="submitFormController/getFormParams">
		Id <input name="id" type="text"></input> <br> Name 
		<input name="name" type="text"></input> <br> Password 
		<input name="password" type="text"></input> <br> <input type="submit">
	</form>


	<script>
		var xhr = new XMLHttpRequest();
		xhr.open("POST",
				"http://localhost:8080/yanivapp/userController/addUser");
		xhr.setRequestHeader("Content-Type", "application/json");
		xhr
				.send("{\"id\":1, \"name\": \"user1\", \"password\" : \"password1\"}");

		var xhr = new XMLHttpRequest();
		xhr.open("POST",
				"http://localhost:8080/yanivapp/userController/addUser");
		xhr.setRequestHeader("Content-Type", "application/json");
		xhr.send("{\"name\": \"user2\", \"password\" : \"password2\"}");

		var xhr = new XMLHttpRequest();
		xhr.open("PUT",
				"http://localhost:8080/yanivapp/userController/updateUser/1");
		xhr.setRequestHeader("Content-Type", "application/json");
		xhr
				.send("{\"id\":1, \"name\": \"user1\", \"password\" : \"password1\"}");

		var xhr = new XMLHttpRequest();
		xhr.open("DELETE",
				"http://localhost:8080/yanivapp/userController/removeUser/1");
		xhr.send();

		var xhr = new XMLHttpRequest();
		xhr.open("GET",
				"http://localhost:8080/yanivapp/userController/getAllUsers");
		xhr.send();
	</script>

</body>
</html>
