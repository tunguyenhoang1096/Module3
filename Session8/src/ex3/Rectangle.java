package ex3;

public class Rectangle implements Colorable{
    private double width;
    private double length;
    private String color;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void display(){
        System.out.println("Rectangle Width: " +width+ ", Length: "+length);
        System.out.println("Color: " +color);
    }
}
