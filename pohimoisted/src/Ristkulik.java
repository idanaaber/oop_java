public class Ristkulik extends Kujund {
    //objekti omadused - klassi muutujad
    private Double pikkus;
    private Double laius;
    private Integer nurk;
    public Ristkulik(String nimi, Double p, Double l) {
        this.pikkus = p;
        this.laius = l;
        this.nurk = 90;
        super(nimi);
        System.out.println("Ristküliku klassi konstruktor");
    }
}
