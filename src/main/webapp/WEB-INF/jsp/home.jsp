<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
<c:forEach var="entry" items="${mapABC}">
    <c:out value="${entry.value}" />
</c:forEach>
</div>
