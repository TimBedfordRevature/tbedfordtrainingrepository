package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student other) {
        if (rollNumber > other.rollNumber)
            return 1;
        else if (rollNumber < other.rollNumber)
            return -1;
        else
            return 0;
    }
}

class SortByAge implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age > s2.age)
            return 1;
        else if (s1.age < s2.age)
            return -1;
        else
            return 0;
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return  s1.name.compareTo(s2.name);
    }
}


public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Tim", 22));
        students.add(new Student(1, "Nick", 23));
        students.add(new Student(3, "Chris", 24));

        System.out.println("Before sorting...");
        for (Student student : students) {
            System.out.println(student);
        }


//        System.out.println("Comparator sort, sort by age:");
//        Collections.sort(students, new SortByAge());
        System.out.println("Comparator sort, sort by name:");
        Collections.sort(students, new SortByName());
        for (Student student : students) {
            System.out.println(student);
        }

//        Collections.sort(students);
//        System.out.println("After sorting...");
//        for(Student student: students){
//            System.out.println(student);
//        }

    }
}
