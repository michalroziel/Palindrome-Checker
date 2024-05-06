import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromTestDrive {

    public static void main(String[] args) {
        
        PalindromIterativ myIterativ = new PalindromIterativ();
        PalindromRekursiv myRekursiv = new PalindromRekursiv();

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/michalroziel/Documents/htwprog/Palindrome-Checker/resources.csv"))) {
            String line;
            System.out.println("Now reading out words from rescources.csv\n");
            while ((line = br.readLine()) != null) { // Read each line in the file
                System.out.println("" + line ); // Process or output the line
               // System.out.println("Using the Iterative approach on read line!" );
               // myIterativ.istPalindrom(line);
                myRekursiv.istPalindrom(line);
            }


        }

        catch(IOException ioEx){
            System.out.println("IOException Found ");
            ioEx.printStackTrace();

        }


        // the objective is to create two measurements and store them in a file
        // we also need to measure the word length to be tested and the time for each word it took.


        // for writing into a File a BufferedWriter and a Filewriter.
        // We can reuse the BuffredReader and the FileReader from the Main Class.


    }
    
}
