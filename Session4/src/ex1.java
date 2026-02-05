import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập các phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Arr["+i+"]= ");
            arrInt[i] = sc.nextInt();
        }
        //hiện thị mảng vừa nhập
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arrInt));
        // sắp xếp mảng (selectionSort) theo thứ tự giảm dần
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for(int j = i+1; j < n; j++){
                if(arrInt[j] > arrInt[maxIndex] )
                    maxIndex = j;
            }
            int temp = arrInt[maxIndex];
            arrInt[maxIndex] = arrInt[i];
            arrInt[i] = temp;
        }
        System.out.print("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(arrInt));
        // phần tử lớn nhất là phần tử đầu tiên của mảng sau khi sắp xếp
        System.out.print("Phần tử lớn nhất trong mảng là: "+arrInt[0]);
    }
}
