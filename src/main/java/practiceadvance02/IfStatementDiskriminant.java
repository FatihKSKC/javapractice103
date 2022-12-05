package practiceadvance02;

public class IfStatementDiskriminant {
    public static void main(String[] args) {

        /* Günün sorusu: if statement
      katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax^2 + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formulü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */


        int a = 1;
        int b = 4;
        int c =3;

        int delta = b*b-4*a*c;

        if (delta>0){
            System.out.println("iki kök vadır: "+" kök 1= "+(((-b +Math.sqrt(delta))/2*a) )+" kök:2 "+(((-b -Math.sqrt(delta))/2*a) ) );

        } else if (delta==0) {

            System.out.println(-b/(2*a));
        }else System.out.println("kök yoktur");


    }
}
