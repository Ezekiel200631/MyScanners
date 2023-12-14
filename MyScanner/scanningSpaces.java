import java.util.Scanner;

public class scanningSpaces
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
        scanningSpaces scanningSpaces = new scanningSpaces();
        scanningSpaces.run();
    }
}