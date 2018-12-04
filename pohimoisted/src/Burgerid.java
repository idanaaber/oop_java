public class Burgerid {
    public static void main(String[] args) {

        Burger peekoniBurger = new Burger("peekon", "pihv", "tavaline", 10);
        TervislikBurger tervislik = new TervislikBurger("roheline", "20");

        peekoniBurger.valiLisand1("salat", 1);

        peekoniBurger.valiLisand2("tomat", 2);

        peekoniBurger.valiLisand3("muna", 3);

        peekoniBurger.valiLisand4("juust", 4);

       peekoniBurger.koostaBurger();

       tervislik.valiTervislikLisand1("muru", "5");
        tervislik.valiTervislikLisand1("kreekajogurt", "7");


    }
}