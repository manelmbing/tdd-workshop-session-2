package es.ing.tddworkshopsession2.emaillistvalidator;

import org.springframework.util.StringUtils;

import java.security.InvalidParameterException;
import java.util.List;

public class EmailService {
    public String validateEmails(List<String> mails) {
        if (mails.isEmpty()) {
            throw new InvalidParameterException();
        } else {
            return String.join(",", mails);
        }
    }
}
