package ex1;

public class Cat extends Animals{
    private String furColor;

    // Constructor
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    //Getter
    public String getFurColor() {
        return furColor;
    }

    //Setter
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    //Ghi đè phương thức hiển thị, hiện thị thêm màu lông của mèo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: "+furColor);
    }

    // Ghi đè phương thức âm thanh, hiển thị âm thanh của mèo
    @Override
    public String sound() {
        return "Meow meow";
    }
}
