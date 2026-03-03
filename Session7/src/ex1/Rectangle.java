package ex1;

public class Rectangle {
    private double length;
    private double width;

    // constructer mặc định
    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }
    // constructor truyền tham số
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    // Hàm tính diện tích
    public double getArea(){
        return length * width;
    }
    // Hàm tính chu vi
    public double getPerimeter(){
        return 2 * (length + width);
    }
    // Hàm hiển thị
    public void display(){
        System.out.println("Chiều dài: "+length);
        System.out.println("Chiều rộng: "+width);
        System.out.println("Chu vi: "+getPerimeter());
        System.out.println("Chiều dài: "+getArea());
    }
}
