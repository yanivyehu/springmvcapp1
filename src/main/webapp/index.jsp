<html>
<body>
<h2>Hello World!</h2>





<script>

var xhr = new XMLHttpRequest();
xhr.open("POST","http://localhost:8080/yanivapp/userController/addUser");
xhr.setRequestHeader("Content-Type","application/json");
xhr.send("{\"id\":1, \"name\": \"user1\", \"password\" : \"password1\"}");

var xhr = new XMLHttpRequest();
xhr.open("POST","http://localhost:8080/yanivapp/userController/addUser");
xhr.setRequestHeader("Content-Type","application/json");
xhr.send("{\"name\": \"user2\", \"password\" : \"password2\"}");


var xhr = new XMLHttpRequest();
xhr.open("PUT","http://localhost:8080/yanivapp/userController/updateUser/1");
xhr.setRequestHeader("Content-Type","application/json");
xhr.send("{\"id\":1, \"name\": \"user1\", \"password\" : \"password1\"}");

var xhr = new XMLHttpRequest();
xhr.open("DELETE","http://localhost:8080/yanivapp/userController/removeUser/1");
xhr.send();

var xhr = new XMLHttpRequest();
xhr.open("GET","http://localhost:8080/yanivapp/userController/getAllUsers");
xhr.send();

</script>

</body>
</html>
