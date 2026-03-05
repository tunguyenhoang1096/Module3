package ex4;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo tài khoản
        BankAccount acc1 = new BankAccount("A001",1000,"Nguyễn Văn A","090999999");
        BankAccount acc2 = new BankAccount("B001",1000,"Nguyễn Văn B","090000088");

        System.out.println("Số dư trước khi chuyển tiền");
        acc1.displayAcc();
        System.out.println("-----------------------");
        acc2.displayAcc();

        double tranferAmount = 300;
        // Thực hiện chuyển tiền với số tiền là 300 từ A sang B
        acc1.withdraw(tranferAmount); // Rút tiền từ tk A
        acc2.deponsit(tranferAmount); // Nạp tiền vào tk B

        // Hiển thị kết quả sau khi chuyển tiền
        System.out.println("Số dư sau khi chuyển tiền");
        acc1.displayAcc();
        System.out.println("-----------------------");
        acc2.displayAcc();
    }
}
