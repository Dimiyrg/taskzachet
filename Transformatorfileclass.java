import java.io.*;

import java.util.Scanner;
public class Transformatorfileclass implements IReadingfileclass {
    public String Read(File file) {
        String dataf = "";
        String data = "";

        try (FileReader fr = new FileReader(file))
        {
            char c;
            //Boolean prov=false;
            int content;
            while ((content = fr.read()) != -1) {
                c = (char)content;
                data = Character.toString(c);
                //Integer.toString(content);
                if(c =='<')
                {
                    while(c !='>' )
                    {
                        content = fr.read();
                        c = (char)content;
                    }
                }
                else
                {
                    dataf=dataf+data;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataf;
    }
}