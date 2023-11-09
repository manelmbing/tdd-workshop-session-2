package es.ing.tddworkshopsession2.passwordvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordValidatorTest {

    /* As System Admin, I need to check if a given password is strong or not
     *
     * Acceptance Criteria:
     * Password must be 8 char long or more
     * Must include capital letters
     * Must include lowercase letters
     * Must include one or more digits
     * Must include one or more special characters
     *
     */

    @Test
    void shouldBeValidIfMeetsAllRequirements() {
        String password = "ABCdef123_";
        PasswordValidator passwordValidator = new PasswordValidator();

        boolean isValid = passwordValidator.validate(password);

        assertTrue(isValid);
    }

    @Test
    void shouldNotBeValidIfIsShorterThanEightChars() {
        String password = "ABCdef";
        PasswordValidator passwordValidator = new PasswordValidator();

        boolean isValid = passwordValidator.validate(password);

        assertFalse(isValid);
    }

}
