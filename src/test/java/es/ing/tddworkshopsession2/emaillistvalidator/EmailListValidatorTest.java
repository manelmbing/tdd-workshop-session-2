package es.ing.tddworkshopsession2.emaillistvalidator;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmailListValidatorTest {

    /*
    *  As System Admin, I need to validate the addresses used to send an email.
    *  Given a list of email addresses
    *  When the list is validated
    *  Then an error is return if list is not compliant, or the list of addresses in a string separated by commas
    *       i.e: "to: address1@email.com, address2@email.com, ..."
    *
    *  Use cases:
    *  + Z: If no address is provided we return an error.
    *  - O: At least one address is needed.
    *  - M: We can send the email to more than one address.
    *  - B: Email cannot be sent to more than 10 addresses.
    *  - I: Addresses must be well-formed: username + @ + server + . + domain.
    *  - E: Addresses can not be repeated, if so return an error.
    *  - S: KISS!
    */

    @Test
    void shouldRaiseAnErrorIfNoAddressIsProvided(){
        EmailService emailService = new EmailService();
        assertThrows(InvalidParameterException.class, () -> emailService.validateEmails(new ArrayList<>()));
    }

    @Test
    void shouldReturnValidEmailIfOneAddressIsProvided(){
        EmailService emailService = new EmailService();

        String result = emailService.validateEmails(List.of("email@domain.com"));

        assertEquals("email@domain.com", result);
    }

}
