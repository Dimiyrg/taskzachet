import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Arifmeticafileclass implements IArifmeticafileclass {
    public String Schet(String data) {
        //Pattern pattern = Pattern.compile("\\d*[+*/-].+?\\d*"); // прпр 2*87 вв
        Pattern pattern = Pattern.compile("[0-9]+[+*/-][0-9]+");
        Matcher matcher = pattern.matcher(data);
        String datares=data;
        try {
            String s;
            while (matcher.find()) {
                s = matcher.group();
//                System.out.print(s + " = ");
               // System.out.println(calc(s));
                int resultint =calc(s);
                String result = String.valueOf(resultint);
                datares = datares.replace(s, result);
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        return datares;
    }
    private static int applyOperator(char operand, int firstNum, int secondNum){
        switch (operand) {
            case '*':
                firstNum *= secondNum;
                break;
            case '/':
                firstNum /= secondNum;
                break;
            case '+':
                firstNum = secondNum;
                break;
            case '-':
                firstNum = -secondNum;
                break;
        }

        return firstNum;
    }

    public static int calc(String str){
        int sum = 0;
        int lastApplyOpRes = 0;
        int lastNum = 0;
        int len = str.length();
        char prevOperator = '+';

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') {
                lastNum = lastNum * 10 + c - '0';
                continue;
            }

            lastApplyOpRes = applyOperator(prevOperator, lastApplyOpRes , lastNum);
            lastNum = 0;

            switch (c) {
                case '+':
                case '-':
                    sum += lastApplyOpRes;
                    lastApplyOpRes = 0;
                    break;
            }

            prevOperator = c;
        }

        lastApplyOpRes = applyOperator(prevOperator, lastApplyOpRes , lastNum);

        return sum + lastApplyOpRes;
    }
}
/* if (content >=48 && content <=57 || content ==45)
                {
                    if(prov)
                    newdata = newdata + data;
                    else{
                        newdata ="";
                        prov=true;
                    }

                    if(content==45)
                        prov=false;
                }
                if(content==42 || content==43 || content==45 || content==47 )
                {
                    znak=c;
                }*/

/*
 String dataf = "";
        String data = "";
        double chislo1=0;
        double chislo2=0;
        String newdata="";
        char znak;
        try (FileReader fr = new FileReader(file))
        {
            int i=0;
            char c;
            Boolean prov=true;
            int content;
            while ((content = fr.read()) != -1) {
                c = (char)content;
                data = Character.toString(c);
                //Integer.toString(content);
                if (content >=48 && content <=57 || content ==45)
                {
                    if(content >=48 && content <=57)
                    {
                        i++;
                        newdata = newdata + data;
                    }
                    if(content==45 && i>0)
                    {
                        znak=c;
                    }
                    else if(content==45 && i==0)
                    {
                        newdata = newdata + data;
                    }

                }
                if(content==42 || content==43 || content==45 || content==47 )
                {

                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataf;
 */
