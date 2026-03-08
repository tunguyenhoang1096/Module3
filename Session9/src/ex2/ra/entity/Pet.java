package ex2.ra.entity;

import java.util.Scanner;

public abstract class Pet {
    protected String petId;
    protected String petName;
    protected int age;

    // Constructor
    public Pet() {
    }

    public Pet(String petId, String petName, int age) {
        this.petId = petId;
        this.petName = petName;
        this.age = age;
    }

    // getter, setter

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức nhập thông tin
    public void inputData(Scanner sc, Pet[] pets, int size ){
        //validate mã và kiểm tra duy nhất
        while(true){
            System.out.println("Nhập mã thú cưng (C/D + 3 số):");
            String inputId = sc.nextLine();
            if(!inputId.matches("(C|D)\\d{3}")){
                System.out.println("Mã k đúng định dạng");
                continue;
            }
            boolean isExist = false;
            for (int i = 0; i < size; i++) {
                if(pets[i].getPetId().equals(inputId)){
                    isExist=true;
                    break;
                }
            }
            if (isExist)
                System.out.println("Mã đã tồn tại");
            else {
                this.petId = inputId;
                break;
            }

        }

        // validate tên
        while (true){
            System.out.println("Nhập tên thú cưng (20-50 ký tự):");
            String inputName = sc.nextLine();
            if(inputName.length()<20 || inputName.length()>50)
                System.out.println("Tên phải từ 20-50 ký tự!");
            else {
                this.petName = inputName;
                break;
            }
        }

        // validate tuổi
        while (true){
            System.out.println("Nhập tuổi (>0): ");
            int intputAge = Integer.parseInt(sc.nextLine());
            if(intputAge < 0)
                System.out.println("Tuổi k được âm");
            else {
                this.age = intputAge;
                break;
            }
        }

    }

    // Phương thức hiển thị thông tin
    public void displayData(){
        System.out.printf("Mã: %s | Tên: %s | Tuổi: %d\n",petId,petName,age);
    }

    // Phương thức trừu tượng speak()
    public abstract void speak();
}
