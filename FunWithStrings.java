/**
 * FUNWITHSTRINGS
 *
 * @author Austin Hilvert
 * @version 09092019
 */
import java.util.Scanner;

public class FunWithStrings {

    public static void main(String[] args) {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.print("Enter a long string: ");
    	String userStr1 = keyboard.nextLine();
    	System.out.print("Enter a substring: ");
    	String userStr2 = keyboard.nextLine();
    	System.out.println("Length of your string: " + userStr1.length());
    	System.out.println("Length of your substring: " + userStr2.length());
    	int indexOfSub = userStr1.indexOf(userStr2);
    	int indexOfSubEnd = indexOfSub + userStr2.length();
    	System.out.println("Starting position of your substring: " + indexOfSub);
    	System.out.println("String before your substring: " + userStr1.substring(0, indexOfSub));
    	System.out.println("String after your substring: " + userStr1.substring(indexOfSubEnd, userStr1.length()));
    	System.out.print("Enter a position between 0 and " + (userStr1.length() - 1) + ": ");
    	int userPos = keyboard.nextInt();
    	String temporary = keyboard.nextLine();
    	System.out.println("The character at position " + userPos + " is " + userStr1.charAt(userPos));
    	System.out.print("Enter a replacement string: ");
    	String userStr3 = keyboard.nextLine();
    	System.out.println("Your new string is: " + userStr1.substring(0, indexOfSub) + userStr3 + userStr1.substring(indexOfSubEnd, userStr1.length()));
    	System.out.println("Goodbye!");
    	keyboard.close();
    	
    	
        
    }
}
