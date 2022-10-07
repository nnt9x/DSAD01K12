package day7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        managerStudent.insertStudent(new Student(10, "Nguyen Van A","HN"));
        managerStudent.insertStudent(new Student(12, "Nguyen Van B","HN"));

        System.out.println("Nhap id can tim: ");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        scanner.close();

        Student s = managerStudent.findById(id);
        if(s == null){
            System.out.println("Khong tim thay");
        }
        else {
            System.out.println(s);
        }
    }
}
