import java.text.NumberFormat;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // nhập thông tin
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();
        System.out.println("Giá sản phẩm: ");
        float productPrice = sc.nextFloat();
        System.out.println("Số lượng sản phẩm: ");
        int quantity = sc.nextInt();
        System.out.println("Khách có thẻ thành viên hay không (true/false): ");
        boolean isNumber = sc.nextBoolean();

        // tính tổng tiền
        double totalPrice = quantity * productPrice;
        double decrease = isNumber ? productPrice * 0.1 : 0;
        double vat = (totalPrice - decrease) * 0.08;
        double totalAmount = totalPrice - decrease + vat;

        // in kết quả
        System.out.println("========Hóa đơn==========");
        System.out.println("Khách hàng: "+customerName);
        System.out.println("Sản phẩm: "+productName);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Giá: "+nf.format(productPrice));
        System.out.println("Số lượng: "+quantity);
        System.out.println("Giảm giá thành viên(10%): "+nf.format(decrease));
        System.out.println("Tiền VAT(8%): "+nf.format(vat));
        System.out.println("Tổng thanh toán: "+nf.format(totalAmount));
    }
}
