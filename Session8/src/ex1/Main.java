package ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách chứa Dog và Cat
        ArrayList<Animals> lstAnimals = new ArrayList<>();

        // Thêm đối tượng Dog và Cat vào danh sách
        lstAnimals.add(new Dog("Husky",3,"Siberian"));
        lstAnimals.add(new Cat("Berus",1000,"purple"));
        lstAnimals.add(new Dog("Shiba",-2,"Japan"));
        lstAnimals.add(new Cat("",1,"White"));

        // hiển thị danh sách và âm thanh của mỗi đối tượng
        for (Animals a : lstAnimals){
            a.displayInfo();
            System.out.println("Âm thanh: " + a.sound());
            System.out.println("----------------------");
        }
    }
}
