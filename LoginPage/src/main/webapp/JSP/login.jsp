<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Page</h2>
    <form method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required/><br/><br/>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required/><br/><br/>
        <input type="submit" value="Login"/>
    </form>
    <c:if test="${not empty error}">
        <p style="color:red">${error}</p>
    </c:if>
</body>
</html>
