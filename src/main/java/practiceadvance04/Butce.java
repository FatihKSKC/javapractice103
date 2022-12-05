package practiceadvance04;

public class Butce {

    public static int butce;
    public int harclik;


    public void harclikAl(int alinanHarclik){
        harclik+=alinanHarclik;

    }


    public void butcedenHarca(int harcanacakMiktar){

        butce-=harcanacakMiktar;
    }


    public void harclikHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;
    }

    public void maasAl(int alinanMaas){
        butce+=alinanMaas;

    }

}
