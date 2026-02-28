import java.util.Scanner;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        String name = "", email="", password="", phone="";
        do {
            System.out.println("******************QUẢN LÝ NGƯỜI DÙNG****************");
            System.out.println("1.Nhập thông tin người dùng");
            System.out.println("2.Chuẩn hóa họ tên");
            System.out.println("3.Kiểm tra email hợp lệ");
            System.out.println("4.Kiểm tra số điện thoại hợp lệ");
            System.out.println("5.Kiểm tra mật khẩu hợp lệ");
            System.out.println("6.Thoát");
            System.out.print("Mời Nhập lựa chọn: ");
            while (!sc.hasNextInt()){
                System.out.println("Lựa chọn k đúng, mời nhập lại: ");
                sc.next();
            }
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("---Nhập thông tin người dùng---");
                    System.out.println("Họ và tên: ");
                    name = sc.nextLine();
                    System.out.println("Email: ");
                    email = sc.nextLine();
                    System.out.println("Password: ");
                    password = sc.nextLine();
                    System.out.println("Phone: ");
                    phone = sc.nextLine();
                    break;
                case 2:
                    System.out.println("---Chuẩn hóa họ tên---");
                    if (name.isEmpty())
                        System.out.println("Chưa có thông tin người dùng");
                    else
                        System.out.println(isValidName(name));
                    break;
                case 3:
                    System.out.println("---Kiểm tra email hợp lệ--");
                    if (email.isEmpty())
                        System.out.println("Chưa có thông tin email");
                    else {
                        if(isValidEmail(email))
                            System.out.println("Email hợp lệ");
                        else
                            System.out.println("Email không hợp lệ");
                    }
                    break;
                case 4:
                    System.out.println("---Kiểm tra số điện thoại hợp lệ--");
                    if (phone.isEmpty())
                        System.out.println("Chưa có thông tin");
                    else {
                        if(isValidPhone(phone))
                            System.out.println("Số điện thoại hợp lệ");
                        else
                            System.out.println("Số điện thoại k hợp lệ");
                    }
                    break;
                case 5:
                    System.out.println("---Kiểm tra mật khẩu hợp lệ--");
                    if(password.isEmpty())
                        System.out.println("Chưa có thông tin");
                    else {
                        if(isValidPassword(password))
                            System.out.println("Mật khẩu hợp lệ");
                        else
                            System.out.println("Mật khẩu không hợp lệ");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Mời chọn chức năng (1-6)");
            }
        }while (choose != 6);
    }

    // Hàm chuẩn hóa họ tên
    public static String isValidName(String name){
        name = name.trim();
        String[] words = name.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ",words);
    }
    // Hàm kiểm tra email hợp lệ
    public static boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$";
        return email.matches(regex);
    }
    // Hàm kiểm tra số điện thoại hợp lệ
    public static boolean isValidPhone(String phone){
        String regex = "^[09]+[0-9]{8}$";
        return phone.matches(regex);
    }
    // Hàm kiểm tra passwword
    public static boolean isValidPassword(String password){
        String regex = "^(?=.*[a-z])+(?=.*[A-Z])+(?=.*\\d).{8,}$";
        return password.matches(regex);
    }

}
