package day10_arrays;

public class ArraysMultidimentional {
    public static void main(String[] args) {

        /*
        aynı indekse sahip iç arraydeki  elemanların toplamını yazdırın bir program

        int arr[][] = {{1,2},{3,4,5},{6}}

        int brr[][] = {{7,8,9},{10,1},{12}}


         */

        int arr[][] = {{1,2},{3,4,5},{6}};

        int brr[][] = {{7,8,9},{10,1},{12}};

        int sınır =0;
        int toplam =0;




                if (arr.length<=brr.length){

                    for (int i = 0; i < arr.length ; i++) {

                        sınır =arr[i].length;

                        if (arr[i].length>brr[i].length){
                            sınır = brr[i].length;

                        }
                        for (int j = 0; j <sınır ; j++) {

                            toplam=arr[i][j]+brr[i][j];
                            System.out.println(toplam);

                        }

                    }


                }else {



                }













    }
}
