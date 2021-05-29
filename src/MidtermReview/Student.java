package MidtermReview;

public class Student implements Comparable<Student>{
    private int sid;
    private String firstName;
    private String lastName;
    private int score;


    public Student(int sid, String firstName, String lastName, int score) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", score=" + score +
                '}';
    }




    @Override
    public int compareTo(Student o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
}
