public class Kujundid {
    public static void main(String[]args) {
        Kujund ring = new Kujund("Ring");
 //       Kujund ruut = new Kujund("Ruut");
  //      Kujund kolmnurk = new Kujund("Kolmnurk");

        ring.valjastaKirjeldus();

 /*     need read ei tööta kuna nimetus on privaatne
        ring.nimetus = "Ruut";
        ring.valjastaKirjeldus();*/

        ring.setNimetus("Ruut");
        ring.valjastaKirjeldus();

        //ruut.valjastaKirjeldus();
        //kolmnurk.valjastaKirjeldus();

        Ristkulik ristkulik = new Ristkulik("Ristkülik", 0.5, 5.0);
        ristkulik.valjastaKirjeldus();
        ristkulik.arvutaPindala(false);
    }

}
