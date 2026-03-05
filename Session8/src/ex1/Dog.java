package ex1;

public class Dog extends Animals{
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    //Getter
    public String getBreed() {
        return breed;
    }

    //Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Ghi đè phương thức hiển thị, hiển thị thêm thông tin giống chó
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó: "+breed);
    }

    // Ghi đè phương thức sound, hiển thị âm thanh của chó
    @Override
    public String sound() {
        return "woof woof";
    }
}
