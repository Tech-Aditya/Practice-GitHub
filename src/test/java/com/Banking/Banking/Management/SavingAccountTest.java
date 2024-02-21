package com.Banking.Banking.Management;

import com.Banking.Banking.Management.Banking.SavingAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingAccountTest {
    @Test
    public void testSavingAccountInterestCalculation() {
        SavingAccount account = new SavingAccount("Rohit Sharma", 123456789L, 25000.0, 35, 5.0);
        account.showInterest();
        assertEquals(1250.0, account.balance * 5.0 / 100);
    }
}
