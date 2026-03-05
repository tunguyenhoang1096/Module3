package ex3;

public class Square implements Colorable{
    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void display(){
        System.out.println("Square -Side: "+side);
        System.out.println("Color: "+color);
    }
}
