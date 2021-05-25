package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Student student1 = new Student(1, "Name1", 100);
        Student student2 = new Student(2, "Name2", 90);
        Student student3 = new Student(3, "Name3", 95);

        Student student5 = new Student(5, "Name5", 95);


        students.add(student1);
        students.add(student2);
        students.add(student3);


        for(int i = 0; i < students.size(); i++) { // O(n)
            Student temp = students.get(i); // O(n)
            if(temp.equals(student5))
             System.out.println("Equal");
        }
        // O(n^2)

        Iterator<Student> studentListIterator = students.iterator();
        Student tempStudent = students.getFirst();

        while (studentListIterator.hasNext()) {
            if(tempStudent.equals(student5))
                System.out.println("Equal");
            tempStudent = studentListIterator.next();
        }
        // O(n)



    }
}
