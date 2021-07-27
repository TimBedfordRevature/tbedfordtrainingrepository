package day2;

class Method {
    public static void printExample(){
        System.out.println("Default");
    }
}

public class Practice extends Method {
    public static void main(String[] args) {
        Method.printExample();
        printExample();
    }


    public static void printExample(){
        System.out.println("Override");
    }
}
