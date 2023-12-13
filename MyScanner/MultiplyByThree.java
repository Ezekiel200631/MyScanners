import java.util.Scanner;

public class MultiplyByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers on one line separated by spaces:");
        
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                int result = number * 3;
                System.out.println("Result for number " + (i + 1) + ": " + result);
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
                i--; 
            }
        }

        scanner.close();
    }
}