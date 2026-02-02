import java.text.NumberFormat;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        int choose = 0;
        int totalEmployees = 0;
        double salary;
        double totalSalary = 0;
        double maxOfSalary = 0;
        double minOfSalary = 50000000;
        int inputContinue = 0;
        double bonus = 0;
        double totalBonus = 0;

        while(true){
            System.out.println("***************MENU NHẬP LƯƠNG***************");
            System.out.println("1.  \tNhập lương nhân viên");
            System.out.println("2.  \tHiển thị thống kê");
            System.out.println("3.  \tTính tổng số tiền thưởng cho nhân viên");
            System.out.println("4.  \tThoát");
            System.out.println("Mời nhập lựa chọn: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    do {
                        while (true){ // validate lương
                            System.out.print("Nhập lương của nhân viên: ");
                            salary = sc.nextDouble();
                            if (salary < 0 || salary > 50000000)
                                System.out.println("Lương chỉ từ 0-50tr, mời nhập lại lương!");
                            else
                                break;
                        }

                        // lương nhập đúng
                        totalEmployees++;
                        totalSalary+=salary;
                        if(salary > maxOfSalary)
                            maxOfSalary = salary;
                        if (salary < minOfSalary)
                            minOfSalary = salary;

                        // tính tổng tiền thưởng của nhân viên
                        if(salary < 5000000){
                            bonus = salary*0.05;
                        } else if (salary <= 15000000) {
                            bonus = salary*0.1;
                        }else {
                            bonus = salary*0.15;
                        }
                        totalBonus+=bonus;

                        System.out.print("Nhập 1 để tiếp tục, -1 để thoát: ");
                        inputContinue = sc.nextInt();
                    }while (inputContinue != -1);
                    break;
                case 2:
                    // in kết quả
                    if(totalEmployees==0)
                        System.out.println("Chưa có dữ liệu!");
                    else {

                        System.out.println("Tổng số nhân viên đã nhập: "+totalEmployees);
                        System.out.println("Lương trung bình: "+nf.format(totalSalary/totalEmployees));
                        System.out.println("Lương cao nhất: "+nf.format(maxOfSalary));
                        System.out.println("Lương thấp nhất: "+nf.format(minOfSalary));
                        System.out.println("Tổng tiền lương: "+nf.format(totalSalary));
                    }
                    break;
                case 3:
                    System.out.println("Tổng số tiền thưởng cho nhân viên: "+nf.format(totalBonus));
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn từ 1-4");
            }
        }
    }
}
