package es.ing.tddworkshopsession2.emaillistvalidator;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailService {

    private static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public String validateEmails(List<String> mails) {
        if (mails.isEmpty() || mails.size() > 10 ||
                containsNonValidEmails(mails) || hasRepeatedMails(mails)) {
            throw new InvalidParameterException();
        } else {
            return String.join(",", mails);
        }
    }

    private boolean containsNonValidEmails(List<String> mails) {
        return mails.stream()
                .filter(mail -> mail.matches(EMAIL_REGEX))
                .count() != mails.size();
    }

    private boolean hasRepeatedMails(List<String> mails) {
        Set<String> items = new HashSet<>();
        return mails.stream()
                .filter(items::add)
                .count() != mails.size();
    }
}
