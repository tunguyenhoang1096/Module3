package ex3;

public class Circle implements Colorable{
    private double radius;
    private String color;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void display(){
        System.out.println("Circle - Radius : " +radius);
        System.out.println("Color: " +color);
    }
}
