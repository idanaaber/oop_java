public class Magamistuba {
    public static void main(String[] args) {
        //loome 4 seina toa ehitamiseks
        Sein sein1 = new Sein("põhi");
        Sein sein2 = new Sein("lõuna");
        Sein sein3 = new Sein("lääne");
        Sein sein4 = new Sein("ida");

        System.out.println(sein1.getSuund());
        System.out.println(sein2.getSuund());
        System.out.println(sein3.getSuund());
        System.out.println(sein4.getSuund());
    }
}
