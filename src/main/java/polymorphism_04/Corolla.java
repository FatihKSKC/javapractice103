package polymorphism_04;

public class Corolla extends Araba{
    @Override
    public void motor() {
        super.motor();
    }

    @Override
    public void yakitTuketimi() {
        super.yakitTuketimi();
    }

    @Override
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b;
    }

    @Override
    public Araba Speed() {
        return new Araba();
    }
}
