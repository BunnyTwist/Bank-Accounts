package org.example;

import javax.swing.*;
import java.math.BigDecimal;

/*

 */


public class BankAccount {
    private BigDecimal accountBalance = new BigDecimal(0.00);
    private String userName;
    private String accountNumber;

    //Constant Variables
    public final BigDecimal ZERO = new BigDecimal(0.00);

    //Getters
    public BigDecimal getAccountBalance() {
        return this.accountBalance;
    }
    public String getUserName() {
        return this.userName;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    //Constructor
    public BankAccount(BigDecimal accountBalance, String userName, String accountNumber) {
        this.accountBalance = accountBalance;
        this.userName = userName;
        this.accountNumber = accountNumber;
    }

    public void deposit(BigDecimal depositAmount) {
        try {
            if( depositAmount.compareTo(ZERO) != 0 || depositAmount.compareTo(ZERO) != -1) {
                this.accountBalance = this.accountBalance.add(depositAmount);
            }
        } catch (ArithmeticException ex) {
            System.out.println("ERROR: Please enter a positive amount to deposit");
        }
    }

    public void withdraw(BigDecimal withdrawAmount) {
        try {
            if( withdrawAmount.compareTo(ZERO) != 0 || withdrawAmount.compareTo(ZERO) != -1) {
                this.accountBalance = this.accountBalance.subtract(withdrawAmount);
            }
        } catch (ArithmeticException ex) {
            System.out.println("ERROR: Please enter a positive amount to deposit");
        }
    }

}
