package ArrayList;

public class Student {
    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public void displayStudent() {
        System.out.println("Student ID : " + this.id);
        System.out.println("Student name : " + this.name);
        System.out.println("Student mark : " + this.mark);
    }

    public int getId() {
        return this.id;
    }
}
