package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Khởi tạo mảng students chứa các sinh viên
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("An", 20, "SE1", 7.5));
        students.add(new Student("Bình", 21, "SE2", 8.2));
        students.add(new Student("Cường", 19, "SE1", 6.8));
        students.add(new Student("Dũng", 22, "SE3", 9.0));
        students.add(new Student("Hà", 20, "SE2", 5.9));

        // Nhập điểm min và max
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm min: ");
        double min = sc.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = sc.nextDouble();

        // Hiển thị danh sách sv trong khoảng điểm min-max
        boolean found = false;
        for(Student s : students){
            if(s.getAvgScore() >= min && s.getAvgScore() <= max){
                found = true;
                s.showLst();
            }
        }
        if(!found)
            System.out.printf("Không có sinh viên nào có DTB trong khoảng %.1f - %.1f",min,max);

        sc.close();
    }
}
