import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
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
        // hiển thị mảng
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arrInt));
        // sắp xếp mảng (bubbleSort) theo thứ tự giảm dần
        bubbleSort(arrInt);
        System.out.print("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(arrInt));

    }
        // Hàm sắp xếp nổi bọt (bubble Sort)
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j=0; j < arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
