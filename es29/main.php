<!DOCTYPE html>
<html>

<head>
    <title>Autonoleggio</title>
    <link rel="stylesheet" href="error_docs\css-responsive\style.css">
</head>

<body>
    <h1>Autonoleggio</h1>

    <h2>Aggiungi Veicolo</h2>
    <form action="autonoleggio.php" method="POST">
        <input type="hidden" name="scelta" value="1">
        <label for="targa">Targa:</label>
        <input type="text" name="targa" required><br>
        <label for="marca">Marca:</label>
        <input type="text" name="marca" required><br>
        <label for="modello">Modello:</label>
        <input type="text" name="modello" required><br>
        <label for="nPosti">Numero Posti:</label>
        <input type="number" name="nPosti" required><br>
        <input type="submit" value="Aggiungi Veicolo">
    </form>

    <h2>Elimina Veicolo</h2>
    <form action="autonoleggio.php" method="POST">
        <input type="hidden" name="scelta" value="2">
        <label for="codice">Codice:</label>
        <input type="number" name="codice" required><br>
        <input type="submit" value="Elimina Veicolo">
    </form>

    <h2>Ricerca Veicolo per Codice</h2>
    <form action="autonoleggio.php" method="POST">
        <input type="hidden" name="scelta" value="4">
        <label for="codice">Codice:</label>
        <input type="number" name="codice" required><br>
        <input type="submit" value="Ricerca Veicolo">
    </form>

    <h2>Inventario</h2>
    <form action="autonoleggio.php" method="POST">
        <input type="hidden" name="scelta" value="9">
        <input type="submit" value="Mostra Inventario">
    </form>
</body>
