package es.ing.tddworkshopsession2.passwordvalidator;

public class PasswordValidator {
    public boolean validate(String password) {
        return hasMinimumRequiredLength(password)
                && doesContainsUppercaseLetters(password)
                && doesContainsLowercaseLetters(password)
                && doesContainsDigits(password)
                && doesContainsSpecialChars(password);
    }

    private static boolean hasMinimumRequiredLength(String password) {
        return password.length() >= 8;
    }

    private static boolean doesContainsUppercaseLetters(String password) {
        return !password.toLowerCase().equals(password);
    }

    private static boolean doesContainsLowercaseLetters(String password) {
        return !password.toUpperCase().equals(password);
    }

    private static boolean doesContainsDigits(String password) {
        return password.matches(".*\\d.*");
    }

    private static boolean doesContainsSpecialChars(String password) {
        return password.matches(".*[^a-zA-Z0-9].*");
    }
}
