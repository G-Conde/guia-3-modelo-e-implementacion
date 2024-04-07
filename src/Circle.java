public class Circle {
    private Double radio = 1.0;
    private String colour = "red";

    public Circle() {
    }

    public Circle(Double radio, String colour) {
        this.radio = radio;
        this.colour = colour;
    }
    @Override
    public String toString(){
        return "Circulo: radio=" + radio + ", colour=" + colour;
    }

    public Double getRadio() {
        return radio;
    }

    public String getColour() {
        return colour;
    }

    public Double area() {
        return Math.PI * radio * radio;
    }

    public void seeObject() {
        System.out.println("[La figura circulo " + getColour() + " tiene un radio:" + getRadio() + " y un area " + area() + "]");
    }


}
