package belastingdienst.rjduistermaat.labs.h4.elevenproof.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountNumberTest {

    @Test
    void givenValidAccountNumberWhenCreatingEntityThenEntityCreated() {
        AccountNumber accountNumber = AccountNumber.fromString("73.61.60.221");
        Assertions.assertNotNull(accountNumber);
        Assertions.assertEquals("736160221", accountNumber.getAccountNumber());
    }

    @Test
    void givenInValidAccountNumberWhenCreatingEntityThenThrowException() {
        Assertions.assertThrows(InvalidAccountNumberException.class, () -> {
            AccountNumber.fromString("73.62.60.221");
        });
    }
}