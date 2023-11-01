package TyontekijaOhjelma;

import java.util.Scanner;

public class TyontekijaOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Syötä työntekijan tiedot!");
        System.out.println("Anna nimi: ");
        String nimi = sc.nextLine();
        System.out.println("Anna osoite: ");
        String osoite = sc.nextLine();
        System.out.println("Anna tuntipalkka: ");
        double tuntipalkka = sc.nextDouble();

        Tyontekija tyontekija = new Tyontekija(); // Luodaan tyontekija-olio parametrittomalla konstruktorilla
        tyontekija.setNimi(nimi);
        tyontekija.setOsoite(osoite);
        tyontekija.setTuntipalkka(tuntipalkka);

        // Näytetään työntekijän tiedot get-metodeilla
        System.out.println("TYÖNTEKIJÄTIEDOT");
        System.out.println("Nimi: " + tyontekija.getNimi());
        System.out.println("Osoite: " + tyontekija.getOsoite());
        System.out.println("Tuntipalkka: " + tyontekija.getTuntipalkka());

        // Tai voit tulostaa kaikki tiedot yhdellä kutsulla toString-metodin avulla

        sc.close();
    }
}
