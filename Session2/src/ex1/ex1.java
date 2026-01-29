package ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // nhập 1 số bất kỳ từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên bất kỳ: ");
        int n = sc.nextInt();
        // kiểm tra số vừa nhập
        if(n==0){
            System.out.println("Số không phải chẵn cũng không phải lẻ");
        }else if(n%2==0) {
            System.out.printf("%d là số chẵn",n);
        }else {
            System.out.printf("%d là số lẻ",n);
        }
        sc.close();
    }
}
