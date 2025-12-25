import java.util.Scanner;
import java.util.ArrayList;

public class Array{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        while(true){


       
        int index;
        int element;
        int index1;
        int index2;
        int sum = 0;

            System.out.println("1. Add number ");
            System.out.println("2.Updating Elements");
            System.out.println("3.Add number of array");
            System.out.println("4.Swap the elements");
            System.out.println("5. Remove a number");
            System.out.println("6.View elements");
            System.out.println("7.Exit");


            int choice;
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Do you want to add number in existing array? Enter Y for yes, and N to delete existing array element.");
                    char op = sc.next().charAt(0);
                    
                    if(op == 'y' || op == 'Y'){
                        System.out.print("How many elements do you want to add");
                    int n = sc.nextInt();
                      for(int i = 0; i < n; i++){
            System.out.println("Enter values for index " +(i+1));
            number.add(sc.nextInt());

                    }
                }
                    else if(op == 'N' || op == 'n' ){
                    number.clear();
                    System.out.println("Array elements fully deleted, type 1 for adding new elements");
                }
                    else{
                        System.out.println("Invalid input, Enter Y or N only ");
                    }
                   
        
                break;

                case 2 :
                    System.out.println("At what index you want to update");
                    index = sc.nextInt();
                    System.out.println("Enter the value");
                    element = sc.nextInt();
                    number.set(index, element);
                    System.out.println("Value" +element+ "at index " +index+ "is updated");
                break;

                case 3:
                    System.out.println("Enter 0 for two index sum, 0 for whole array sum");
                    int abc = sc.nextInt();
                if(abc == 1){
                    System.out.println("Enter first index");
                    index1 = sc.nextInt();
                    System.out.println("Enter second index");
                    index2 = sc.nextInt();

                    sum = number.get(index2) + number.get(index1);

                    System.out.println("sum is" +sum);
                }
                   else if( abc == 0) {
                    int count = number.size();
                    for(int i = 0; i < count; i++){
                        
                        sum = sum + number.get(i);
                        
                    }
                    System.out.println("Sum of whole array is " +sum);
                }
                    else{
                        System.out.println("inalid input, enter 0 or 1 only");
                    }
                    
                break;

                case 4:
                    System.out.println("Enter index for you want to swap");
                    index1 = sc.nextInt();
                    int a = number.get(index1);
                    System.out.println("Enter the index you want to swap");
                    index2 = sc.nextInt();
                    int b = number.get(index2);
                    int temp = a;
                     a = b;
                     b = temp;
                     number.set(index1, a);
                     number.set(index2, b);
                     System.out.println("Swapped successfully" +number);
                break;

                case 5:
                    System.out.println("Enter index to remove");
                    index = sc.nextInt();
                    number.remove(index);
                    System.out.println("Number removed succesffuly at index" + index);
                break;

                case 6:
                    System.out.println(number);
                break;

                case 7:
                    System.out.println("Exiting");
                    System.exit(0);
                break;

                default:
                    System.out.println("Invalid input");

            
            }

 
           }
        
        }
}