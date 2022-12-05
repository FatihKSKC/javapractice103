package practiceadvance02;

public class EuroDolarToplami {
    public static void main(String[] args) {


/*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
                Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
                */

String money = "$1 $12 €34 €56 $45 €78";

String[] arrayMoney= money.split(" ");

int dolar = 0;
int euro = 0;

for (String w: arrayMoney){


    if (w.contains("$")){

        dolar+=Integer.parseInt(w.replace("$",""));
    } else  {

        euro+= Integer.parseInt(w.replace("€",""));

    }


}
        System.out.println(dolar+"$");
        System.out.println(euro+"€");


    }
}
