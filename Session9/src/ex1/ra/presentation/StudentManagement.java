package ex1.ra.presentation;

import ex1.ra.entity.Student;

import java.util.Scanner;

public class StudentManagement {
    static Student[] students = new Student[100];
    static int size = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*********************QUẢN LÝ SINH VIÊN********************");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo mã sinh viên");
            System.out.println("4. Xóa sinh viên theo mã sinh viên");
            System.out.println("5. Tìm sinh viên theo tên sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    displayStudents();
                    break;
                case 2:
                    inputStudentInfo(sc);
                    break;
                case 3:
                    updateStudentInfo(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    searchStudentByName(sc);
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn từ 1-6");
            }
        }while(true);
    }

    // Phương thức hiển thị thông tin sv
    public static void displayStudents(){
        if(size == 0){
            System.out.println("Không có sinh viên nào");
        }
        for (int i = 0; i < size; i++) {
            students[i].displayData();
        }
    }

    // Nhập thông tin sv
    public static void inputStudentInfo(Scanner sc){
        System.out.println("Nhập số sv cần thêm:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ "+(i+1));
            Student student = new Student();
            student.inputData(sc);
            students[size] = student;
            size++;
        }
        System.out.println("Đã thêm "+n+" sinh viên thành công!");
    }

    // Cập nhật thông tin sv
    public static void updateStudentInfo(Scanner sc){
        System.out.println("Nhập mã sinh viên cần cập nhật:");
        String updateId = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if(students[i].getStudentId().equals(updateId)){
                System.out.println("Cập nhật thông tin sinh viên "+(i+1));
                students[i].inputData(sc);
                found=true;
            }
        }
        if (found)
            System.out.println("Cập nhật thông tin thành công!");
        else
            System.out.println("Không tìm thấy sinh viên!");
    }

    // Xóa sv
    public static void deleteStudent(Scanner sc){
        System.out.println("Nhập mã sinh viên cần xóa:");
        String delId = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if(students[i].getStudentId().equals(delId)){
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j+1];
                }
                size--;
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Xóa thành công!");
        else
            System.out.println("Không tìm thấy sv!");
    }

    // Tìm sinh viên theo tên
    public static void searchStudentByName(Scanner sc){
        System.out.println("Nhập tên sinh viên cần tìm:");
        String searchName = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if(students[i].getStudenName().toLowerCase().contains(searchName.toLowerCase())){
                students[i].displayData();
                found = true;
            }
        }
        if (!found)
            System.out.println("Không tìm thấy sinh viên nào!");
    }
}
