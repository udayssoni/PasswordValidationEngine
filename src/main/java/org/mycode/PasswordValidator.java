package org.mycode;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;


public class PasswordValidator {

    private List<Rule> rules;

    private static List<Rule> BASIC_RULES = asList(
            new LongerThan(8)//,
            /*new ContainsUpperCaseChars(),
            new ContainsLowerCaseChars(),
            new ContainsNumeric()*/);

    public boolean isValid(String password) {
        return rules.stream().allMatch(rule -> rule.IsMatched(password));
    }


    public PasswordValidator(List<Rule> rules) {
        this.rules = new ArrayList<>(rules);
    }


    public static PasswordValidator build() {
        List<Rule> rules = new ArrayList<Rule>(BASIC_RULES);
        return new PasswordValidator(rules);
    }

}