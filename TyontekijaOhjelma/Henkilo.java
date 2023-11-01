package TyontekijaOhjelma;



public class Henkilo {

    private String nimi;

    private String osoite;

    public Henkilo(){
        this.nimi = "";
        this.osoite = "";
    }

    public Henkilo(String nimi, String osoite){
        this.nimi = nimi;
        this.osoite = osoite;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getNimi() {
        return nimi;
    }

    public String getOsoite() {
        return osoite;
    }
    
    @Override
    public String toString(){
        return "Nimi: " + nimi + ", Osoite: " + osoite;
    }
}
