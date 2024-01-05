import java.util.Scanner;
public class myScanner
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
        myScanner myScanner = new myScanner();
        myScanner.run();
    }
}
