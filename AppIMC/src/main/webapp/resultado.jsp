<%@ page import="edu.vianna.appimc.models.Pessoa" %>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html lang="pt-BR">
    <head>
        <title>Reultado</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>
            <% Pessoa p = (Pessoa) request.getAttribute("pessoa");

            %>
            Ola <% out.print(p.getNome()); %>, <br/>
          Seu IMC e <% out.print(p.IMC()); %>
        </h1>
    </body>
</html>
