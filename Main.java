import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main{


    public static void main(String[] args ){
       
        System.out.println("Please Enter the word to check whether its a Palindrome \n ");

        // scanner to receive user input 
        Scanner scan = new Scanner(System.in);

       // System.out.println("the read out word is: \n " );

        PalindromIterativ myPalindromIterativ = new PalindromIterativ();
        PalindromRekursiv myRec = new PalindromRekursiv();

        String wordToCheck = scan.nextLine();
        
        
        myPalindromIterativ.istPalindrom(wordToCheck);
        myRec.istPalindrom(wordToCheck);



        try (BufferedReader br = new BufferedReader(new FileReader("/Users/michalroziel/Documents/htwprog/Palindrome-Checker/resources.csv"))) {
            String line;
            System.out.println("Now reading out words from rescources.csv\n");
            while ((line = br.readLine()) != null) { // Read each line in the file
                System.out.println("Read line: \n" + line ); // Process or output the line
                System.out.println("Using the Iterative approach on read line!" );
                myPalindromIterativ.istPalindrom(line);
            }
        
        
        }

        catch(IOException ioEx){
            System.out.println("IOException Found ");
            ioEx.printStackTrace();

        }


        
        finally{
             

            if (scan != null){
                scan.close();
            }
            
        
            
        
        }
 


    }










}