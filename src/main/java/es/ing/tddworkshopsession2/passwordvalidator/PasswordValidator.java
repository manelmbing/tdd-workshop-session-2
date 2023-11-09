package es.ing.tddworkshopsession2.passwordvalidator;

public class PasswordValidator {
    public boolean validate(String password) {
        if (hasMinimumRequiredLength(password)
                || containsUppercaseLetters(password)
                || containsLowercaseLetters(password)) {
            return false;
        }

        return true;
    }

    private static boolean hasMinimumRequiredLength(String password) {
        return password.length() < 8;
    }

    private static boolean containsUppercaseLetters(String password) {
        return password.toLowerCase().equals(password);
    }

    private static boolean containsLowercaseLetters(String password) {
        return password.toUpperCase().equals(password);
    }
}
