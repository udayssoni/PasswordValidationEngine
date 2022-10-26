package org.mycode;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public class PasswordValidator {

    private static List<Rule> BASIC_RULES = asList(
            new LongerThan(8),
            new ContainsUpperCaseChars(),
            new ContainsLowerCaseChars(),
            new ContainsNumeric());
    private List<Rule> rules;

    public PasswordValidator(List<Rule> rules) {
        this.rules = new ArrayList<>(rules);
    }

    public static PasswordValidator build() {
        List<Rule> rules = new ArrayList<Rule>(BASIC_RULES);
        return new PasswordValidator(rules);
    }

    public boolean isValid(String password) {


        if (password == null) {
            return false;
        }
        int ok_count = 1;  // Password is not null , hence it matched with one condition.
        for (Rule rule : BASIC_RULES) {
            if (rule.isMatched(password).isValidationStatus() == Boolean.TRUE) {
                ok_count++;
            }

            if (rule instanceof ContainsLowerCaseChars
                    && rule.isMatched(password).isValidationStatus() == Boolean.FALSE) {
                return false;
            }
        }
        if (ok_count >= 3) {
            return true;
        }

        return false;
    }

}