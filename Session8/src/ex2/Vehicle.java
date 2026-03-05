package ex2;

public abstract class Vehicle {
    private String name;
    private int speed;

    //Costructor
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // Phương thức trừu tượng
    public abstract void displayInfo();

    // Phương thức thông thường
    public void start(){
        System.out.println("Vehicle is starting...");
    }

}
