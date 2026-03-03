package ex4;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private  String className;
    private double avgScore;

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public double getAvgScore() {
        return avgScore;
    }

    // Hàm tạo sinh viên
    public Student(String name, int age, String className, double avgScore){
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }
    // Hàm hiển thị
    public void showLst(){
        System.out.println("Tên sv: "+name+ ", tuổi: "+age+", lớp: "+className+", điểm TB: "+avgScore);
    }


}
