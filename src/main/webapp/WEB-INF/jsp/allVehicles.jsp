<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>Vehicles Page</h1>

<ul>
    <c:forEach items="${vehicles}" var="vehicle">
        <li>${vehicle}</li>
    </c:forEach>
</ul>