public class PalindromRekursiv implements Palindrom {

    @Override
    public boolean istPalindrom(String wort) {
     
        //TODO: check for edge cases  
        
        
        System.out.println("[REC. Approach:]The word length is : " + wort.length());
        // make the word case-insensitive
        wort = wort.toLowerCase();

        // base case : word is one letter or less
         if (wort.length() <= 1 ){
            System.out.println("[REC. Approach:]This is a palindrome! \n ");
            return true ; 
        }
        
        //check first and last letter
        else if ( wort.charAt(0) != wort.charAt(wort.length()-1) ){

            System.out.println("[REC. Approachmport java.io.ObjectInputStream;:]This is not a palindrome! " );
            return false;
        }

        // reduce the word by the first and last letter
        String subWord = wort.substring(1, wort.length()-1);

        // recursion case
        return istPalindrom(subWord);
    }
    



    
    
}
