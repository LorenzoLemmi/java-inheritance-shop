/*Nel progetto java-inheritance-shop creare la classe Prodotto che gestisce i prodotti
dello shop.

Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva

Usate opportunamente i livelli di accesso (public, private), i costruttori, 
i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:

-il codice prodotto sia accessibile solo in lettura
-gli altri attributi siano accessibili sia in lettura che in scrittura

Lo shop gestisce diversi tipi di prodotto:
-Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
-Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
-Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura
delle classi che gestiscono i vari sotto tipi di prodotto. 

Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare
un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone
o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore
opportuno.

Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString
per restituire le informazioni da stampare per ogni classe) */

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto (int codice, String nome, String marca, Double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Prodotto : codice=" + codice + ", nome=" + nome + ", marca=" + marca + 
        ", prezzo=" + prezzo + ", iva=" + iva + "";
    }

}
