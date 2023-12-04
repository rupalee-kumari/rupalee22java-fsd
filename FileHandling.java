package javafsd;
import java.util.*;
import java.io.*;

public class FileHandling {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Specify the file path
	        String filePath = "example.txt";

	        System.out.println("File Operation Menu:");
	        System.out.println("1. Read from File");
	        System.out.println("2. Write to File");
	        System.out.println("3. Append to File");

	        System.out.print("Enter your choice (1-3): ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                String fileContent = readFromFile(filePath);
	                System.out.println("File content: " + fileContent);
	                break;
	            case 2:
	                System.out.print("Enter content to write to file: ");
	                scanner.nextLine(); // Consume the newline character
	                String contentToWrite = scanner.nextLine();
	                writeToFile(filePath, contentToWrite, false);
	                System.out.println("Content written to file successfully.");
	                break;
	            case 3:
	                System.out.print("Enter content to append to file: ");
	                scanner.nextLine(); // Consume the newline character
	                String contentToAppend = scanner.nextLine();
	                writeToFile(filePath, contentToAppend, true);
	                System.out.println("Content appended to file successfully.");
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }

	        scanner.close();
	    }

	    // Read content from file
	    private static String readFromFile(String filePath) {
	        StringBuilder fileContent = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                fileContent.append(line).append("\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return fileContent.toString();
	    }

	    // Write or append content to file
	    private static void writeToFile(String filePath, String content, boolean append) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, append))) {
	            writer.write(content);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


