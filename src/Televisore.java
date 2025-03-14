public class Televisore extends Prodotto {

    private int dimensioni;
    private String isSmart;

    public Televisore (int codice, String nome, String marca, Double prezzo, double iva,
        int dimensioni, String isSmart) {

            super (codice, nome, marca, prezzo, iva);
            this.dimensioni = dimensioni;
            this.isSmart = isSmart;

    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public String isIsSmart() {
        return isSmart;
    }

    public void setIsSmart(String isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Televisore [" + super.toString() + ", dimensioni=" + dimensioni + 
            ", isSmart=" + isSmart + "]";
    }

}
