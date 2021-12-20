import java.io.*;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Arifmeticafileclass arifmeticafileclass = new Arifmeticafileclass();
       //arifmeticafileclass.Schet("прпр 2*87*3 вв 8+545454 45454-65");

        System.out.println("Выберите формат:\n- txt(1)\n- xml(2)\n- json(3)");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        switch (num)
        {
            case 1:
                Readingfileclass myreader1 = new Readingfileclass();
                File myfile = new File("D:\\casualfile.txt");
                String data = myreader1.Read(myfile);
                Writingfileclass mywriter = new Writingfileclass();
                mywriter.WriteintonewFile(data);
                System.out.println("Работа 1 завершена");
                break;

            case 2:
                //Transformatorfileclass myreader2 = new Transformatorfileclass();
                Readingfileclass myreader2 = new Readingfileclass();
                File myfile2 = new File("D:\\xmjava.xml");
                String data2 = myreader2.Read(myfile2);
                Writingfileclass mywriter2 = new Writingfileclass();
                mywriter2.WriteintonewFile(data2);
                System.out.println("Работа 2 завершена");
                break;
            case 3:
                Readingfileclass myreader3 = new Readingfileclass();
                File myfile3 = new File("D:\\jsjava.json");
                String data3 = myreader3.Read(myfile3);
                Writingfileclass mywriter3 = new Writingfileclass();
                mywriter3.WriteintonewFile(data3);
                System.out.println("Работа 3 завершена");
                break;
            default:
                break;
        }

    }
}