package ex9;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập 1 số nguyên dương n: ");
        while (true){
            if (!sc.hasNextInt()){
                System.out.print("Dữ liệu k đúng, mời nhập lại số nguyên dương: ");
                sc.next();
                continue;
            }
            n = sc.nextInt();
            if (n<0){
                System.out.print("Số phải > 0: ");
                continue;
            }
            break;
        }
        // kiểm tra số Amstrong
    }
}
