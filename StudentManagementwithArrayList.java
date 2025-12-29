import java.util.Scanner;
import java.util.ArrayList;


class Student{
    private String name;
    private int rollno;
    private int age;

    Student(String name, int rollno, int age)
    {
    this.name = name;
    this.rollno = rollno;
    this.age = age;
    }
    public int getRollNo(){
        return rollno;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age>0){
            this.age= age;
        }
        else{
            System.out.println("enter valid age");
        }
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
        else if(choice == 2){
            System.out.println("Enter roll no. to delete");
            int rno = sc.nextInt();
            boolean found = false;
            for (int i = 0 ; i < students.size(); i++){
            if(students.get(i).getRollNo() == rno){
                students.remove(i);
                System.out.println("Deleted successfully");
                found = true;
                break;
            }
           
        }
        if(!found){
            System.out.println("Roll not present to delete");
        }
        }

        else if(choice == 3){
            System.out.println("Enter roll no to update");
            int rno = sc.nextInt();
            sc.nextLine();
            boolean found = false; 
            for(int i = 0; i < students.size(); i++){
                if(students.get(i).getRollNo() == rno){
                    System.out.println("Enter student name:");
                    String newName = sc.nextLine();    
                    students.get(i).setName(newName);

                         
                    System.out.println("Enter age:");
                     int newAge = sc.nextInt();
                    students.get(i).setAge(newAge);
                   
                     sc.nextLine();
                    found = true;
                    break;
                }
                

            }
            if(!found){
                System.out.println("Roll not present");
            }
        }
        else if(choice == 4){
            if( students.isEmpty()){
                System.out.println("Students not available");
            }
            else{
        System.out.println("\nStudent list: ");
        for(Student s : students){
            s.display();
        }

        }
    }
        else if(choice == 5){
            System.out.println("Exiting...");
            break;
        }
        else{
            System.out.println("Invalid choice");
        }
        }
    }
}
         
