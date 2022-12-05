package day17collectionsmap;

public class EnumRunner {


    public static void main(String[] args) {

        Level oyun = Level.MEDIUM;

        switch (oyun){
            case LOW:
                System.out.println("kolay bir oyub");
                break;
            case MEDIUM:
                System.out.println("orta seviyede bir oyun");
                break;
            case HIGH:
                System.out.println("zor seviyedei bir oyun");
                break;

        }



    }
}
