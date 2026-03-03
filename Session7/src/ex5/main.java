package ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
       static Scanner sc = new Scanner(System.in);
       static ArrayList<Product> products = new ArrayList<>(); // khởi tạo danh sách lưu sản phẩm
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            while (!sc.hasNextInt()){
                System.out.println("Lựa chọn k đúng, mời chọn lại chức năng");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("---Thêm mới sản phẩm---");
                    addProduct();
                    break;
                case 2:
                    System.out.println("---Danh sách sản phẩm---");
                    displayProduct();
                    break;
                case 3:
                    System.out.println("---Cập nhật sản phẩm---");
                    updateProduct();
                    break;
                case 4:
                    System.out.println("---Xóa sản phẩm---");
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Mời chọn lại chức năng (1-5)");
            }
        }while (choice !=5);
    }

    // Hàm thêm mới sản phẩm
    public static void addProduct(){
        System.out.println("Nhập id sản phẩm: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();
        products.add(new Product(id,name,price)); // thêm sản phẩm vào danh sách
        System.out.println("Thêm mới sản phẩm thành công!");
    }

    // Hàm hiển thị danh sách sản phẩm
    public static void displayProduct(){
        if(products.isEmpty())
            System.out.println("Chưa có sản phẩm nào!");
        for (Product p : products)
            p.showProductInfo();
    }

    // Hàm cập nhật sản phẩm theo id
    public static void updateProduct(){
        System.out.print("Nhập id sản phẩm cần update: ");
        String updateID = sc.nextLine();
        for (Product p : products){
            if(p.getId().equals(updateID)){
                System.out.print("Nhập tên mới: ");
                String newName = sc.nextLine();
                System.out.print("Nhập giá mới: ");
                double newPrice = sc.nextDouble();
                p.setName(newName);
                p.setPrice(newPrice);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm!");
    }

    // Hàm xóa sản phẩm theo id
    public static void deleteProduct(){
        System.out.print("Nhập id sản phẩm cần xóa: ");
        String deleteID = sc.nextLine();
        for (Product p : products){
            if(p.getId().equals(deleteID)){
                products.remove(p);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm!");
    }
}
