package day5;

import java.io.File;

public class Demo16 {
    public static void main(String[] args) {
        int count = 0;
        int ct = 0;
        File file = new File("db");
        String[] list = file.list();
        for(String s: list){
            File f = new File(file,s);
            if(f.isFile()){
                ct++;
                System.out.println(s);
            }
            count++;
        }

        System.out.println("Total number of files and folder = " + count);
    }
}
