import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int myAnswer = (int)(Math.random()*100);
        int userNumber = 0;
        int count = 0;
        int attempts = 0;
        do {
            System.out.print("Guess the number (1-100): ");
            userNumber = sc.nextInt();

            if(userNumber == myAnswer){
                System.out.println("OHH YESS... Your Number Is Correct! YOU WON!");
                break;
            }
            else if(userNumber > myAnswer){
                System.out.println("Your number TOO HIGH try again");
            }
            else {
                System.out.println("Your number is TOO LOW try again");
            }

            count++;
            attempts = count + 1;

            if(count == 10 ){
                System.out.println("Attempts are over");
                break;
            }

        }while(userNumber >= 0);

        System.out.println("Number of times you attempt = " + attempts);
        System.out.println("The Number is: " + myAnswer);

    }
}
