import java.util.Arrays;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // nhập ptu cho mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(arr));

        // nhập số x để tìm kiếm
        System.out.print("Nhập số cần tìm: ");
        int x = sc.nextInt();

        // tìm kiếm tuyến tính
        int linearResult = linearSearch(arr,x);
        if(linearResult != -1)
            System.out.println("Tìm kiếm tuyến tính: Tìm thấy "+x+" trong mảng tại vị trí "+linearResult);
        else
            System.out.println("Tìm kiếm tuyến tính: Không tìm thấy "+x+" trong mảng");

        // tìm kiếm nhị phân
        int binaryResult = binarySearch(arr,x);
        if(binaryResult != -1)
            System.out.printf("Tìm kiếm nhị phân: Tìm thấy %d trong mảng tại vị trí %d",x,binaryResult);
        else
            System.out.printf("Tìm kiếm nhị phân: Không tìm thấy %d trong mảng",x);
    }

    // hàm sắp xếp chọn selectionSort
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[maxIndex])
                    maxIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

        }
    }

    // hàm tìm kiếm tuyến tính
    public static int linearSearch(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    // hàm tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
