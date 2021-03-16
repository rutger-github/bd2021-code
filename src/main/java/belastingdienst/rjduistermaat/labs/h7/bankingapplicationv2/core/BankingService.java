package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core;

import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankDepositCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankTransferCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands.BankWithdrawCommand;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InsufficientBalanceException;

import java.math.BigDecimal;

public class BankingService {
    private final BankAccountRepositoryInterface bankAccountRepository;

    public BankingService(BankAccountRepositoryInterface bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void transfer(BankTransferCommand bankTransferCommand) throws InsufficientBalanceException {

        String fromBankAccountNumber = bankTransferCommand.getFromBankAccountNumber();
        BigDecimal amountToTransfer = bankTransferCommand.getAmountToTransfer();

        if (this.minimumBalanceAvailable(fromBankAccountNumber, amountToTransfer) == false) {
            throw new InsufficientBalanceException();
        }

        this.bankAccountRepository.transfer(
                fromBankAccountNumber,
                bankTransferCommand.getToBankAccountNumber(),
                amountToTransfer
        );

    }

    public void withdraw(BankWithdrawCommand bankWithdrawCommand) throws InsufficientBalanceException {
        String bankAccountNumber = bankWithdrawCommand.getBankAccountNumber();
        BigDecimal amountToWithdraw = bankWithdrawCommand.getAmountToWithdraw();

        if (this.minimumBalanceAvailable(bankAccountNumber, amountToWithdraw) == false) {
            throw new InsufficientBalanceException();
        }

        this.bankAccountRepository.withdraw(bankAccountNumber, amountToWithdraw);

    }

    public void deposit(BankDepositCommand bankDepositCommand) {

        this.bankAccountRepository.deposit(bankDepositCommand.getBankAccountNumber(), bankDepositCommand.getAmountToDeposit());

    }

    public BigDecimal getBalance(String bankAccountNumber) {
        return this.bankAccountRepository.getBalance(bankAccountNumber);
    }

    private boolean minimumBalanceAvailable(String bankAccountNumber, BigDecimal amountToTransfer) {

        BigDecimal fromBankAccountBalance = this.bankAccountRepository.getBalance(bankAccountNumber);

        return fromBankAccountBalance.compareTo(amountToTransfer) > 0;
    }

}
