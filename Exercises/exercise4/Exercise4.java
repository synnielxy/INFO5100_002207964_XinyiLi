import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    public static void regex(String line) {
        String REGEX_name = "[A-Z][a-z]+ [A-Z][a-z]+";
        Pattern p_name = Pattern.compile(REGEX_name);
        Matcher m_name = p_name.matcher(line);
        if (m_name.find()) {
            System.out.println("Found name value: " + m_name.group(0));
            System.out.println("start(): "+m_name.start());
            System.out.println("end(): "+m_name.end());
        } else {
            System.out.println("NO MATCH NAME");
        }

        String REGEX_birthdate = "\\d{4}-\\d{2}-\\d{2}";
        Pattern p_birthdate = Pattern.compile(REGEX_birthdate);
        Matcher m_birthdate = p_birthdate.matcher(line);
        if (m_birthdate.find()) {
            System.out.println("Found birthdate value: " + m_birthdate.group(0));
            System.out.println("start(): "+m_birthdate.start());
            System.out.println("end(): "+m_birthdate.end());
        } else {
            System.out.println("NO MATCH birthdate");
        }

        String REGEX_address = "\\d+ [A-Za-z\\s]+, [A-Za-z\\s]+, [A-Z]{2} \\d{5}";
        Pattern p_address = Pattern.compile(REGEX_address);
        Matcher m_address = p_address.matcher(line);
        if (m_address.find()) {
            System.out.println("Found address value: " + m_address.group(0));
            System.out.println("start(): "+m_address.start());
            System.out.println("end(): "+m_address.end());
        } else {
            System.out.println("NO MATCH address");
        }

        String REGEX_email = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com";
        Pattern p_email = Pattern.compile(REGEX_email);
        Matcher m_email = p_email.matcher(line);
        if (m_email.find()) {
            System.out.println("Found email value: " + m_email.group(0));
            System.out.println("start(): "+m_email.start());
            System.out.println("end(): "+m_email.end());
        } else {
            System.out.println("NO MATCH email");
        }

        String REGEX_website = "http?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern p_website = Pattern.compile(REGEX_website);
        Matcher m_website = p_website.matcher(line);
        if (m_website.find()) {
            System.out.println("Found website value: " + m_website.group(0));
            System.out.println("start(): "+m_website.start());
            System.out.println("end(): "+m_website.end());
        } else {
            System.out.println("NO MATCH website");
        }
    }
    public static void main( String args[] ) {

        // String to be scanned to find the pattern.
        String line = "John Doe, born on 1992-05-13, lives at 123 Elm St, Springfield, IL 62704. " +
                "He has an email address: johndoe@email.com and a phone number: (555) 123-4567. " +
                "His website is http://johndoe.com.\n";
        String line2 = "Jane, his colleague, born on 1988-11-0, resides at 456 Maple, Springfield, IL 6204. " +
                "Her email is: jane.smith@email.org, and she has the following phone numbers: (555) 987-6543 and (555) 876-5432. " +
                "Check her personal blog at https://janesmith.blog.\n";

        regex(line);
        regex(line2);
    }
}
