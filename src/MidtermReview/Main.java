package MidtermReview;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "David", "a", 100);
        Student student2 = new Student(2, "Vu", "v",90);
        Student student3 = new Student(3, "Dean", "s",95);
        Student student4 = new Student(3, "Mike", "b",95);
        Student student5 = new Student(3, "Salem", "r",95);

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


        FirstNameComparator firstNameComparator = new FirstNameComparator();

        //
        Collections.sort(studentList, (Student st1, Student st2) -> {
            return st1.getLastName().compareTo(st2.getLastName());
        });

        // using anonymous class
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getLastName().compareTo(st2.getLastName());
            }
        });

        Collections.sort(studentList, Comparator.comparing(Student::getLastName));

        // first way
        Collections.sort(studentList, firstNameComparator);


        System.out.println(studentList.toString());
    }


}
