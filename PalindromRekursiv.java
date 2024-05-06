public class PalindromRekursiv implements Palindrom {

    @Override
    public boolean istPalindrom(String wort) {

    long timeStart = System.nanoTime();
     
    boolean checkIfPali;
    checkIfPali = istPalindromHelper(wort);

    long timeEnd = System.nanoTime();

    //compute time in ms
    long timePeriod = (timeEnd - timeStart) ;

      //  System.out.println("time in nanoseconds it took to check this word :" + timePeriod);
        System.out.println("" + timePeriod);

        return checkIfPali;

    }
    
    public boolean istPalindromHelper(String wort){

        //TODO: check for edge cases



       // System.out.println("[REC. Approach:]The word length is : " + wort.length());
        // make the word case-insensitive
        wort = wort.toLowerCase();

        // base case : word is one letter or less
        if (wort.length() <= 1 ){
         //   System.out.println("[REC. Approach:]This is a palindrome! \n ");
            return true ;
        }

        //check first and last letter
        else if ( wort.charAt(0) != wort.charAt(wort.length()-1) ){

           // System.out.println("[REC. Approach] This is not a palindrome! " );
            return false;
        }

        // reduce the word by the first and last letter
        String subWord = wort.substring(1, wort.length()-1);


        // recursion case
        return istPalindromHelper(subWord);



    }

    
    
}
