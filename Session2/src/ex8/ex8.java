package ex8;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên (100-999): ");
        while (!sc.hasNextInt()){
            System.out.print("Dữ liệu nhập k đúng, nhập lại số nguyên: ");
            sc.next();
        }
        int n = sc.nextInt();
        if(n<100 || n>999)
            System.out.println("Số vừa nhập không đúng");
        else{
            int hundreds,tens,units;
            // tách số hàng đơn vị
            units = n%10;
            n = n/10;
            // tách số hàng chục
            tens = n%10;
            n = n/10;
            // tách số hàng trăm
            hundreds = n%10;
            switch (hundreds){
                case 1: System.out.print("một trăm "); break;
                case 2: System.out.print("hai trăm "); break;
                case 3: System.out.print("ba trăm "); break;
                case 4: System.out.print("bốn trăm "); break;
                case 5: System.out.print("năm trăm "); break;
                case 6: System.out.print("sáu trăm "); break;
                case 7: System.out.print("bảy trăm "); break;
                case 8: System.out.print("tám trăm "); break;
                case 9: System.out.print("chín trăm "); break;
            }
            if(tens==0)
                System.out.print("linh ");
            else {
                switch (tens){
                    case 1: System.out.print("mười "); break;
                    case 2: System.out.print("hai mươi "); break;
                    case 3: System.out.print("ba mươi "); break;
                    case 4: System.out.print("bốn mươi "); break;
                    case 5: System.out.print("năm mươi "); break;
                    case 6: System.out.print("sáu mươi "); break;
                    case 7: System.out.print("bảy mươi "); break;
                    case 8: System.out.print("tám mươi "); break;
                    case 9: System.out.print("chín mươi "); break;
                }
            }
            switch (units){
                case 1: System.out.print("một"); break;
                case 2: System.out.print("hai"); break;
                case 3: System.out.print("ba"); break;
                case 4: System.out.print("bốn"); break;
                case 5: System.out.print("năm"); break;
                case 6: System.out.print("sáu"); break;
                case 7: System.out.print("bảy"); break;
                case 8: System.out.print("tám"); break;
                case 9: System.out.print("chín"); break;
            }
        }
    }
}
