public class Sirge {
    private String nimetus;
    private Punkt punktA;
    private Punkt punktB;
    private Double pikkus;

    public Sirge(String nimetus, Punkt punktA, Punkt punktB) {
        this.nimetus = nimetus;
        this.punktA = punktA;
        this.punktB = punktB;
        this.setPikkus();
    }

    public void setPikkus() {
        double sulg1 = punktB.getX()-punktA.getX();
        double sulg2 = punktB.getY()-punktA.getY();
        this.pikkus = Math.sqrt(Math.pow(sulg1, 2) + Math.pow(sulg2, 2));
    }

    public void valjastaKirjeldus() {
        System.out.println("Sirge" + this.nimetus + " on pikkusega " + this.pikkus);
    }
}

