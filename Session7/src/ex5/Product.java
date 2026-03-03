package ex5;

public class Product {
    private String id;
    private String name;
    private double price;

    //Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Hàm hiển thị thông tin sản phẩm
    public void showProductInfo() {
        System.out.println(
                "Id: " + id + "\t" +
                "Tên:" + name + "\t" +
                "Giá: " + price);
    }
}
