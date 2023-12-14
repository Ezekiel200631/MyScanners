import java.util.Scanner;

public class multiplyByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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