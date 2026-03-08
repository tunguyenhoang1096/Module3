package ex2.ra.presentation;

import ex2.ra.entity.Cat;
import ex2.ra.entity.Dog;
import ex2.ra.entity.Pet;

import java.util.Scanner;

public class PetManagement {
    static Pet[] pets = new Pet[100];
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*********************QUẢN LÝ THÚ CƯNG********************");
            System.out.println("1. Hiển thị danh sách thú cưng");
            System.out.println("2. Thêm thú cưng");
            System.out.println("3. Gọi tiếng kêu");
            System.out.println("4. Xóa thú cưng");
            System.out.println("5. Tìm thú cưng theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    displayPetInfo();
                    break;
                case 2:
                    addPet(sc);
                    break;
                case 3:
                    speak();
                    break;
                case 4:
                    deletePet(sc);
                    break;
                case 5:
                    searchPetByName(sc);
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Mời chọn từ 1-6");
            }
        }while (true);
    }

    // Hiển thị danh sách thú cưng
    public static void displayPetInfo(){
        if(size==0){
            System.out.println("Danh sách rỗng");
        }
        else {
            for (int i = 0; i < size; i++) {
                pets[i].displayData();
            }
        }
    }

    // Thêm thú cưng
    public static void addPet(Scanner sc){
        Pet pet;
        while (true){
            System.out.println("1. Thêm dog");
            System.out.println("2. Thêm cat");
            int type = Integer.parseInt(sc.nextLine());
            if(type==1){
                pet = new Dog();
                break;
            }
            else if (type==2) {
                pet = new Cat();
                break;
            }else
                System.out.println("Lựa chọn k đúng");
        }
        pet.inputData(sc,pets,size);
        pets[size] = pet;
        size++;
        System.out.println("Thêm thú cưng thành công!");
    }

    // Gọi tiếng kêu
    public static void speak(){
        for (int i = 0; i < size; i++) {
            pets[i].displayData();
            pets[i].speak();
        }
    }

    // Xóa thú cưng
    public static void deletePet(Scanner sc){
        System.out.println("Nhập mã thú cưng: ");
        String deleteId = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if(pets[i].getPetId().toLowerCase().equals(deleteId.toLowerCase())){
                for (int j = i; j < size-1; j++) {
                    pets[j] = pets[j+1];
                }
                    found = true;
                    size--;
                    break;
            }
        }
        if(found)
            System.out.println("Xóa thú cưng thành công");
        else
            System.out.println("Không tìm thấy thú cưng");
    }

    // Tìm thú cưng theo tên
    public static void searchPetByName(Scanner sc){
        System.out.println("Nhập tên thú cưng cần tìm: ");
        String searchName = sc.nextLine();
        boolean found = false;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(pets[i].getPetName().toLowerCase().contains(searchName.toLowerCase())){
                pets[i].displayData();
                found=true;
                count++;
            }
        }
        if(found)
            System.out.println("Tìm thấy "+count+" thú cưng "+searchName);
        else
            System.out.println("Không tìm thấy thú cưng "+searchName);

    }

}
