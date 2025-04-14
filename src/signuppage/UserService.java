package signuppage;

import signuppage.User;

public class UserService {
    private User[] users = new User[100];  // max 100 users
    private int userCount = 0;

    public boolean signup(String username, String email, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                System.out.println("Username already exists.");
                return false;
            }
            if (users[i].getEmail().equals(email)) {
                System.out.println("Email already used.");
                return false;
            }
        }

        users[userCount] = new User(username, email, password);
        userCount++;
        System.out.println("Signup successful!");
        return true;
    }

    public boolean login(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                if (users[i].getPassword().equals(password)) {
                    System.out.println("Successfully Logged In!");
                    return true;
                } else {
                    System.out.println("Incorrect Password.");
                    return false;
                }
            }
        }
        System.out.println("Username not found.");
        return false;
    }
}
