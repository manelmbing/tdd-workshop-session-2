package es.ing.tddworkshopsession2.emaillistvalidator;

import java.security.InvalidParameterException;
import java.util.List;

public class EmailService {
    public String validateEmails(List<String> mails) {
        if (mails.isEmpty()) {
            throw new InvalidParameterException();
        } else {
            return mails.get(0);
        }
    }
}