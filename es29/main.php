<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);
class Veicolo
{
    private $targa, $marca, $modello;
    private $nPosti;

    public function __construct($targa, $marca, $modello, $nPosti)
    {
        $this->targa = $targa;
        $this->marca = $marca;
        $this->modello = $modello;
        $this->nPosti = $nPosti;
    }

    public function getTarga()
    {
        return $this->targa;
    }

    public function getMarca()
    {
        return $this->marca;
    }

    public function getModello()
    {
        return $this->modello;
    }

    public function getnPosti()
    {
        return $this->nPosti;
    }
    public function __toString()
    {
        return "Targa: " . $this->targa . ", Marca: " . $this->marca . ", Modello: " . $this->modello . ", Posti: " . $this->nPosti;
    }
}

class Autonoleggio
{
    private $v;

    public function __construct()
    {
        $this->v = array_fill(0, 1000, null);
        $this->ripristinaDaFile("inventario");
    }

    public function aggiungiVeicolo($targa, $marca, $modello, $nPosti)
    {
        $posizione = $this->trovaPrimaPosizioneLibera();
        if ($posizione !== false) {
            $this->v[$posizione] = new Veicolo($targa, $marca, $modello, $nPosti);

            // Salva l'inventario su file
            $this->salvaSuFile("inventario");

            return "Veicolo aggiunto con successo";
        } else {
            return "Non ci sono posti disponibili per aggiungere un veicolo";
        }
    }


    private function trovaPrimaPosizioneLibera()
    {
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] == null) {
                return $i;
            }
        }
        return false;
    }

    public function ricercaVeicoloTarga($targa)
    {
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] != null) {
                if ($this->v[$i]->getTarga() == $targa) {
                    return "Ricerca completata con successo\n" . $this->v[$i];
                }
            }
        }
        return "Veicolo non trovato";
    }

    public function eliminaVeicoloTarga($targa)
    {
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] != null) {
                if ($this->v[$i]->getTarga() == $targa) {
                    $this->v[$i] = null;
                    return "Veicolo eliminato con successo";
                }
            }
        }
        return "Veicolo non trovato";
    }

    public function ricercaVeicoloCodice($codice)
    {
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] != null) {
                if ($this->v[$i]->getCodice() == $codice) {
                    return "Ricerca completata con successo\n" . $this->v[$i];
                }
            }
        }
        return "Veicolo non trovato";
    }

    public function eliminaVeicolo($targa)
    {
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] != null) {
                if ($this->v[$i]->getTarga() == $targa) {
                    $this->v[$i] = null;
                    return "Veicolo eliminato con successo";
                }
            }
        }
        return "Veicolo non trovato";
    }

    public function ricercaVeicoli_nPosti($nPosti)
    {
        $nVeicoliTrovati = 0;
        $result = "";
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] != null) {
                if ($this->v[$i]->getnPosti() == $nPosti) {
                    $nVeicoliTrovati++;
                    $result .= $this->v[$i] . "\n";
                }
            }
        }
        return "Sono stati trovati " . $nVeicoliTrovati . " veicoli con " . $nPosti . " posti\n" . $result;
    }

    public function salvaSuFile($nomeFile)
    {
        // Salvataggio su file di testo
        $textData = "";
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] != null) {
                $textData .= $this->v[$i] . "\n";
            }
        }
        file_put_contents(__DIR__ . "/" . $nomeFile . ".txt", $textData);

        // Salvataggio su file dat
        file_put_contents(__DIR__ . "/" . $nomeFile . ".dat", serialize($this->v));

        return "Inventario salvato con successo";
    }


    public function ripristinaDaFile($nomeFile)
    {
        if (file_exists($nomeFile . ".dat")) {
            $this->v = unserialize(file_get_contents($nomeFile . ".dat"));
            return "Ripristino effettuato con successo";
        }
        return "Il file indicato non esiste";
    }

    public function inventario()
    {
        $marche = array();
        $m = 0;
        for ($i = 0; $i < count($this->v); $i++) {
            if ($this->v[$i] != null) {
                $marche[$m] = $this->v[$i]->getMarca();
                $m++;
            }
        }
        if ($m == 0) {
            return "Non ci sono veicoli";
        }
        $marca = $marche[0];
        $conta = 1;
        for ($i = 1; $i < count($marche); $i++) {
            if ($marche[$i] != $marca) {
                echo $marca . ": " . $conta . "\n";
                $conta = 1;
                $marca = $marche[$i];
            } else {
                $conta++;
            }
        }
        return "Inventario creato con successo";
    }
}
$v0 = new Autonoleggio();
$scelta = isset($_GET['scelta']) ? $_GET['scelta'] : 0;

if ($scelta === '1') {
    $targa = $_GET['targa'];
    $marca = $_GET['marca'];
    $modello = $_GET['modello'];
    $nPosti = intval($_GET['nPosti']);
    echo $v0->aggiungiVeicolo($targa, $marca, $modello, $nPosti);
} elseif ($scelta === '2') {
    $targa = $_GET['targa'];
    echo $v0->eliminaVeicoloTarga($targa);
} elseif ($scelta === '3') {
    $targa = $_GET['targa'];
    echo $v0->eliminaVeicoloTarga($targa);
} elseif ($scelta === '4') {
    $codice = intval($_GET['codice']);
    echo $v0->ricercaVeicoloCodice($codice);
} elseif ($scelta === '5') {
    $targa = $_GET['targa'];
    echo $v0->ricercaVeicoloTarga($targa);
} elseif ($scelta === '6') {
    $nPosti = intval($_GET['nPosti']);
    echo $v0->ricercaVeicoli_nPosti($nPosti);
} elseif ($scelta === '7') {
    $nomeFile = $_GET['nomeFile'];
    echo $v0->salvaSuFile($nomeFile);
} elseif ($scelta === '8') {
    $nomeFile = $_GET['nomeFile'];
    echo $v0->ripristinaDaFile($nomeFile);
} elseif ($scelta === '9') {
    echo $v0->inventario();
}
?>
<!DOCTYPE html>
<html>

<head>
    <title>Autonoleggio</title>
    <link rel="stylesheet" href="error_docs\css-responsive\style.css">
</head>

<body>
    <h1>Autonoleggio</h1>

    <h2>Aggiungi Veicolo</h2>
    <form action="#" method="GET">
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
    <form action="#" method="GET">
        <input type="hidden" name="scelta" value="2">
        <label for="targa">Targa:</label>
        <input type="text" name="targa" required><br>
        <input type="submit" value="Elimina Veicolo">
    </form>

    <h2>Ricerca Veicolo per Codice</h2>
    <form action="#" method="GET">
        <input type="hidden" name="scelta" value="4">
        <label for="codice">Codice:</label>
        <input type="number" name="codice" required><br>
        <input type="submit" value="Ricerca Veicolo">
    </form>

    <h2>Inventario</h2>
    <form action="#" method="GET">
        <input type="hidden" name="scelta" value="9">
        <input type="submit" value="Mostra Inventario">
    </form>
</body>

</html>
