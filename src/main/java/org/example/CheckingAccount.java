package org.example;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount implements Billable {

    private final BigDecimal ONE_THOUSAND = new BigDecimal(1000.00);

    private BigDecimal bill =  new BigDecimal(0.00);

    public CheckingAccount(BigDecimal accountBalance, String userName, String accountNumber) {
        super(accountBalance, userName, accountNumber);
    }

    @Override //Maximum withdraw amount for checking accounts is $1000
    public void withdraw(BigDecimal withdrawAmount) {
        try {
            if (withdrawAmount.compareTo(ONE_THOUSAND) != -1) {
                super.withdraw(withdrawAmount);
            }
        } catch (ArithmeticException ex) {
            System.out.println("ERROR: Maximum withdraw amount is $1,000");
        }
    }

    @Override
    public void billAccount(BigDecimal billAmount) {

        try {
            if (billAmount.compareTo(ZERO) > 0) {
                this.bill = billAmount;
                super.withdraw(billAmount);
            }
        }catch (ArithmeticException ex) {
            System.out.println("ERROR: Bill amount must be greater than zero");
        }
    }
    @Override
    public BigDecimal getBill() {
        return this.bill;
    }
}
