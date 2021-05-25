package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Name1", 100);
        Student student2 = new Student(2, "Name2", 90);
        Student student3 = new Student(3, "Name3", 95);

        List<Student> studentList = new ArrayList<>();



        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        ScoreComparator scoreComparator = new ScoreComparator();
        NameComparator nameComparator = new NameComparator();


        for (Student student: studentList) {
            if(student1.equals(student2)) {

            }

            if(scoreComparator.compare(student1, student2) == 0) {

            }
            if(nameComparator.compare(student1, student2) == 0) {

            }

        }


        Collections.sort(studentList, nameComparator);
        Collections.sort(studentList, scoreComparator);

    }

}
