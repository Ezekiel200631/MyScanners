import java.util.Scanner;
public class MyScannerSepteratedWithComma {
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter five words on one line separated by commas:");
            String inputLine = scanner.nextLine();

            try (Scanner wordScanner = new Scanner(inputLine)) {
                wordScanner.useDelimiter(",");

                System.out.println("Output:");

                while (wordScanner.hasNext()) {
                    String word = wordScanner.next();
                    System.out.println(word);
                }
            }
        }
    }

    public static void main(String[] args) {
        MyScannerSepteratedWithComma myScanner = new MyScannerSepteratedWithComma();
        myScanner.run();
    }
}