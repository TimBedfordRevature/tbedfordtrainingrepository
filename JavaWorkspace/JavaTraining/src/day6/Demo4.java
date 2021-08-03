package day6;
//Create only one instance of an object
class Calculator {

    public static int count;

    //instance of the class
    private static Calculator instance = null;

    private Calculator(){
        count++;
        System.out.println("Count: " + count);
        System.out.println("Constructor called");
    }

    public static Calculator getInstance(){
        if(instance == null)
            instance = new Calculator();
        return instance;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Calculator calculator1 = Calculator.getInstance();
        Calculator calculator2 = Calculator.getInstance();
        Calculator calculator3 = Calculator.getInstance();

//        Calculator calculator4 = new Calculator();
//        Calculator calculator5 = new Calculator();
//        Calculator calculator6 = new Calculator();
    }
}
