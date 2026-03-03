package ex1;

public class main {
    public static void main(String[] args) {
        //Tạo đối tượng rectangle k có tham số
        Rectangle rect1 = new Rectangle();
        System.out.println("Hình chữ nhật 1");
        rect1.display();

        // Tạo đối tượng rectangle truyền tham số
        Rectangle rect2 = new Rectangle(3,4);
        System.out.println("Hình chữ nhật 2");
        rect2.display();
    }
}
