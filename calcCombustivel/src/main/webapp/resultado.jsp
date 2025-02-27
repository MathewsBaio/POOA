<%--
  Created by IntelliJ IDEA.
  User: Mathews
  Date: 2/27/2025
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="edu.vianna.calccombustivel.models.Combustivel" %>
<html>
<head>
    <%
        Combustivel g = (Combustivel) request.getAttribute("combustivel");
    %>

    <h1><%
        if (g.compensaGasolina()) {
            out.print("Ta valendo mais a pena a gasolina!");
        } else {
            out.print("É melhor o Etanol agora!");
        }
    %></h1>
</head>
<body>

</body>
</html>
