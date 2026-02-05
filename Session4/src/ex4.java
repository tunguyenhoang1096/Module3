import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ptu của mảng: ");
        int n = sc.nextInt();
        // nhập từng phần tử của mảng
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A["+i+"]= ");
            arrInt[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arrInt));
        // Đảo ngược mảng
        for(int i = 0, j = n-1; i < j; i++, j--){
            int temp = arrInt[i];
            arrInt[i] = arrInt[j];
            arrInt[j] = temp;
        }
        System.out.print("Mảng sau khi đảo ngược là: ");
        System.out.println(Arrays.toString(arrInt));
    }
}
