import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a username: ");
        userName = input.nextLine();
        System.out.println("Please enter a password: ");
        password = input.nextLine();

        if (userName.equals("faber") && password.equals("castell")){
            System.out.println("Successfully logged in.");
        }
        else {
            System.out.println("Username or password is wrong.");
            System.out.println("Do you want to reset your password?");
            System.out.println("1-Yes\n2-No");
            number = input.nextInt();
            switch (number){
                case 1:
                    System.out.println("Please enter a new password");
                    newPassword = input.next();
                    if (newPassword.equals("castell")){
                        System.out.println("Your new password cannot be the same as the old one. Please try again.");
                    }
                    else {
                        System.out.println("Your new password has been successfully created.");
                    }
                    break;
                case 2:
                    System.out.println("Please try again.");
                    break;
                default:
                    System.out.println("You selected wrong number. Please select 1 or 2.");
            }
        }
    }
}
