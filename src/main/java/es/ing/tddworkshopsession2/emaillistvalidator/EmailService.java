package es.ing.tddworkshopsession2.emaillistvalidator;

import org.springframework.util.StringUtils;

import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmailService {

    private static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public String validateEmails(List<String> mails) {
        if (mails.isEmpty() || mails.size() > 10 || !allMailsAreValid(mails) || hasRepeatedMails(mails)) {
            throw new InvalidParameterException();
        } else {
            return String.join(",", mails);
        }
    }

    private boolean allMailsAreValid(List<String> mails) {
        for (String mail : mails) {
            if (!mail.matches(EMAIL_REGEX)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasRepeatedMails(List<String> mails) {
        for (String mail : mails) {
            if (Collections.frequency(mails, mail) > 1) {
                return true;
            }
        }
        return false;
    }
}
