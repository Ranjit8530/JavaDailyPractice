import java.util.Scanner;
import java.util.ArrayList;


class Student{
    String name;
    int rollno;
    int age;

    Student(String name, int rollno, int age)
    {
    this.name = name;
    this.rollno = rollno;
    this.age = age;
    }

    void display(){
        System.out.println("Name: "+name+ " rollno:- " +rollno+ " age:- " +age);
    }

}

public class StudentManagementwithArrayList{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         ArrayList<Student> students = new ArrayList<>();
        while(true){
              System.out.println("1. Add Students");
              System.out.println("2.Delete Students");
              System.out.println("3.Update Student");
              System.out.println("4.View Students");
              System.out.println("5.Exit");
       
        int choice = sc.nextInt();
         if (choice == 1){
            System.out.println("How many student you want to add?");
            int n = sc.nextInt();
            sc.nextLine();
        for(int i = 0 ; i < n ; i++){
            
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter roll no :");
        int rollno = sc.nextInt();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();
        Student s1 = new Student(name , rollno , age);
        students.add(s1);
         }
        }
        else if(choice == 4){
        System.out.println("\nStudent list: ");
        for(Student s : students){
            s.display();
        }
    }
        else if(choice == 5){
            System.exit(0);
        }
        else{
            System.out.println("Invalid choice");
        }
        }
    }
}
         
