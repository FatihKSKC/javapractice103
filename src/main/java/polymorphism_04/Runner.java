package polymorphism_04;

public class Runner {
    public static void main(String[] args) {

        Araba car1 = new Araba();
        car1.Speed();
        car1.motor();
        System.out.println(car1.multiply(3,7));
        car1.yakitTuketimi();
    }
}
