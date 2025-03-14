public class Televisore extends Prodotto {

    private int dimensioni;
    private boolean isSmart;

    public Televisore (int codice, String nome, String marca, Double prezzo, double iva,
        int dimensioni, boolean isSmart) {

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

    public boolean isIsSmart() {
        return isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Televisore [" + super.toString() + ", dimensioni=" + dimensioni + 
            ", isSmart=" + isSmart + "]";
    }

}
