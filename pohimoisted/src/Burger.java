public class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;

    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
}
    public Double valiLisand1(String lisand1, Double lisand1Hind) {
        this.lisand1 = lisand1;
        this.lisand1Hind = lisand1Hind;

        System.out.println("Lisand1 " + this.lisand1);
        return this.lisand1Hind;
    }

    public Double valiLisand2(String lisand2, Double lisand2Hind) {
        this.lisand2 = lisand2;
        this.lisand2Hind = lisand2Hind;

        System.out.println("Lisand2 " + this.lisand2);
        return this.lisand2Hind;
    }

    public Double valiLisand3(String lisand3, Double lisand3Hind) {
        this.lisand3 = lisand3;
        this.lisand3Hind = lisand3Hind;

        System.out.println("Lisand3 " + this.lisand3);
        return this.lisand3Hind;
    }

    public Double valiLisand4(String lisand4, Double lisand4Hind) {
        this.lisand1 = lisand4;
        this.lisand1Hind = lisand4Hind;

        System.out.println("Lisand4 " + this.lisand4);
        return this.lisand4Hind;
    }

    public void koostaBurger() {
        System.out.println("Burger on valmis ");
        Double burgeriHindKokku = this.hind + this.lisand1Hind + this.lisand2Hind + this.lisand3Hind + this.lisand4Hind;
        System.out.println("Burgeri hind on " + burgeriHindKokku + "€ ");
    }

    public String getSai() {
        return sai;
    }

    public Double getHind() {
        return hind;
    }

    public void setHind(Double hind) {
        this.hind = hind;
    }

    public Double getLisand1Hind() {
        return lisand1Hind;
    }

    public Double getLisand2Hind() {
        return lisand2Hind;
    }

    public Double getLisand3Hind() {
        return lisand3Hind;
    }

    public Double getLisand4Hind() {
        return lisand4Hind;
    }

    public String getLiha() {
        return liha;
    }

    public void setLiha(String liha) {
        this.liha = liha;
    }

    public void setSai(String sai) {
        this.sai = sai;
    }
}
