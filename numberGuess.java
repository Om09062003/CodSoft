import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myAnswer = (int) (Math.random() * 100);
        int userNumber = 0;
        int count = 0;
        int attempts = 0;
        char choice;
        do {
            do {
                System.out.print("Guess the number (1-100): ");
                userNumber = sc.nextInt();

                if (userNumber == myAnswer) {
                    System.out.println("OHH YESS... Your Number Is Correct! YOU WON!");
                    break;
                } else if (userNumber > myAnswer) {
                    System.out.println("Your number TOO HIGH try again");
                } else {
                    System.out.println("Your number is TOO LOW try again");
                }

                count++;
                attempts = count + 1;

                if (count == 10) {
                    System.out.println("Attempts are over");
                    break;
                }

            } while (userNumber >= 0);

            System.out.println("Number of times you attempt = " + attempts);
            System.out.println("The Number is: " + myAnswer);

            System.out.print("Do you want to play again type Y|y (if dont want to continue press any key and enter): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

    }
}
