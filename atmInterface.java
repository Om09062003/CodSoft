import java.util.Scanner;

public class atmInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.next();

        String evenChars = "";
        String oddChars = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                evenChars += s.charAt(i);
            } else {
                oddChars += s.charAt(i);
            }
        }

        System.out.println(evenChars + " " + oddChars);

        scanner.close();
    }
}
