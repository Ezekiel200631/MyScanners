import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerReadCSVFile {
    public void run() {
        try (Scanner scanner = new Scanner(new File("TestScoresByClass.csv"))) {
            scanner.useDelimiter("\n");

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                try (Scanner lineScanner = new Scanner(line)) {
                    lineScanner.useDelimiter(",");
                    if (lineScanner.hasNextInt()) {
                        int classNumber = lineScanner.nextInt();
                        System.out.print("Class " + classNumber + ": ");

                        int sum = 0;
                        int testCount = 0;

                        while (lineScanner.hasNextInt() && testCount < 10) {
                            int score = lineScanner.nextInt();
                            System.out.print(score + " ");
                            sum += score;
                            testCount++;
                        }

                        double average = (testCount > 0) ? (double) sum / testCount : 0;
                        System.out.println("- Avg score: " + average);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("An error occurred. Please check your input file and try again.");
        }
    }

    public static void main(String[] args) {
        ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
        srCsv.run();
    }
}

