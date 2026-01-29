package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // nhập số nguyên dương n từ bán phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        // khởi tạo biến tổng
        int sum = 0;
        if (n <= 0)
            System.out.println("Số vừa nhập không hợp lệ!");
        else {
            for (int i=0; i<=n; i++){
                sum+= i; // tính tổng mỗi 1 lần lặp
            }
            // hiển thị kết quả
            System.out.println("Tổng từ 1 đến " +n+ " là: " +sum);
        }
        sc.close();
    }
}
