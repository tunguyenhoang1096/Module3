package ex2;

public class Car extends Vehicle{
    public Car(String name, int speed){
        super(name, speed);
    }

    // Ghi đè phương thức trừu tượng để in thông tin Car
    @Override
    public void displayInfo() {
        System.out.println("Car name: " +getName());
        System.out.println("Speed: " +getSpeed()+ " km/h");
    }
}
