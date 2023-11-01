package Tuotteet;

public class KirjaTuote extends Tuote {
    private int sivumaara;
    private String sidosasu;

    public KirjaTuote() {
        super();
        this.sivumaara = 0;
        this.sidosasu = "";
    }

    public KirjaTuote(String tuotekoodi, String nimi, double hinta, int sivumaara, String sidosasu){
        super(tuotekoodi, nimi, hinta);
        this.sivumaara = sivumaara;
        this.sidosasu = sidosasu;
    }

    public void setSivumaara(int sivumaara) {
        this.sivumaara = sivumaara;
    }

    public void setSidosasu(String sidosasu) {
        this.sidosasu = sidosasu;
    }

    public String getSidosasu() {
        return sidosasu;
    }

    public int getSivumaara() {
        return sivumaara;
    }

    @Override
    public String toString(){
        return super.toString() + "Sivumäärä: " + sivumaara + "Sidosasu: " + sidosasu;
    }
}
