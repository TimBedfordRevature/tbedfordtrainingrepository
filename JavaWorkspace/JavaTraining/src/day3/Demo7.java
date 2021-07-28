package day3;
// StringBuffer
public class Demo7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        sb.replace(1,3,"World");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());

        StringBuffer s = new StringBuffer();
        System.out.println(s.capacity()); // 16 Default capacity
    }
}
