import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        userName = input.nextLine();
        System.out.println("Enter your password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Login successful!");
        }
        else {
            System.out.println("Your password is incorrect! Do you want to change it ? Y/N ");
            String answer1 = input.nextLine();
            if(answer1.equals("N") || answer1.equals("n")) {
                System.out.println("Authentication fail!");
            }
            if (answer1.equals("N") || answer1.equals("y")){
                System.out.println("Create your new password: ");
                String newPassword = input.nextLine();
                if(newPassword.equals(password)) {
                    System.out.println("This password can not be given, create new one.");
                    System.out.println("Create new password: ");
                    newPassword = input.nextLine();
                }
                System.out.println("New password created. Your new password is: " + newPassword);

            }
        }

    }
}