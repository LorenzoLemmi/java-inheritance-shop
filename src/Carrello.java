import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println ("Quale prodotto vuoi inserire?");
        String sceltaProdotto = scan.nextLine().toLowerCase();
        System.out.println ("Quale è il codice del prodotto?");
        int codice = scan.nextInt();
        System.out.println ("Quale è il nome del prodotto?");
        String nome = scan.nextLine();
        System.out.println ("Quale è la marca del prodotto?");
        String marca = scan.nextLine();
        System.out.println ("Quale è il prezzo del prodotto?");
        double prezzo = scan.nextDouble();
        System.out.println ("Quale è il valore dell'IVA?");
        double iva = scan.nextDouble();

        switch (sceltaProdotto) {

            case "smartphone":
                System.out.println ("Quale è il cosice IMEI del prodotto?");
                String codiceImei = scan.nextLine();
                System.out.println ("Quale è la quantità di memoria del prodotto?");
                int quantitaDiMemoria = scan.nextInt();

                Smartphone smartphone = new Smartphone (codice, nome, marca, prezzo,
                    iva, codiceImei, quantitaDiMemoria);
                
                break;

            case "televisore":
                
                break;

            case "cuffie":
                break;
            default:
                
        }
    }

}
