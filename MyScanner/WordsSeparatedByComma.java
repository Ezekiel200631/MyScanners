import java.util.Scanner;

public class WordsSeparatedByComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter(",");

        System.out.println("Enter five words on one line separated by commas:");

        for (int i = 0; i < 5; i++) {
            if (scanner.hasNext()) {
                String word = scanner.next();

                System.out.println(word);
            } else {
                System.out.println("Invalid input. Please enter a valid word.");
                scanner.next(); 
                i--; 
            }
        }

        
        scanner.close();
    }
}
