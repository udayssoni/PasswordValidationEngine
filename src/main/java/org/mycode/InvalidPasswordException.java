package org.mycode;

public class InvalidPasswordException extends  Exception {

    int violation = 0;

    public InvalidPasswordException(int condition)
    {
        super("Invalid password: ");
        violation = condition ;
     }

    public String printMessage()
    {
        switch (violation) {

            // Password length should be
            // greater than 8 characters
            case 1:
                return ("Password length should be"
                        + " between 8 to 15 characters");

            // Password should not be NULL
            case 2:
                return ("Password should not be NULL");

            // Password should contain at least one uppercase letter(A-Z)
            case 3:
                return ("Password should contain at"
                        + " least one uppercase letter(A-Z)");

            // Password should contain// at least one digit(0-9)
            case 4:
                return ("Password should contain"
                        + " at least one digit(0-9)");

            // Password should contain at least
            // one special character ( @, #, %, &, !, $ )
            case 5:
                return ("Password should contain at "
                        + "least one special character");
        }

        return ("");
    }
}


