<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <title>Calculo IMC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <form method="get" action="${pageContext.request.contextPath}/primeiro">
            <div class="container d-flex flex-column justify-content-center align-items-center" style="height: 100vh;">
                <h1>Calcule o seu IMC</h1>
                <div class="mb-3" >
                    <label for="fname" class="form-label">Nome:</label><br>
                    <input type="text" id="fname" name="fname" class="form-control"><br>
                    <label for="fpeso" class="form-label">Peso:</label><br>
                    <input type="text" id="fpeso" name="fpeso" class="form-control"><br>
                    <label for="faltura" class="form-label">Altura:</label><br>
                    <input type="text" id="faltura" name="faltura" class="form-control"><br>
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </div>
            </div>
        </form>
        
        
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
