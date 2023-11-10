import java.util.Scanner;

public class atmInterface {
    public static void main(String[] arg) {

        double balance = 0;
        double withdraw = 0;
        double deposite = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu");
            System.out.println("1.Deposite Money");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            System.out.print("Enter Your Choice: ");
            int option = sc.nextInt();

            System.out.println("");

            switch (option) {
                case 1:
                    System.out.print("Enter The Deposite Amount: ");
                    deposite = sc.nextDouble();
                    if (deposite > 0) {
                        balance = balance + deposite;
                        System.out.println("Deposite Successful");
                        System.out.println("");
                    } else {
                        System.out.println("Enter Valid Amount");
                    }
                    break;

                case 2:
                    System.out.print("Enter The Withdraw Amount: ");
                    withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdraw Successful");
                        System.out.println("");
                    } else {
                        System.out.println("Enter Valid Amount");
                    }
                    break;

                case 3:
                    System.out.println("Your Current Balance: " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
                    ;
                    break;

                default:
                    System.out.println("Enter Valid Choice");

            }
        }
    }
}