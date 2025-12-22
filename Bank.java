class BankAccount{
    int balance = 1000;
    void withdraw(int amount){
        balance -= amount;
        System.out.println("Remaining Balance:"+ balance);
    }
}
class ATM{
    BankAccount bankaccount = new BankAccount();
    void withdrawCash(){
        bankaccount.withdraw(300);
    }
}
public class Bank{
    public static void main(String[] args){
        ATM atm = new ATM();
        atm.withdrawCash();
    }
}