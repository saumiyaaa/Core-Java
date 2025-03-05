package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) throws IOException {

        // Create a File object pointing to the file "text123.txt" in the D: directory
        File f1 = new File("D:/Java FileIO_Serializable/text123.txt");

        // Open a FileOutputStream in append mode (true ensures content is added to the file)
        FileOutputStream fout = new FileOutputStream(f1, true);

        // String to be written into the file
        String s = "Welcome to Java";

        // Write each character of the string to the file
        for (int i = 0; i < s.length(); i++) {
            fout.write(s.charAt(i)); // Writing character by character
        }

        // Optional: Uncomment to write additional characters, e.g., fout.write('M');

        // Close the FileOutputStream to release system resources
        fout.close();

        // Check if the file exists
        if (f1.exists()) {

            // File found - print details
            System.out.println("File Found !");
            System.out.println("Length: " + f1.length()); // Display the size of the file in bytes
            System.out.println("Path: " + f1.getAbsolutePath()); // Display the absolute path of the file

            // Open a FileInputStream to read data from the file
            FileInputStream fin = new FileInputStream(f1);

            // Variable to store each byte read from the file
            int x;

            // Read the file byte by byte until the end is reached
            while ((x = fin.read()) != -1) { // -1 indicates End of File (EOF)
                System.out.print((char) x); // Convert byte to char and print it
            }

            // Close the FileInputStream to release system resources
            fin.close();

        } else {
            // If the file does not exist, print an error message
            System.out.println("File not Found");
        }
    }
}
