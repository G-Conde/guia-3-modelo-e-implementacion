public class Cilynder extends Circle {
    private Double height = 1.0;

    public Cilynder() {
        super();
    }

    public Cilynder(Double height, Double radio, String colour) {
        super(radio,colour);
        this.height=height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public Double volumen() {
        return area() * this.height;
    }

    public void seeVolumen() {
        System.out.println("volumen del cilindro, " + volumen());
    }

    @Override
    public void seeObject() {
        System.out.println("Radio:" + getRadio() + " Altura:" + getHeight() + " Color:" + getColour());
    }
}
