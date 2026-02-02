import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int totalStudents =0;
        float totalMark =0;
        float maxOfMark =0;
        float minOfMark =10;
        float mark;
        int inputContinue;
        while (true){
            // hiển thị menu lựa chọn
            Scanner sc = new Scanner(System.in);
            System.out.println("***************MENU NHẬP ĐIỂM***************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    do { // kiểm tra điểm nhập vào
                        while (true) {
                            System.out.print("Nhập điểm của hv: ");
                            mark = sc.nextFloat();
                            if (mark < 0 || mark > 10)
                                System.out.println("Nhập sai điểm, mời nhập lại!");
                            else
                                break;
                        }
                        // Điểm nhập đúng
                        totalStudents++;
                        totalMark += mark;
                        if (mark > maxOfMark)
                            maxOfMark = mark;
                        if (mark < minOfMark)
                            minOfMark = mark;
                        // xếp loại
                        if (mark >= 9)
                            System.out.println("Xuất sắc");
                        else if (mark >= 8)
                            System.out.println("Giỏi");
                        else if (mark >= 7)
                            System.out.println("Khá");
                        else if (mark >= 5)
                            System.out.println("Trung bình");
                        else
                            System.out.println("Yếu");

                        System.out.println("Bấm phím 1 để tiếp tục, -1 để thoát");
                        inputContinue = sc.nextInt();
                    } while (inputContinue != -1);
                    break;
                case 2:
                    if (totalStudents==0)
                        System.out.println("Chưa có dữ liệu");
                    else {
                        System.out.println("Tổng số học viên: "+totalStudents);
                        System.out.println("Tổng điểm: "+totalMark);
                        System.out.println("Điểm trung bình: "+totalMark/totalStudents);
                        System.out.println("Điểm cao nhất: "+maxOfMark);
                        System.out.println("Điểm thấp nhất: "+minOfMark);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Chỉ được lựa chọn từ 1-3!");
            }
        }
    }
}
