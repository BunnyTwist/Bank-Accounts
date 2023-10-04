package org.example;

import java.math.BigDecimal;

public interface Billable {

    public void billAccount(BigDecimal billAmount); //Removes a bill amount from the account

    public BigDecimal getBill(); //get bill amount

}
