package com.Banking.Banking.Management;

import com.Banking.Banking.Management.Banking.CurrentAccount;
import com.Banking.Banking.Management.Banking.SavingAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CurrentAccountTest {
    @Test
    public void testWithdrawSufficientFunds() {
        CurrentAccount account = new CurrentAccount("Aditya", 123456789L, 1000.0, 35);
        account.withdraw(500.0);
        assertEquals(500.0, account.balance);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        CurrentAccount account = new CurrentAccount("Ram", 123456789L, 1000.0, 35);
        account.withdraw(1500.0);
        assertEquals(1000.0, account.balance);
    }

    @Test
    public void testWithdrawBelowMinimumBalance() {
        CurrentAccount account = new CurrentAccount("Sunil", 123456789L, 6000.0, 35);
        account.withdraw(1000.0);
        assertEquals(5950.0, account.balance);
    }
}
