
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<p>Hello from SimpleJspServlet</p>

<%--
Using request.getAttribute():
<h1>
    <%= request.getAttribute("hello") %>
</h1>
--%>

Using Expression Language:
<h3>
    ${hello}
</h3>

List of users
<c:forEach var="user" items="#{users}">
    <h:inputText id="name" value="#{user.Name}"/>
</c:forEach>
</body>
</html>
