mport java.util.Scanner;
public class BATM {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String username;
    String password;

    System.out.println("Log in:");
    System.out.println("Indtast username: ");
    username = input.nextLine();

    System.out.println("Indtast password: ");
    password = input.nextLine();

    users check = new users(username, password);

    if(check.auth()) 
        System.out.println("You are logged in");

        System.out.println("You are logged in");
        System.out.println("You are logged in");


}

}
