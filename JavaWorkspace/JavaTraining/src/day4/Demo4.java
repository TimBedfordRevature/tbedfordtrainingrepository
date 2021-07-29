package day4;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    public int id;
    public String name;
    public String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public java.lang.String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Tim", "@mail1");
        Student student2 = new Student(2,"Nick", "@mail1");
        Student student3 = new Student(3,"Chris", "@mail1");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //iterator
        Iterator iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
