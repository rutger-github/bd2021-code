package belastingdienst.rjduistermaat.diinjector.bank.core;

import belastingdienst.rjduistermaat.diinjector.shared.core.logger.LoggerInterface;

public class TransferMoneyService {
    private final TransferMoneyRepositoryInterface transferMoneyRepository;
    private final LoggerInterface logger;

    public TransferMoneyService(
            TransferMoneyRepositoryInterface transferMoneyRepository,
            LoggerInterface logger
    ) {
        this.transferMoneyRepository = transferMoneyRepository;
        this.logger = logger;
    }

    public void transfer(BankTransferCommand bankTransferCommand) /*throws InsufficientBalanceException*/ {

//        String fromBankAccountNumber = bankTransferCommand.getFromBankAccountNumber();
//        BigDecimal amountToTransfer = bankTransferCommand.getAmountToTransfer();

//        if (this.minimumBalanceAvailable(fromBankAccountNumber, amountToTransfer) == false) {
//            throw new InsufficientBalanceException();
//        }

        this.logger.warn("warning, money is being transfered");

        this.transferMoneyRepository.transfer();

    }
}
