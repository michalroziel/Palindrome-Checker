import java.io.*;

public class PalindromTestDrive {

    public static void main(String[] args) {
        
        PalindromIterativ myIterativ = new PalindromIterativ();
        PalindromRekursiv myRekursiv = new PalindromRekursiv();

        try (BufferedReader br = new BufferedReader(new FileReader("resources.csv")); BufferedWriter bw = new BufferedWriter(new FileWriter("plotter/measurements.csv"))) {
            String line;
            System.out.println("Now reading out words from rescources.csv\n");
            while ((line = br.readLine()) != null) { // Read each line in the file
                System.out.println("" + line ); // Process or output the line
               // System.out.println("Using the Iterative approach on read line!" );

                long timeStartIterativ = System.nanoTime();
                myIterativ.istPalindrom(line);
                long timeEndIterativ = System.nanoTime();
                long timePeriodIterativ = (timeEndIterativ - timeStartIterativ) ;

                long timeStartRekursiv = System.nanoTime();
                myRekursiv.istPalindrom(line);
                long timeEndRekursiv = System.nanoTime();
                long timePeriodRekursiv = (timeEndRekursiv - timeStartRekursiv) ;

                bw.write(line.length() + "," + timePeriodIterativ + "," + timePeriodRekursiv + "\n");

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
