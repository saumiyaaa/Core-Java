package com.companylogin;

import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the username: ");
        String username = sc.nextLine();

        while (true) {
            System.out.println("\nEnter the password: ");
            String password = sc.nextLine();

            // Check password length
            if (password.length() < 8) {
                System.out.println("\nMinimum length should be 8! Enter password again.");
                continue;
            }

            // Initialize validation flags and counters
            int uppercaseCount = 0;
            int lowercaseCount = 0;
            int specialCharCount = 0;
            boolean invalidChar = false;

            // Validate password character by character
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (ch == '@' || ch == '*' || ch == '#') {
                    specialCharCount++;
                } else if (!Character.isDigit(ch)) {
                    // Any character that is not a letter, digit, or allowed special character is invalid
                    invalidChar = true;
                }
            }

            // Check individual validation rules
            if (uppercaseCount == 0) {
                System.out.println("\nAt least 1 uppercase character is required! Enter password again.");
                continue;
            }

            if (lowercaseCount == 0) {
                System.out.println("\nAt least 1 lowercase character is required! Enter password again.");
                continue;
            }

            if (specialCharCount == 0) {
                System.out.println("\nAt least 1 special character (@, *, #) is required! Enter password again.");
                continue;
            }

            if (invalidChar) {
                System.out.println("\nInvalid character detected! Only @, *, and # are allowed as special characters. Enter password again.");
                continue;
            }

            // If all validations pass
            System.out.println("\nPassword accepted!");
            System.out.println("\nUsername: "+username+"\nPassword: "+password);
            System.out.println("\n----------Login Successful----------");
            break;
        }
        

        sc.close();
    }
}
