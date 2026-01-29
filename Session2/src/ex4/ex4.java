package ex4;

import javax.swing.*;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        do {
            System.out.println("Nhập tuổi của bạn: ");
            if(!sc.hasNextInt()){
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0!");
                sc.next();
            }
            else{
                age = sc.nextInt();
                if (age <= 0)
                    System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0!");
            }
        } while (age <= 0);
        System.out.println("Tuổi của bạn: " +age);
    }
}
