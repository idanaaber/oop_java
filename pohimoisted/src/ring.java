public class ring {
    public Double raadius;
    public Double x;
    public Double y;

    public ring() {
        this.raadius = 0.0;
    }

    public ring(Double r) {
        this.raadius = r;
    }

    public void pindala(){
        Double ringipindala = Math.PI * Math.pow(raadius, 2);
        System.out.println("Antud ringi pindala on " + Math.round(ringipindala * 100)/100.0);
    }
}
