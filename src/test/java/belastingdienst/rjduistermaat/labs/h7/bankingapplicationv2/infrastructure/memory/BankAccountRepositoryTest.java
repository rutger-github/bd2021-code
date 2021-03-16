package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.infrastructure.memory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryTest {
    private BankAccountRepository bankAccountRepository;
    private String bankAccountClient1;
    private String bankAccountClient2;

    @Before
    public void setUp() throws Exception {
        this.bankAccountRepository = new BankAccountRepository(this.getTestBankAccounts());
    }

    @Test
    public void whenTransferAmountFromToBankAccountThenCorrectBalance() {
        this.bankAccountRepository.transfer(this.bankAccountClient1, this.bankAccountClient2, BigDecimal.valueOf(50));
        var balanceClient1 = this.bankAccountRepository.getBalance(this.bankAccountClient1);
        var balanceClient2 = this.bankAccountRepository.getBalance(this.bankAccountClient2);

        Assert.assertEquals(BigDecimal.valueOf(50), balanceClient1);
        Assert.assertEquals(BigDecimal.valueOf(150), balanceClient2);
    }

    @Test
    public void whenWithdrawAmountFromBankAccountThenCorrectBalance() {
        this.bankAccountRepository.withdraw(this.bankAccountClient1, BigDecimal.valueOf(20));
        var balanceClient1 = this.bankAccountRepository.getBalance(this.bankAccountClient1);

        Assert.assertEquals(BigDecimal.valueOf(80), balanceClient1);
    }

    @Test
    public void whenDepositAmountFromBankAccountThenCorrectBalance() {
        this.bankAccountRepository.deposit(this.bankAccountClient1, BigDecimal.valueOf(20));
        var balanceClient1 = this.bankAccountRepository.getBalance(this.bankAccountClient1);

        Assert.assertEquals(BigDecimal.valueOf(120), balanceClient1);
    }

    private Map<String, BigDecimal> getTestBankAccounts() {
        this.bankAccountClient1 = "NL123";
        this.bankAccountClient2 = "BE125";

        Map<String, BigDecimal> bankAccounts = new HashMap<>();
        bankAccounts.put(this.bankAccountClient1, BigDecimal.valueOf(100));
        bankAccounts.put(this.bankAccountClient2, BigDecimal.valueOf(100));

        return bankAccounts;
    }
}