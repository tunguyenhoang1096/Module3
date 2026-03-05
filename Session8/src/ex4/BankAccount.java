package ex4;

public class BankAccount implements IBank {
    String accountID;
    double balance;
    String name;
    String phoneNumber;

    public BankAccount(String accountID, double balance, String name, String phoneNumber) {
        this.accountID = accountID;
        this.balance = balance;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Ghi đè phương thức rút tiền
    @Override
    public void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Số dư trong tài khoản k đủ!");
    }

    // Ghi đè phương thức nhận tiền
    @Override
    public void deponsit(double amount) {
        balance += amount;
    }

    // Hàm hiển thị thông tin
    public void displayAcc(){
        System.out.println("Account: "+accountID);
        System.out.println("Balance: "+balance);
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phoneNumber);
    }

}
