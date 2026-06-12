import javax.swing.*;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Person {
    String name;
    int age;
    int height;
    Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    private final int rollNo;
    private final int marks;

    Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }
}

class Customer {
}

public class Test {
    Test() {
        System.out.println(this);
        System.out.println(super.toString());
        System.out.println(this.hashCode());
    }


    public static void main(String[] args) throws Exception {

//        Student st = new Student("John", 20, 101, 85);
//        System.out.println("Name: " + st.name);
//        System.out.println("Age: " + st.age);
//        System.out.println("Roll No: " + st.rollNo);
//        System.out.println("Marks: " + st.marks);

        //Test t = new Test();
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        Object O = Class.forName(args[0]).getDeclaredConstructor().newInstance();
//        System.out.println("Object Created :" + O.getClass().getName());
//        List<Integer> integers = List.of(1, 2, 3, 4, 5);
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        List<Integer> InputIntegers = List.of(1, 2, 3, 4, 5);
//        for (Integer integer : InputIntegers) {
//            System.out.println(integer);
    List<String> names = Arrays.asList("Hello", "World", "Java", "Pro");
        names.forEach(System.out ::println);
        names.sort((str1,str2) -> Integer.compare(str1.length(),str2.length()));
        System.out.println("Sorted by length:" + names);


    }

}
