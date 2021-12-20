import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writingfileclass implements IWritingfileclass {
    public void WriteintonewFile(String data)
    {
        System.out.println("Выберите формат вывода:\n- txt(1)\n- xml(2)\n- json(3)");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 1:
                try (FileWriter writer = new FileWriter("javafile1.txt", false)) {
                    writer.write(data);
                    break;
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
            case 2:
            try (FileWriter writer = new FileWriter("javafile1.xml", false)) {
                writer.write(data);
                break;
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
            case 3:
            try (FileWriter writer = new FileWriter("javafile1.json", false)) {
                writer.write(data);
                break;
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
            default:
                break;

        }
    }
}