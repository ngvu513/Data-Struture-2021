package MidtermReview;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "David", "ln1", 100);
        Student student2 = new Student(2, "Vu", "ln2",90);
        Student student3 = new Student(3, "Dean", "ln3",95);
        Student student4 = new Student(3, "Mike", "ln3",95);
        Student student5 = new Student(3, "Salem", "ln3",95);

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


        FirstNameComparator firstNameComparator = new FirstNameComparator();
        Collections.sort(studentList, firstNameComparator);

        System.out.println(studentList.toString());
    }
}
