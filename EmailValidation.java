package javafsd;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
public class EmailValidation{
public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        List<String> emailList = new ArrayList<>();
		        int numberOfEmails;

		        try {
		            System.out.println("How many employee email addresses do you want to enter? ");
		            numberOfEmails = scanner.nextInt();
		            scanner.nextLine(); // Consume the newline character

		            System.out.println("Enter " + numberOfEmails + " email addresses:");
		            for (int i = 0; i < numberOfEmails; i++) {
		                String email = scanner.nextLine();
		                emailList.add(email);
		            }

		            System.out.println("Enter user email to search: ");
		            String useremail = scanner.nextLine();

		            boolean isUserEmailPresent = false;

		            for (String email : emailList) {
		                try {
		                    if (isPresent(email, useremail)) {
		                        System.out.println(email + " is present in the employees email list");

		                        if (isValid(email)) {
		                            System.out.println(email + " is a valid Email Address");
		                        } else {
		                            throw new Exception(email + " is not a valid Email Address");
		                        }

		                        isUserEmailPresent = true;
		                    }
		                } catch (Exception e) {
		                    System.out.println(e.getMessage());
		                }
		            }

		            if (!isUserEmailPresent) {
		                System.out.println(useremail + " is not present in the employees email list");
		            }

		        } catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        } finally {
		            scanner.close();
		        }
		    }

		    private static boolean isValid(String email) {
		        // Regular expression for a valid email address
		        String emailRegex = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		        Pattern pattern = Pattern.compile(emailRegex);

		        return pattern.matcher(email).matches();
		    }

		    private static boolean isPresent(String email, String useremail) {
		        return useremail.equalsIgnoreCase(email);
		    }
		

	}


