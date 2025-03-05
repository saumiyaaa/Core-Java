package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException {

        // Create a File object for the source file (info123.txt)
        File f1 = new File("D:/Java FileIO_Serializable/text123.txt");
        
        // Create a File object for the destination file (copy.txt)
        File f2 = new File("D:/Java FileIO_Serializable/copy.txt");

        // Open a FileInputStream to read data from the source file
        FileInputStream fin = new FileInputStream(f1);

        // Open a FileOutputStream to write data to the destination file
        FileOutputStream fout = new FileOutputStream(f2);

        // Variable to store each byte read from the source file
        int x;

        // Read the source file byte by byte until the end of the file is reached
        while ((x = fin.read()) != -1) { // -1 indicates End of File (EOF)

            // Write the read byte to the destination file
            fout.write(x);
        }

        // Display a confirmation message once copying is complete
        System.out.println("File copied ...");

        // Close the FileInputStream to release system resources
        fin.close();

        // Close the FileOutputStream to release system resources
        fout.close();
    }
}
