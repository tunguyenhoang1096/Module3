package ex7;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // nhập các cạnh của tam giác
        System.out.print("Cạnh a: ");
        while (!sc.hasNextInt()){
            System.out.println("Dữ liệu nhập k đúng, mời nhập lại!");
            sc.next();
            System.out.print("Cạnh a: ");
        }
        int a= sc.nextInt();
        System.out.print("Cạnh b: ");
        while (!sc.hasNextInt()){
            System.out.println("Dữ liệu nhập k đúng, mời nhập lại!");
            sc.next();
            System.out.print("Cạnh b: ");
        }
        int b= sc.nextInt();
        System.out.print("Cạnh c: ");
        while (!sc.hasNextInt()){
            System.out.println("Dữ liệu nhập k đúng, mời nhập lại!");
            sc.next();
            System.out.print("Cạnh c: ");
        }
        int c= sc.nextInt();
        // kiểm tra điều kiện của tam giác
        if(a<=0 || b<=0 || c<=0 || a+b<=c || a+c<=b || b+c<=a)
            System.out.println("Không phải là tam giác");
        else {
            if(a==b && a==c)
                System.out.println("Tam giác đều cạnh bằng " +a);
            else if (a==b || a==c || b==c)
                System.out.println("Tam giác cân");
            else if (a*a==b+c || b*b==a+c || c*c==a+b)
                System.out.println("Tam giác vuông");
            else
                System.out.println("Tam giác thường");
        }
    }
}

