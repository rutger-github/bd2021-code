package belastingdienst.rjduistermaat.labs.dicontainer.bank.core;

import belastingdienst.rjduistermaat.labs.dicontainer.shared.core.logger.LoggerInterface;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InsufficientBalanceException;

public class TransferMoneyService {
    private final TransferMoneyRepositoryInterface transferMoneyRepository;
    private LoggerInterface logger;

    public TransferMoneyService(
            TransferMoneyRepositoryInterface transferMoneyRepository,
            LoggerInterface logger
    ) {
        this.transferMoneyRepository = transferMoneyRepository;
        this.logger = logger;
    }

    public void transfer(BankTransferCommand bankTransferCommand) throws InsufficientBalanceException {

//        String fromBankAccountNumber = bankTransferCommand.getFromBankAccountNumber();
//        BigDecimal amountToTransfer = bankTransferCommand.getAmountToTransfer();

//        if (this.minimumBalanceAvailable(fromBankAccountNumber, amountToTransfer) == false) {
//            throw new InsufficientBalanceException();
//        }

        this.logger.warn("warning, money is being transfered");

        this.transferMoneyRepository.transfer();

    }
}
