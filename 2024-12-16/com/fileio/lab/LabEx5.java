package com.fileio.lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Problem Statement:
 * Write a Java program that performs the following tasks:
 * 1. Check if a file named "file12.txt" exists in the directory "D:/Java FileIO_Serializable".
 *    - If the file does not exist, create it and write the string "Welcome to Java" into the file.
 *    - If the file already exists, display its length (size in bytes) and absolute path.
 * 2. Read the contents of "file12.txt" byte by byte and copy it to another file named "file2.txt"
 *    in the same directory.
 * 3. Display a confirmation message after the file copy operation is complete.
 */

public class LabEx5 {

    public static void main(String[] args) throws IOException {

        // Create a File object for the source file "file12.txt" in the specified directory
        File f1 = new File("D:/Java FileIO_Serializable/file1.txt");

        // Check if the file exists
        if (!f1.exists()) {
            // If the file does not exist, create a new file
            f1.createNewFile();
            System.out.println("File Created...");

            // Open a FileOutputStream in append mode to write data to the newly created file
            FileOutputStream fout = new FileOutputStream(f1, true);

            // String to be written into the file
            String s = "Welcome to Java";

            // Write each character of the string to the file
            for (int i = 0; i < s.length(); i++) {
                fout.write(s.charAt(i)); // Writing character by character
            }
            fout.close(); // Close the FileOutputStream after writing to release system resources
        } else {
            // If the file exists, display its details
            System.out.println("File Found !");
            System.out.println("Length: " + f1.length()); // Display the file size in bytes
            System.out.println("Path: " + f1.getAbsolutePath()); // Display the absolute path of the file
        }

        // Open a FileInputStream to read data from the source file "file12.txt"
        FileInputStream fin = new FileInputStream(f1);

        // Create a File object for the destination file "file2.txt" in the same directory
        File f2 = new File("D:/Java FileIO_Serializable/file2.txt");

        // Open a FileOutputStream to write data to the destination file
        FileOutputStream fout = new FileOutputStream(f2);

        // Variable to hold the data being read from the source file
        int x;

        // Read the source file byte by byte until the end of the file is reached
        while ((x = fin.read()) != -1) { // -1 indicates End of File (EOF)

            // Write the byte read from the source file to the destination file
            fout.write(x);
        }

        // Display a confirmation message after the file has been successfully copied
        System.out.println("File copied ...");

        // Close the FileInputStream to release system resources
        fin.close();

        // Close the FileOutputStream to release system resources
        fout.close();
    }
}
