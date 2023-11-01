package Tuotteet;

public class Tuote {
    private String tuotekoodi;
    private String nimi;
    private double hinta;

    public Tuote(){
        this.tuotekoodi = "";
        this.nimi = "";
        this.hinta = 0.0;
    }

    public Tuote(String tuotekoodi, String nimi, double hinta){
        this.nimi = nimi;
        this.tuotekoodi = tuotekoodi;
        this.hinta = hinta;
    }

    public String getTuotekoodi() {
        return tuotekoodi;
    }
    public void setTuotekoodi(String tuotekoodi) {
        this.tuotekoodi = tuotekoodi;
    }
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public double getHinta() {
        return hinta;
    }
    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public String toString(){
        return "Tuotekoodi: " + tuotekoodi + "Nimi: " + nimi + "Hinta: " + hinta;
    }
}
