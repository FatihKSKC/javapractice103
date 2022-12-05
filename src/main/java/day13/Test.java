package day13;

import java.util.Scanner;

public class Test {

    // kullanıcı A Ayse; kullanici B Burak ismini dat olarak girerse çıktı ne olur

    String studentName;
    String year = "2020";
    String studentId;
    static int counter =1000;

    public Test(){

        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        studentName = input.next();
        setStudent();


    }

    private void setStudent() {
        counter++;
        this.studentId = year +""+counter;


    }

    public static void main(String[] args) {

        Test student1 = new Test();
        System.out.println(student1.studentName+student1.studentId);

        Test student2 = new Test();
        System.out.println(student2.studentName+student2.studentId);


    }


}
