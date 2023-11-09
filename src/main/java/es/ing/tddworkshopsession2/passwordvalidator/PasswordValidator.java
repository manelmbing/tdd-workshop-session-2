package es.ing.tddworkshopsession2.passwordvalidator;

public class PasswordValidator {
    public boolean validate(String password) {
        if (hasNotMinimumRequiredLength(password)
                || doesNotContainsUppercaseLetters(password)
                || doesNotContainsLowercaseLetters(password)
                || doesNotContainsDigits(password)
                || doesNotContainsSpecialChars(password)) {
            return false;
        }

        return true;
    }

    private static boolean hasNotMinimumRequiredLength(String password) {
        return password.length() < 8;
    }

    private static boolean doesNotContainsUppercaseLetters(String password) {
        return password.toLowerCase().equals(password);
    }

    private static boolean doesNotContainsLowercaseLetters(String password) {
        return password.toUpperCase().equals(password);
    }

    private static boolean doesNotContainsDigits(String password) {
        return !password.matches(".*\\d.*");
    }

    private static boolean doesNotContainsSpecialChars(String password) {
        return !password.matches(".*[^a-zA-Z0-9].*");
    }
}
