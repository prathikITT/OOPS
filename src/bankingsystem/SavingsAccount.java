package bankingsystem;

import java.util.Date;

public class SavingsAccount extends BankAccount {
    protected Date startDate;
    protected int initialBalance;

    public SavingsAccount(BankAccount bankAccount, Date startDate, int initialBalance ){
        super(bankAccount);
        this.startDate = startDate;
        this.initialBalance = initialBalance;
    }
}
