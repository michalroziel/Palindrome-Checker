
public class PalindromIterativ implements Palindrom {



    @Override
    public boolean istPalindrom(String wort) {

        //make the checker case-insensitive
        String wordToCheck = wort.toLowerCase();

         //RENTNER
         // for loop to check letters at a given position 
         for ( int i = 0; i < wordToCheck.length()/2; i++ ){

            //0-7 1-6 2-5 3-4 4-3 5-2 6-1 
                                                                            // correct Index 
            if (wordToCheck.charAt(i) != wordToCheck.charAt(wordToCheck.length() - 1 - i )){

                System.out.println(" This is not a palindrome! " );
                return false ; 

            }    

        }

        System.out.println("This is a palindrome ! ");
        return true ; 


    }
 






}
