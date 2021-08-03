package day7;

//Generic class
//5 keywords: Type(T), Element(E), Key, ...
class Calculator2<T> {

    public boolean areEqual(T a, T b){
        if(a.equals(b))
            return true;
        else
            return false;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        //Declare type Integer for the calculator2 class
        Calculator2<Integer> cal = new Calculator2<>();
        cal.areEqual(10, 20);
    }
}
