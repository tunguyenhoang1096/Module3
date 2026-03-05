package ex2;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Car và Bike
        Car car1 = new Car("Toyota",120);
        Car car2 = new Car("Lexus",200);

        Bike bike1 = new Bike("Honda",30);
        Bike bike2 = new Bike("Maji",50);

        // gọi các phương thức để hiển thị thông tin
        car1.start();
        car1.displayInfo();
        car2.start();
        car2.displayInfo();
        bike1.start();
        bike1.displayInfo();
        bike2.start();
        bike2.displayInfo();
    }
}
