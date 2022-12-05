package day04_ifstatement;

import java.util.Scanner;

public class C04_If {

    public static void main(String[] args) {

        Scanner job = new Scanner(System.in);

        System.out.println("lutfen iş unvanınızı giriniz");

        String jobTitle = job.nextLine();

        if (jobTitle.equalsIgnoreCase("qa")){
            System.out.println("quality analyst");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("developer");

        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("business analyst");

        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("project manager");

        }else {
            System.out.println("geçerli bir unvan giriniz");
        }


    }




}
