import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println ("Quale prodotto vuoi inserire?");
        String sceltaProdotto = scan.nextLine().toLowerCase();
        System.out.println ("Quale è il codice del prodotto?");
        int codice = scan.nextInt();
        scan.nextLine(); //IMPORTANTE
        System.out.println ("Quale è il nome del prodotto?");
        String nome = scan.nextLine();
        System.out.println ("Quale è la marca del prodotto?");
        String marca = scan.nextLine();
        System.out.println ("Quale è il prezzo del prodotto?");
        double prezzo = scan.nextDouble();
        scan.nextLine(); //IMPORTANTE
        System.out.println ("Quale è il valore dell'IVA?");
        double iva = scan.nextDouble();
        scan.nextLine(); //IMPORTANTE

        switch (sceltaProdotto) {

            case "smartphone":
                System.out.println ("Quale è il codice IMEI dello smartphone?");
                String codiceImei = scan.nextLine().toUpperCase();
                System.out.println ("Quale è la quantità di memoria dello smartphone?");
                int quantitaDiMemoria = scan.nextInt();
                scan.nextLine(); //IMPORTANTE

                Smartphone smartphone = new Smartphone (codice, nome, marca, prezzo,
                    iva, codiceImei, quantitaDiMemoria);
                String smartphoneToString = smartphone.toString();
                System.out.println (smartphoneToString);
                 break;

            case "televisore":
                System.out.println ("Quali sono le dimensioni del televisore?");
                int dimensioni = scan.nextInt();
                scan.nextLine(); //IMPORTANTE
                System.out.println ("Il televisore e' smart? Rispondi con 'smart' o 'non smart'");
                String isSmart = scan.nextLine();

                Televisore televisore = new Televisore (codice, nome, marca, prezzo,
                    iva, dimensioni, isSmart);
                String televisoreToString = televisore.toString();
                System.out.println (televisoreToString);
                break;

            case "cuffie":
                System.out.println ("Quale é il colore delle cuffie?");
                String colore = scan.nextLine();
                System.out.println ("Le cuffie sono wireless o cablate? Rispondi con 'wireless' o 'cablate'");
                String connessione = scan.nextLine();

                Cuffie cuffie = new Cuffie (codice, nome, marca, prezzo, iva, colore, connessione);
                String cuffieToString = cuffie.toString();
                System.out.println (cuffieToString);
                break;
            default:
                System.out.println ("Per favore inserisci uno smartphone, un televisore o delle cuffie.");
                
        }

        scan.close();
    }

}
