import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Readingfileclass implements IReadingfileclass {
    public String Read(File myfile) {
        String dataf = "";
        try {

            Scanner myReader = new Scanner(myfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Arifmeticafileclass newdata = new Arifmeticafileclass();
                data=newdata.Schet(data);
                dataf = dataf + data+"\n";

                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return dataf;
    }
}
