package Comparator;

public class Student implements Comparable<Student>{
    private int sid;
    private String sname;
    private int score;

    public Student(int sid, String sname, int score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getScore() == o.getScore()) {
            return 0;
        } else {
            if(this.getScore() > o.getScore())
                return 1;
        }
        return -1;
    }
}
