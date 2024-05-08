
public class PalindromIterativ implements Palindrom {


    @Override
    public boolean istPalindrom(String wort) {

        // System.out.println("Starting the iterative approach..\n");

        // for loop to check letters at a given position
        for (int i = 0; i < wort.length() / 2; i++) {


            if (wort.charAt(i) != wort.charAt(wort.length() - 1 - i)) {

                //  System.out.println("This is not a palindrome! \n");

                return false;

            }

        }


        return true;


    }


}
