package SetColection;

public class Course {
    private String cID;
    private String cName;
    private int creditHours;

    public Course(String cID, String cName, int creditHours) {
        this.cID = cID;
        this.cName = cName;
        this.creditHours = creditHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (creditHours != course.creditHours) return false;
        if (cID != null ? !cID.equals(course.cID) : course.cID != null) return false;
        return cName != null ? cName.equals(course.cName) : course.cName == null;
    }

    @Override
    public int hashCode() {
        int result = cID != null ? cID.hashCode() : 0;
        result = 31 * result + (cName != null ? cName.hashCode() : 0);
        result = 31 * result + creditHours;
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cID='" + cID + '\'' +
                ", cName='" + cName + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
}
