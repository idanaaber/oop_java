public class Kujund {

    // tüübi omadused -klassi muutujad
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

    //klassi konstruktor
    public Kujund(String nimi){
        System.out.println("Kujund klassi konstruktor");
        this.nimetus = nimi;
    }
//setterid

    public void setNimetus(String nimi) {
        this.nimetus = nimi;
    }

    public void setNurkadeArv(Integer nurkadeArv) {
        this.nurkadeArv = nurkadeArv;
    }

    public void setNurkadeOlemasolu(Boolean nurkadeOlemasolu) {
        this.nurkadeOlemasolu = nurkadeOlemasolu;
    }

    public void setPindala(Double pindala) {
        this.pindala = pindala;
    }

    //getterid


    public String getNimetus() {
        return nimetus;
    }

    public Boolean getNurkadeOlemasolu() {
        return nurkadeOlemasolu;
    }

    public Integer getNurkadeArv() {
        return nurkadeArv;
    }

    public Double getPindala() {
        return pindala;
    }

    //tüübi tegevused - klassi meetodid
    public void arvutaPindala(){
        System.out.println("Kujund klassi arvutaPindala() meetod");
        System.out.println(this.pindala);

    }

    public void valjastaKirjeldus(){
        System.out.println(this.nimetus);
        this.arvutaPindala();
        System.out.println();
    }
}
