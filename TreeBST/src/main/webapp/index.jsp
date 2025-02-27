<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Start Page</title>
    <meta http-equiv="Content-Type"  charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container d-flex flex-column justify-content-center align-items-center vh-100">
    <h1 class="mb-4">Interagir com a Arvore</h1>
    <div class="d-flex gap-2 mb-3" style="max-width: 400px;">
        <input type="text" id="inputValue" class="form-control" placeholder="Digite um valor">
        <button class="btn btn-primary" type="button">Adicionar</button>
        <button class="btn btn-primary" type="button">Pesquisar</button>
    </div>
    <ul class="list-group mt-3" id="valueList" style="max-width: 400px;">
        <li class="list-group-item">Mensagem fixa (modifique-me posteriormente)</li>
    </ul>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>