package day6;
// 1st way
//interface Rectangle {
//    public void draw();
//}
//
//class Test implements Rectangle{
//
//    @Override
//    public void draw() {
//        System.out.println("Drawing...");
//    }
//}

//2nd way
interface Rectangle{
    void draw();
}

public class Demo6 {
    public static void main(String[] args) {
        // 1st way
//        Test test = new Test();
//        test.draw();

        // 2nd way (without using lambda
//        Rectangle rectangle = new Rectangle() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing");
//            }
//        };
//        rectangle.draw();

        //3rd way using lambda
        Rectangle rectangle = () -> {
            System.out.println("Drawing...");
        };
        rectangle.draw();
    }

}