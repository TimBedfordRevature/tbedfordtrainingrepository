package day1;

public class Book {

    public static String title;
    public static String author;
    public static int price;

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java 101";
        book1.author = "Dr. Lasisi";
        book1.price = 50;
        book1.printBook();
    }

    public static void printBook(){
        System.out.println("day1.Book: \nTitle: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}
