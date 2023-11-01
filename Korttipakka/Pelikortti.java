package Korttipakka;

public class Pelikortti {
    private String maa;
    private int numero;

    public Pelikortti(){
        this.maa = "";
        this.numero = 0;
    }

    public Pelikortti(String maa, int numero){
        this.maa = maa;
        this.numero = numero;
    }

    public String getMaa() {
        return maa;
    }
    public int getNumero() {
        return numero;
    }
    public void setMaa(String maa) {
        this.maa = maa;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return maa + numero;
    }
}
