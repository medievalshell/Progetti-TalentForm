package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMain {

    public boolean emailValidator(String email) {
        String regex = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            return true;
        }

        return false;
    }


    public boolean dateFormatValidator(String date) {
        String regex = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[-/.](19|20)\\d\\d";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            return true;
        }

        return false;
    }


    public boolean codiceFiscaleValidator(String cf) {
        String regex = "[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(cf);

        if (matcher.matches()) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {

        MatcherMain mt = new MatcherMain();
        System.out.println(mt.emailValidator("info@corsojava.it"));
        System.out.println(mt.dateFormatValidator("10/12/2023"));
        System.out.println(mt.codiceFiscaleValidator("PRTPPP77P15H501K"));


        String text =
                "<h1>Titolo 1</h1>" +
                        "<p>Testo A</p>" +
                        "<hr/>" +
                        "<p>Testo B</p>" +
                        "<h2>Titolo 2</h2>" +
                        "<p>Testo C</p>";

        /*
         * gruppo 0 - <p>([^<]+)</p>
         * gruppo 1 - <p>([^<]+)</p>
         * gruppo 2 - [^<]+
         */
        String regex = "(<p>([^<]+)</p>)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("gruppi presenti nell'espressione regolare " + regex + ": " + matcher.groupCount());

        System.out.println(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));

        }


    }
}
