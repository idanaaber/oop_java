import com.sun.org.apache.xpath.internal.SourceTree;

public class Tervitus {
    public String tervitusTekst;

    public Tervitus(String t) {
        this.tervitusTekst = t;
    }

    public Tervitus() {
        this.tervitusTekst = "...";
    }

    public void tervita(){
        System.out.println(tervitusTekst);

    }


}
