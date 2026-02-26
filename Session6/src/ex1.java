import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] mark = new double[100];
        int n = 0;
        int choose = 0;
        do {
            System.out.println("******************QUẢN LÝ ĐIỂM SV****************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");

            System.out.print("Mời nhập lựa chọn: ");
            while(!sc.hasNextInt()){
                System.out.print("Lựa chọn k đúng, mời nhập lại: ");
                sc.next();
            }
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    do {
                        System.out.print("Nhập danh sách sinh viên: ");
                        while (!sc.hasNextInt()){
                            System.out.println("Dữ liệu nhập k đúng, mời nhập số nguyên dương: ");
                            sc.next();
                        }
                        n = sc.nextInt();
                    }while (n <= 0);
                    for (int i = 0; i < n; i++) {
                        do {
                            System.out.print("Nhập điểm SV "+(i+1)+": ");
                            while (!sc.hasNextDouble()){
                                System.out.println("Dữ liệu k đúng, mời nhập lại điểm (0-10): ");
                                sc.next();
                            }
                            mark[i] = sc.nextDouble();
                        }while (mark[i] < 0 || mark[i] > 10);
                    }
                    break;
                case 2:
                    if(n == 0){
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }
                    else {
                        for (int i = 0; i < n; i++) {
                            System.out.println("SV "+(i+1)+": "+mark[i]);
                        }
                    }
                    break;
                case 3:
                    if(n == 0){
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }
                    double totalMark = 0;
                    for (int i = 0; i < n; i++) {
                        totalMark += mark[i];
                    }
                    System.out.println("Điểm trung bình: "+(totalMark / n));
                    break;
                case 4:
                    if(n == 0){
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }
                    double max = mark[0];
                    double min = mark[0];
                    for (int i = 0; i < n; i++) {
                        if(mark[i] > max)
                            max = mark[i];
                        if(mark[i] < min)
                            min = mark[i];
                    }
                    System.out.println("Điểm cao nhất: "+max);
                    System.out.println("Điểm thấp nhất: "+min);
                    break;
                case 5:
                    if(n == 0){
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }
                    int pass = 0, fail = 0;
                    for (int i = 0; i < n; i++) {
                        if(mark[i] >= 5)
                            pass++;
                        else
                            fail++;
                    }
                    System.out.println("Số SV đạt: "+pass);
                    System.out.println("Số SV trượt: "+fail);
                    break;
                case 6:
                    if(n == 0){
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }
                    for (int i = 0; i < n-1 ; i++) {
                        for (int j = i+1; j < n; j++) {
                            if(mark[i] > mark[j]){
                                double temp = mark[i];
                                mark[i] = mark[j];
                                mark[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp điểm tăng dần");
                    break;
                case 7:
                    int excellent = 0;
                    for (int i = 0; i < n; i++) {
                        if (mark[i] >= 8)
                            excellent++;
                    }
                    System.out.println("So SV gioi va xuat sac: " +excellent);
                    break;
                case 8:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Mời chọn từ 1-8");
            }
        }while(choose != 8);
    }
}
