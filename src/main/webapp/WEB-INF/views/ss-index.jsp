<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
	<head>
		<title>Secret Santa</title>
	</head>
	<body>
	<h1>
		Welcome to Secret Santa Project
	</h1>

<form:form modelAttribute="user">
      <label for="nameInput">Name: </label>
      <form:input path="name" id="nameInput" />
      <br/>

      <label for="emailInput">Email: </label>
      <form:input path="email" id="emailInput" />
      <br/>
      <br/>
      <input type="submit" value="Submit" />
    </form:form>
	

</body>
</html>
