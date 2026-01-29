package ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // nhập số nguyên từ 1-7
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên từ 1-7: ");
        int n = sc.nextInt();
        // kiểm tra số vừa nhập
        switch (n){
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
            default:
                System.out.println("Số vừa nhập không hợp lệ!");
        }
        sc.close();
    }
}
