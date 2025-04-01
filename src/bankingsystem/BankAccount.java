package bankingsystem;

public class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected float interest;

    public BankAccount(String accountNumber, String accountHolderName, Double balance, float interest){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
         this.balance = balance;
         this.interest = interest;
    }

    public void getBalance(String accountNumber){
        System.out.println("Congrats you have money");

    }

    public BankAccount(BankAccount bankAccount){
        this.accountNumber = bankAccount.accountNumber;
        this.accountHolderName = bankAccount.accountHolderName;
        this.balance = bankAccount.balance;
        this.interest = bankAccount.interest;
    }

}
