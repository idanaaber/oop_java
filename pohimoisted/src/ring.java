public class ring {
    public Double raadius;
    public Double x;
    public Double y;

    public ring() {
        this.raadius = 0.0;
    }

    public void pindala(){
        Double s = 3.14 * raadius * raadius;
        System.out.println(s);
    }
}
