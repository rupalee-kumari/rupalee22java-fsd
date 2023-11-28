
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regular{
        public static void main(String[] args) {
            String regex = "\\d{4}-\\d{2}-\\d{2}"; // This regular expression checks for a date in the format YYYY-MM-DD
            String input = "2023-11-28";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                System.out.println("The input matches the regular expression.");
            } else {
                System.out.println("The input does not match the regular expression.");
            }
        }
    }

