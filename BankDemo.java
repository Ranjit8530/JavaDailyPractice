
import java.util.Scanner;
class BankAccount{
    int balance;
    void Deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Deposited successfully, now the current balance is :"+ balance);
    }
    void Withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount");
        int amount = sc.nextInt();
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawal succesffuly, current balance is:" +balance);
        }
        else{
            System.out.println("Insuffiicient balance");
        }
    }
    void displaybalance(){
        System.out.println("Balance is :" +balance);
    }
}
class ATM{
    BankAccount bankaccount1 = new BankAccount();
    void depositcash(){
        bankaccount1.Deposit();
    }
    void Withdraw(){
        bankaccount1.Withdraw();
    }
    void Display(){
        bankaccount1.displaybalance();
    }
}
public class BankDemo{
    public static void main(String[] args){
        ATM card1 = new ATM();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("4. EXIT");

   int a;
    do { 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter desire choice");
         a = sc.nextInt();  
        
        switch (a) {
            case 1:
                card1.depositcash();   
                break;
            case 2: 
                card1.Withdraw();
                 break;
            case 3:
                 card1.Display();
                 break;

            case 4:
                System.out.println("Exiting"); 
                break;   
            default:
                System.out.println("Invalid input");
        }
    } while(a!=4);
}

}