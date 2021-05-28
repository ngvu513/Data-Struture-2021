package MidtermReview;

import java.util.ArrayList;
import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student(1, "David", "ln1", 100);
        Student student2 = new Student(2, "Vu", "ln2",90);
        Student student3 = new Student(3, "Dean", "ln3",95);
        Student student4 = new Student(3, "Mike", "ln3",95);
        Student student5 = new Student(3, "Salem", "ln3",95);

        studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);
        studentStack.push(student4);
        studentStack.push(student5);

        while(!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            arrayList.add(student);
        }






    }
}
