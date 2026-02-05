import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng (số hàng): ");
        int rows = sc.nextInt();
        System.out.println("Nhập kích thước của mảng (số cột): ");
        int cols = sc.nextInt();
        // khai báo mảng theo rows và cols vừa nhập
        int [][] arr2D = new int[rows][cols];
        // nhập từng phần tử của mảng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr["+i+"]["+j+"]= ");
                arr2D[i][j] = sc.nextInt();
            }
        }
        // hiện thị mảng vừa nhập
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println();
        }
        // tính tổng số lẻ và số chẵn
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr2D[i][j] %2 == 0)
                    sumEven += arr2D[i][j];
                else
                    sumOdd += arr2D[i][j];
            }
        }
        System.out.println("Tổng các số chẵn là: "+sumEven);
        System.out.println("Tổng các số lẻ là: "+sumOdd);
    }
}
