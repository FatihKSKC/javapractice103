package practiceadvance07;

public class BMI {

    private double kilo;
    private double boy;


    public BMI() {   // boş consructor olusturduk


    }

    public double getKilo() {
        return kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public BMI(double kilo, double boy) {
        this.kilo = kilo;
        this.boy = boy;

    }

    public void BMIHesapla(){

        double bmi = kilo/(boy*boy);

        System.out.println(bmi);
        if (bmi<18.5){
            System.out.println("zayıf");
        } else if (bmi>=18.5&&bmi<25) {
            System.out.println("normal");

        } else if (bmi>=25&&bmi<30) {
            System.out.println("kilolu");
        } else if (bmi>=30) {
            System.out.println("obez");
        }else System.out.println("gecersiz deger");

    }


    @Override
    public String toString() {
        return "BMI{" +
                "kilo=" + kilo +
                ", boy=" + boy +
                '}';
    }
}
