package com.company.files;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        // Serialization is converting an object into a stream
        // Deserialization is the inverse, where you reverse a stream back into an object

        String inputFile = "input.txt";

        bufferedStreams(inputFile, "output.txt");
    }

    public static void bufferedStreams(String inputFilePath, String outputFilePath) {
        try {

            // The buffered reader is meant to aid the file stream from the file reader
            // allowing us to interact with the stream based on the provisions in the
            // buffered reader
            BufferedReader input = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFilePath));

            String line; // This will store each line of text in the file

            // If the current line we're reading is not empty
            // write it to the file.
            while((line = input.readLine()) != null) {
                output.write(line);
            }


            input.close();
            output.close();
            System.out.println();
            System.out.println("Operation successful");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
