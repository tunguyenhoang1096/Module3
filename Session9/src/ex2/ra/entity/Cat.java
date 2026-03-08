package ex2.ra.entity;

public class Cat extends Pet{
    // COnstructor k tham số
    public Cat() {
    }

    // Constructor đầy đủ tham số
    public Cat(String petId, String petName, int age) {
        super(petId, petName, age);
    }

    //Ghi đè phương thức speak()
    @Override
    public void speak() {
        System.out.println("Meo Meo");
    }
}
