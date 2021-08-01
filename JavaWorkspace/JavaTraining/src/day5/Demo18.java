package day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo18 {
    public static void main(String[] args) throws IOException {
        // it will first check if we have a file by this name
        // or it will create a new file
        FileWriter fw = new FileWriter("data2.txt", true);

        //fw.write(100); // single character
        fw.write("This is a message also");
        fw.write("\n");
        char[] c1 = {'a','b','c', 'd'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
