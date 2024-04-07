public class Main {
    public static void main(String[] args) {
        Cilynder c1 = new Cilynder();
        c1.seeVolumen();
        c1.seeObject();
        Cilynder c2= new Cilynder(5.0,3.0,"blue");
        c2.seeVolumen();
        c2.seeObject();
        String aToString = c2.toString();
        System.out.println(aToString);
    }
}