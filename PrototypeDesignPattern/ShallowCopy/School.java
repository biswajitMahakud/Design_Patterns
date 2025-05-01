public class School implements Cloneable{
    private String schoolName;
    private String schoolAddress;
    private Student stdObj;
    //constructor
    public School(String schoolName, String schoolAddress, Student stdObj) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.stdObj = stdObj;
    }
    //getters and setters
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getSchoolAddress() {
        return schoolAddress;
    }
    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
    public Student getStdObj() {
        return stdObj;
    }
    public void setStdObj(Student stdObj) {
        this.stdObj = stdObj;
    }
    
    //tosString method
    public String toString() {
        return "School [schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + ", stdObj=" + stdObj + "]";
    }

    //clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
