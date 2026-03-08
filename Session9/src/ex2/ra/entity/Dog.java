package ex2.ra.entity;

public class Dog extends Pet{
    // Constructor
    public Dog() {
    }

    public Dog(String petId, String petName, int age) {
        super(petId, petName, age);
    }

    // Ghi đè phương thức speak()
    @Override
    public void speak() {
        System.out.println("Gâu Gâu");
    }
}
