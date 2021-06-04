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
