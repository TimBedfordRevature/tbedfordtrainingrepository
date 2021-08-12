public class Calculator {

    // method to add two numbers
    public int addNumber(int a, int b){
        return a + b;
    }

    // method to return max number
    public int findMaxNumber(int myArray[]){
        int max = myArray[0];
        for(int i = 0; i<myArray.length; i++){
            if (max < myArray[i])
                max = myArray[i];
        }
        return max;
    }

    // method that returns cube of the given number
    public int getCube(int number){
        return number * number * number;
    }

    public String reverseString(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public int multiplyTwoNumbers(int a, int b){
        return a * b;
    }
}
