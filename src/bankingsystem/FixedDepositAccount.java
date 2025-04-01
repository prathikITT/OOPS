package bankingsystem;

import java.util.Date;

public class FixedDepositAccount extends BankAccount {
    protected Date startDate;
    protected Date endDate;

    public FixedDepositAccount(BankAccount bankAccount, Date startDate, Date endDate ) {
        super(bankAccount);
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

