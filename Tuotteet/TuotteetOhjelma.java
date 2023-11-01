package Tuotteet;

import java.util.Scanner;

public class TuotteetOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Syötä kirjatuotteen tiedot!");
        System.out.println("Anna tuotekoodi: ");
        String tuotekoodi = sc.nextLine();
        System.out.println("Anna nimi: ");
        String nimi = sc.nextLine();
        System.out.println("Anna hinta: ");
        double hinta = sc.nextDouble();
        System.out.println("Anna sivumäärä: ");
        int sivumaara = sc.nextInt();
        sc.nextLine();
        System.out.println("Anna sidosasu: ");
        String sidosasu = sc.nextLine();

        System.out.println("Syötä dvdtuotteen tiedot!");
        System.out.println("Anna tuotekoodi: ");
        String tuotekoodi2 = sc.nextLine();
        System.out.println("Anna nimi: ");
        String nimi2 = sc.nextLine();
        System.out.println("Anna hinta: ");
        double hinta2 = sc.nextDouble();
        System.out.println("Anna kesto(min): ");
        int kesto = sc.nextInt();
        sc.nextLine();
        System.out.println("Anna ikäsuositus: ");
        String ikasuositus = sc.nextLine();

        KirjaTuote kirjatuote = new KirjaTuote();
        
        kirjatuote.setTuotekoodi(tuotekoodi);
        kirjatuote.setNimi(nimi);
        kirjatuote.setHinta(hinta);
        kirjatuote.setSivumaara(sivumaara);
        kirjatuote.setSidosasu(sidosasu);

        DVDTuote dvdtuote = new DVDTuote();

        dvdtuote.setTuotekoodi(tuotekoodi2);
        dvdtuote.setNimi(nimi2);
        dvdtuote.setHinta(hinta2);
        dvdtuote.setKesto(kesto);
        dvdtuote.setIkasuositus(ikasuositus);

        System.out.println("KIRJATUOTTEEN TIEDOT: ");
        System.out.println("Tuotekoodi: " + kirjatuote.getTuotekoodi());
        System.out.println("Nimi: " + kirjatuote.getNimi());
        System.out.println("Hinta: " + kirjatuote.getHinta());
        System.out.println("Sivumäärä: " + kirjatuote.getSivumaara());
        System.out.println("Sidosasu: " + kirjatuote.getSidosasu());

        System.out.println("DVDTUOTTEEN TIEDOT: ");
        System.out.println("Tuotekoodi: " + dvdtuote.getTuotekoodi());
        System.out.println("Nimi: " + dvdtuote.getNimi());
        System.out.println("Hinta: " + dvdtuote.getHinta());
        System.out.println("Kesto(min): " + dvdtuote.getKesto());
        System.out.println("Ikäsuositus: " + dvdtuote.getIkasuositus());


        sc.close();
    }
}
