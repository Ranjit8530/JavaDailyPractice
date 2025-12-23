import java.util.Scanner;

class BankAccount{
    private int balance;
    private String cust_name;
    private int Acc_no;

    BankAccount(int balance, String cust_name, int Acc_no){
        this.balance = balance;
        this.cust_name = cust_name;
        this.Acc_no = Acc_no;
    }
    void deposit(int amount){
        if(amount > 0){
        balance += amount;
        System.out.println("Deposited successfully, now the current balance is :" +balance);
    }
        else{
            System.out.println("Incorrect amount");
        }
    }
    void withdraw(int amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdrawal succesffuly, current balance is:" +balance);
        }
        else{
            System.out.println("Insuffiicient balance or invalid input");
        }
    }
    void display(){
        System.out.println("Balance is :" +balance);
    }
    int getBalance(){
        return balance;
    }
}
class ATM{
    BankAccount account;
    ATM(BankAccount account){
        this.account = account;
    }
    void deposit(int amt){
        account.deposit(amt);
    }
    void withdraw(int amt){
        account.withdraw(amt);
    }
    void display(){
        account.display();
    }
}
public class BankDemo{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter cust_name");
         String cust_name = sc.nextLine();  
         System.out.println("Enter Acc_no");
         int Acc_no = sc.nextInt();  
         System.out.println("Enter balance");
         int balance = sc.nextInt();  
         sc.nextLine();

        BankAccount acc = new BankAccount(balance, cust_name, Acc_no );

        System.out.println("Welcome "+ cust_name + " your account number is " +  Acc_no +  " and your balance is "+ balance +".");
        ATM atm = new ATM(acc);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("4. EXIT");

   int choice;
    do { 
        // Scanner sc = new Scanner(System.in);
         System.out.println("Enter desire choice");
         choice = sc.nextInt();  
        
        switch (choice) {
            case 1:
                System.out.println("Enter amount");
                atm.deposit(sc.nextInt());   
                break;
            case 2: 
                System.out.println("Enter amount");
                atm.withdraw(sc.nextInt());
                 break;
            case 3:
                 atm.display();
                 break;

            case 4:
                System.out.println("Dear " +cust_name+" your latest balance is "+ acc.getBalance() );
                System.out.println("Exiting");
                break;   
            default:
                System.out.println("Invalid input");
        }
    } while(choice!=4);

}

}