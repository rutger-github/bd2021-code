package belastingdienst.rjduistermaat.labs.dicontainer.bank.core;

import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InsufficientBalanceException;

public class TransferMoneyService {
    private final TransferMoneyRepositoryInterface transferMoneyRepository;

    public TransferMoneyService(TransferMoneyRepositoryInterface transferMoneyRepository) {
        this.transferMoneyRepository = transferMoneyRepository;
    }

    public void transfer(BankTransferCommand bankTransferCommand) throws InsufficientBalanceException {

//        String fromBankAccountNumber = bankTransferCommand.getFromBankAccountNumber();
//        BigDecimal amountToTransfer = bankTransferCommand.getAmountToTransfer();

//        if (this.minimumBalanceAvailable(fromBankAccountNumber, amountToTransfer) == false) {
//            throw new InsufficientBalanceException();
//        }

        this.transferMoneyRepository.transfer();

    }
}
