public class Cuffie extends Prodotto {

    private String colore;
    private String connessione;

    public Cuffie (int codice, String nome, String marca, Double prezzo, double iva,
        String colore, String connessione) {

            super(codice, nome, marca, prezzo, iva);
            this.colore = colore;
            this.connessione = connessione;

        }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getConnessione() {
        return connessione;
    }

    public void setConnessione(String connessione) {
        this.connessione = connessione;
    }

    

}
