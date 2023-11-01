package Tuotteet;

public class DVDTuote extends Tuote {
    private int kesto;
    private String ikasuositus;

    public DVDTuote() {
        super();
        this.kesto = 0;
        this.ikasuositus = "";
    }

    public DVDTuote(String tuotekoodi, String nimi, double hinta, int kesto, String ikasuositus){
        super(tuotekoodi, nimi, hinta);
        this.kesto = kesto;
        this.ikasuositus = ikasuositus;
    }

    public String getIkasuositus() {
        return ikasuositus;
    }
    public int getKesto() {
        return kesto;
    }
    public void setIkasuositus(String ikasuositus) {
        this.ikasuositus = ikasuositus;
    }
    public void setKesto(int kesto) {
        this.kesto = kesto;
    }

    @Override
    public String toString() {
        return super.toString() + "Kesto: " + kesto + "Ikäsuositus: " + ikasuositus;
    }
}
