import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        System.out.println("enter operator:  +  , -  ,  *   , /  ");
        char op = sc.next().charAt(0);

        if (op == '+'){
         System.out.println(a+b);
         } else if(op == '-'){
            System.out.println(a-b);
          } else if (op == '*'){
            System.out.println(a*b);
          } 
          
            else if (op == '/'){
                if (b == 0){
            System.out.println("cannot divide by zero.");}
                else {
                 System.out.println(a/b);}
           } else{
            System.out.println("Incorrect operator");
        }
    }
}