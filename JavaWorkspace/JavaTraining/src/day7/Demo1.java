package day7;
//Generics

class Calculator {
//    public boolean areEqual(int a, int b){
//        if(a==b))
//            return true;
//        else
//            return false;
//    }

//    public boolean areDoubleEqual(double a, double b){
//        if(a==b)
//            return true;
//        else
//            return false;
//    }

    //with this method using objects we can pass in many different data types
    //this method does have unnecessary boxing and unboxing which impacts our performance.
    //this method is not type safe meaning you can compare (int, String) (Double, int) which does not make sense
//    public boolean areEqual(Object a, Object b){
//        if(a.equals(b))
//            return true;
//        else
//            return false;
//    }

    //Generic method
    public <E> boolean areEqual(E a, E b){
        if(a.equals(b))
            return true;
        else
            return false;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean result = calculator.areEqual(10.0, "ten"); // can use many data types

        if(result)
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");
    }
}
