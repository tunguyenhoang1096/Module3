import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ptu của mảng: ");
        int n = sc.nextInt();
        // nhập từng phần tử của mảng A
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A["+i+"]= ");
            A[i] = sc.nextInt();
        }
        // hiển thị mảng
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(A));
        // tính tổng các ptu trong mảng
        int sum = 0;
        for(int i: A)
            sum += i;
        // hiển thị tổng
        System.out.println("Tổng các phần tử của mảng là: "+sum);
    }
}
