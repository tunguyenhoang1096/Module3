package ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên bất kỳ: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            n = Math.abs(n); // lấy trị tuyệt đối của n
            // tách từng số và tính tổng gán vào biến sum
            while(n > 0){
                sum = sum + (n%10);
                n = n / 10;
            }
        // in kết quả
        System.out.printf("Tổng của các chữ số là: %d",sum);
        }else
            System.out.println("Số vừa nhập k hợp lệ");
    }
}
