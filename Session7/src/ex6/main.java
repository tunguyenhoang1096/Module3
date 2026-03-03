package ex6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Category> catLst = new ArrayList<>();

    public static void main(String[] args) {
        int choice = 0;
        while (true){
            System.out.println("--------MENU---------");
            System.out.println("1. Thêm mới danh mục");
            System.out.println("2. Hiển thị danh sách danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Có lỗi nhập liệu, vui lòng ktra lại");
                sc.nextLine();
                continue;
            }

            switch (choice){
                case 1:
                    System.out.println("---Thêm mới danh mục---");
                    addCategory();
                    break;
                case 2:
                    System.out.println("---Danh sách danh mục---");
                    displayCat();
                    break;
                case 3:
                    System.out.println("---Cập nhật danh mục---");
                    updateCat();
                    break;
                case 4:
                    System.out.println("---Xóa danh mục---");
                    deleteCat();
                    break;
                case 5:
                    System.out.println("---Tìm kiếm danh mục---");
                    searchByCatName();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn k đúng, mời chọn lại (1-6)");
            }
        }
    }

    // Hàm thêm mới danh mục
    public static void addCategory(){
        System.out.print("Nhập ID danh mục: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên danh mục: ");
        String name = sc.nextLine();
        System.out.println("Nhập miêu tả: ");
        String desc = sc.nextLine();
        catLst.add(new Category(id,name,desc));
        System.out.println("Thêm mới danh mục thành công!");
    }

    // Hàm hiển thị danh sách danh mục
    public static void displayCat(){
        if(catLst.isEmpty()){
            System.out.println("Chưa có danh mục nào!");
            return;
        }
        for (Category c : catLst)
            System.out.println(c);
    }

    // Hàm update danh mục
    public static void updateCat(){
        System.out.print("Nhập ID danh mục cần cập nhật: ");
        String updateID = sc.nextLine();
        for (Category c : catLst){
            if(c.getId().equals(updateID)){
                System.out.print("Tên danh mục mới: ");
                String newName = sc.nextLine();
                System.out.println("Miêu tả: ");
                String newDesc = sc.nextLine();
                c.setName(newName);
                c.setDescription(newDesc);
                System.out.println("Cập nhật danh mục thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy ID nào!");
    }

    // Hàm xóa danh mục
    public static void deleteCat(){
        System.out.print("Nhập ID danh mục cần xóa: ");
        String deleteId = sc.nextLine();
        for (Category c : catLst){
            if(c.getId().equals(deleteId)){
                catLst.remove(c);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy ID danh mục!");
    }

    // Hàm tìm kiếm danh mục theo tên
    public static void searchByCatName(){
        System.out.print("Nhập tên danh mục cần tìm: ");
        String searchName = sc.nextLine().trim().toLowerCase();
        boolean found = false;
        for (Category c : catLst){
            if(c.getName().toLowerCase().contains(searchName)){
                System.out.println(c);
                found = true;
            }
        }
        if(!found)
            System.out.println("Không tìm thấy tên danh mục!");
    }
}
