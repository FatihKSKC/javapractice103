package practiceadvance09.interface_maashesaplama;

public class MaasHesapla implements MaasArtir,Vergi {
    @Override
    public double yillikEksta(int calismaYili) {
        return calismaYili * 100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        if (calismaSaati > 160) {
            return (calismaSaati - 160) * 10;
        } else {
            return 0;
        }
    }


    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili >= 10) {
            return brutMaas * 0.30;
        } else {
            return brutMaas * 0.20;
        }
    }

    public double netMaas(double brutMaas, int calismaYili, int calismaSaati){

        return brutMaas+yillikEksta(calismaYili)+saatlikEkstra(calismaSaati)-vergi(brutMaas,calismaYili);
    }

}