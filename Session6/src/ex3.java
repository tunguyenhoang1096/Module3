import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ex3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> lstLicensePlate = new ArrayList<>();
    public static void main(String[] args) {
        int choose = 0;
        do{
            System.out.println("******************QUẢN LÝ BIỂN SỐ XE****************");
            System.out.println("1.Thêm các biển số xe");
            System.out.println("2.Hiển thị danh sách biển số xe");
            System.out.println("3.Tìm kiếm biển số xe");
            System.out.println("4.Tìm kiếm biển số xe theo mã tỉnh");
            System.out.println("5.Sắp xếp biển số xe tăng dần");
            System.out.println("6.Thoát");
            System.out.print("Lựa chọn của bạn: ");
            while (!sc.hasNextInt()){
                System.out.print("Lựa chọn k đúng!, mời chọn lại: ");
                sc.next();
            }
            choose = sc.nextInt();
            sc.nextLine();

            switch (choose){
                case 1:
                    System.out.println("---Thêm mới biển số xe----");
                    inputLicensePlate();
                    break;
                case 2:
                    System.out.println("---Danh sách biển số xe----");
                    displayList();
                    break;
                case 3:
                    System.out.println("---Tìm kiếm chính xác biển số xe---");
                    searchLp();
                    break;
                case 4:
                    System.out.println("----Tìm kiếm biển số xe theo mã tỉnh----");
                    searchLPByProvinceCode();
                    break;
                case 5:
                    System.out.println("---Sắp xếp biển số xe---");
                    sortAsc();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chọn chức năng (1-6)");
            }

        }while(choose!=6);
    }
    // regex kiểm tra định dạng biển số xe
    static final String regex = "^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$";
    // Hàm thêm biển số xe
    public static void inputLicensePlate(){
        while(true){
        System.out.print("Nhập biển số xe: ");
        String licensePlate = sc.nextLine();
            if (licensePlate.matches(regex)){
                System.out.println("Thêm biển số xe thành công!");
                lstLicensePlate.add(licensePlate);
                break;
            }else{
                System.out.println("Biển số k đúng định dạng (VD: 30F-123.12)");
            }
        }
    }
    // Hàm hiển thị danh sách biển số xe
    public static void displayList(){
        if (lstLicensePlate.isEmpty())
            System.out.println("Chưa có biển số xe nào");
        else {
            for (String lp : lstLicensePlate)
                System.out.println(lp);
        }
    }
    // Tìm kiếm chính xác biển số xe
    public static void searchLp(){
        System.out.print("Nhập biển số xe cần tìm: ");
        String licensePlate = sc.nextLine();
            if(lstLicensePlate.contains(licensePlate))
                System.out.println("Tìm thấy biển số "+licensePlate);
            else
                System.out.println("Không tìm thấy biển số "+licensePlate);
    }
    // Tìm kiếm biển số xe theo mã tỉnh
    public static void searchLPByProvinceCode(){
        boolean isExist = false;
        int count = 0;
        String provinceCode;
        System.out.print("Nhập mã tỉnh: ");
        provinceCode = sc.nextLine();
        for (String lp : lstLicensePlate){
            if(lp.startsWith(provinceCode)){
                System.out.println(lp);
                isExist = true;
                count++;
            }
        }
        if(isExist)
            System.out.printf("Tìm thấy %d biển số xe theo mã tỉnh %s\n",count,provinceCode);
        else
            System.out.println("Không tìm thấy biển số nào theo mã tỉnh "+provinceCode);
    }
    // Sắp xếp biển số xe tăng dần
    public static void sortAsc(){
        if (lstLicensePlate.isEmpty())
            System.out.println("Không có biển số xe nào");
        else {
            Collections.sort(lstLicensePlate);
            System.out.println("Đã sắp xếp biển số xe tăng dần !");
        }
    }
}
