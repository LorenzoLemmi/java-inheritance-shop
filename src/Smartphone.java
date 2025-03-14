public class Smartphone extends Prodotto {

    private String codiceIMEI;
    private int quantitaDiMemoria;

    public Smartphone (int codice, String nome, String marca, Double prezzo, double iva,
        String codiceIMEI, int quantitaDiMemoria) {

            super(codice, nome, marca, prezzo, iva);
            this.codiceIMEI = codiceIMEI;
            this.quantitaDiMemoria = quantitaDiMemoria;

    }

    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public int getQuantitaDiMemoria() {
        return quantitaDiMemoria;
    }

    public void setQuantitaDiMemoria(int quantitaDiMemoria) {
        this.quantitaDiMemoria = quantitaDiMemoria;
    }

    @Override
    public String toString() {
        return "Smartphone [" + super.toString() + ", codiceIMEI=" + codiceIMEI + 
            ", quantitaDiMemoria=" + quantitaDiMemoria + "]";
    }

}
