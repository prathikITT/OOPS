package signuppage;

import java.util.Scanner;

public class LoginAppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();

        while (true) {
            System.out.println("\nChoose one:");
            System.out.println("1. Login");
            System.out.println("2. Signup");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Password: ");
                    String loginPassword = scanner.nextLine();
                    userService.login(loginUsername, loginPassword);
                    break;

                case "2":
                    System.out.print("Username: ");
                    String signupUsername = scanner.nextLine();
                    System.out.print("Email: ");
                    String signupEmail = scanner.nextLine();
                    System.out.print("Password: ");
                    String signupPassword = scanner.nextLine();
                    userService.signup(signupUsername, signupEmail, signupPassword);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}
