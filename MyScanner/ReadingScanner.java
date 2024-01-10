import java.util.Scanner;
public class ReadingScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            if (scanner.hasNext()) { 
                String str = scanner.next(); 
                System.out.println(str); 
            }
        }
    }

    public static void main(String[] args) {
        ReadingScanner ReadingScanner = new ReadingScanner();
        ReadingScanner.run();
    }
}
