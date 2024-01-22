import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int count = 3, select, amount;
        double balance = 1000;

        while (count > 0){
            System.out.print("Please enter a Username: ");
            userName = input.nextLine();
            System.out.print("Please enter a Password: ");
            password = input.nextLine();

                if (userName.equals("patika") && password.equals("dev123")) {
                    System.out.println("Welcome the the System");
                    while (true) {
                        System.out.println("1- Deposit\n" + "2- Withdrawal\n" + "3- Balance Inquiry\n" + "4- Exit");
                        System.out.print("Please select the action you want to take: ");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                System.out.print("Please enter the amount you want to deposit: ");
                                amount = input.nextInt();
                                balance += amount;
                                System.out.println("Your Current Balance: " + balance);
                                break;
                            case 2:
                                System.out.print("Please enter the balance you want to withdraw: ");
                                amount = input.nextInt();
                                if (amount <= balance) {
                                    balance -= amount;
                                    System.out.println("Your Current Balance: " + balance);
                                } else {
                                    System.out.println("Insufficient Funds");
                                }
                                break;
                            case 3:
                                System.out.print("Current Balance: " + balance);
                                System.out.println();
                                break;
                            case 4:
                                System.out.println("The program is exiting. See you again...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Please choose a number between 1 and 4.");
                        }
                    }
                }
                else {
                count--;
                System.out.println("Wrong Username or Password. Please try again...");
                System.out.println("Your remaining rights: " + count);
                if (count == 0){
                    System.out.println("Your account has been blocked. Please contact customer service.");
                }
            }
        }
    }
}
