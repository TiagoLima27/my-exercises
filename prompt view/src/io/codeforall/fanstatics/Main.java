package io.codeforall.fanstatics;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Main {
    public static void main(String[] args) {
        Prompt prompt = new Prompt(System.in,System.out);
        String password = "code4all";

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("Username:");

        PasswordInputScanner question2 = new PasswordInputScanner();
        question2.setMessage("Password:");

        System.out.println("Welcome to your first Prompt-View Experience!\n" +
                "\n" +
                "Insert your login credentials below:\n");

        String username = prompt.getUserInput(question1);
        String userpassword = prompt.getUserInput(question2);

        if (password.equals(userpassword)) {
            System.out.println("\nLogin Succesfull\n" +
                    "Welcome Home, " + username);
        }
    }
}
