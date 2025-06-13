public class palindrome {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String trimmedInput = input.trim(); 
            String reversedInput = new StringBuilder(trimmedInput).reverse().toString();
            if (trimmedInput.equalsIgnoreCase(reversedInput)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");  
                }
            }
        }
    }
  