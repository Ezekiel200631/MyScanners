import java.util.Scanner;
public class MyScannerSeparatedWithComma {
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a line of words separated by commas:");
            String inputLine = scanner.nextLine();

            processInputLine(inputLine);
        }
    }

    private void processInputLine(String inputLine) {
        try (Scanner wordScanner = new Scanner(inputLine).useDelimiter(",")) {
            printOutput(wordScanner);
        }
    }

    private void printOutput(Scanner wordScanner) {
        System.out.println("Output:");

        while (wordScanner.hasNext()) {
            String word = wordScanner.next().trim();
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MyScannerSeparatedWithComma myScanner = new MyScannerSeparatedWithComma();
        myScanner.run();
    }
}
