package ex3;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng hình học
        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(4,5);
        Square s1 = new Square(5);

        // Thiết lập màu sắc
        c1.setColor("Blue");
        r1.setColor("Red");
        s1.setColor("White");

        // In ra kết quả
        c1.display();
        System.out.println("-----------");
        r1.display();
        System.out.println("-----------");
        s1.display();

    }
}
