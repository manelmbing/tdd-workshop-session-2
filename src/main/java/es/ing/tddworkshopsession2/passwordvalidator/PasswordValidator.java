package es.ing.tddworkshopsession2.passwordvalidator;

public class PasswordValidator {
    public boolean validate(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (password.toLowerCase().equals(password)){
            return false;
        }
        return true;
    }
}
