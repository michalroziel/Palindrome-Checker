import java.util.Scanner;

public class Main{


    public static void main(String[] args ){

        System.out.println("Hello World ! " );


        System.out.println("Please Enter the word to check whether its a Palindrome ");

        // scanner to receive user input 
        Scanner scan = new Scanner(System.in);


        PalindromIterativ myPalindromIterativ = new PalindromIterativ();

        String wordToCheck = scan.nextLine();

        myPalindromIterativ.istPalindrom(wordToCheck);

    }










}