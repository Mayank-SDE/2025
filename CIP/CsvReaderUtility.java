package CIP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReaderUtility {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Empty file");
            return;
        }
        String csvFile = args[0];
        String line;
        String delimiter = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);
                System.out.println("Id : " + data[0] + ", Name : " + data[1] + ", Age : " + data[2]);
            }
        } catch (IOException ex) {
            throw ex;
        }
    }
}
