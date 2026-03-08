package ex1.ra.entity;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studenName;
    private int age;
    private String major;

    // Constructor k tham số
    public Student() {
    }

    // Constructor đầy đủ tham số
    public Student(String studentId, String studenName, int age, String major) {
        this.studentId = studentId;
        this.studenName = studenName;
        this.age = age;
        this.major = major;
    }

    // Getter, Setter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudenName() {
        return studenName;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Phương thức nhập thông tin SV
    public void inputData(Scanner sc){
        System.out.println("Mã sv:");
        this.studentId = sc.nextLine();
        System.out.println("Tên sv:");
        this.studenName = sc.nextLine();
        System.out.println("Tuổi:");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Chuyên ngành:");
        this.major = sc.nextLine();
    }

    // Phương thức hiển thị thông tin
    public void displayData(){
        System.out.printf("Mã sv: %s | Tên sv: %s | Tuổi: %d | Chuyên ngành: %s\n",studentId,studenName,age,major);
    }

}
