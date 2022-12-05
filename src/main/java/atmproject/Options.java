package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    boolean flag = true;
    HashMap<Integer,Integer> data =new HashMap<>();

    public void login(){
        System.out.println("Techproed ATM ye hos geldiniz");

        do {
            data.put(12345,1234);
            data.put(23456,2345);
            data.put(34567,3456);
            data.put(45678,4567);

            try {
                System.out.println("hesap numaranizi giriniz");
                setAccountNumber(input.nextInt());
                System.out.println("lutfen pin numaranizi giriniz");
                setPinNumber(input.nextInt());

            }catch (Exception e){
                System.out.println("yanlis karakter girdiniz lutfen sadece rakam giriniz vey Q basip cikabilirsiniz");
                input.nextLine(); // arada bosluk koydu.
                String exit = input.next();

                if (exit.equalsIgnoreCase("Q")){
                    flag=false;
                }

            }

            int count =0;
            for(Map.Entry<Integer,Integer> w: data.entrySet()){

                if (w.getKey().equals(getAccountNumber())&&w.getValue().equals(getPinNumber())){

                    getAccountTypes();// hesap islemlerine gidiniz
                }else {
                    count++;
                }

            }
            if (count==data.size()){
                System.out.println("yanlis hesap numarasi veya pin girdiniz");
            }




        }while (flag);

    }

    //Checking hesap islemleri => vadesiz hesap islemleri
    public void checkingOperations(){
        do {
            displayMessage();
            int option = input.nextInt();
            if(option == 4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Checking hesabinizda kalan bakiye: "+moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek! Lutfen 1,2,3 veya 4 u kullaniniz");
            }
        }while (true);
        getAccountTypes();
    }
    //vadeli hesap islemleri
    public void savingOperations(){
        do {
            displayMessage();
            int option = input.nextInt();
            if(option == 4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Saving hesabinizda kalan bakiye: "+moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek! Lutfen 1,2,3 veya 4 u kullaniniz");
            }
        }while (true);
        getAccountTypes();
    }


    //Ilgili hesabi seciniz!
    public void getAccountTypes(){
        System.out.println("Işlem yapmak istediginiz hesabi seciniz");
        System.out.println("1: Checking account"); //vadesiz hesap
        System.out.println("2: Saving account"); //vadeli hesap
        System.out.println("3: Quit");

        int option = input.nextInt();

        switch (option){

            case 1:
                System.out.println("Checking/vadesiz hesabinizdasiniz");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving/vadeli hesabinizdasiniz");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinemizi kullandiginiz icin tesekkur ederiz");
                flag=false;
            default:
                System.out.println("yanlis secenek lutfen 1.2 veya 3 u kullaniniz");


        }


    }
    //kisi icin secenekleri goruntule
    public void displayMessage(){
        System.out.println("Option seciniz!");
        System.out.println("1: View Balance");// / bekiyenizi kontrol ediniz
        System.out.println("2: Withdraw");// para cekme
        System.out.println("3: Deposit"); //para yatirma
        System.out.println("4: Exit");//islemi sonlandir
    }

}
