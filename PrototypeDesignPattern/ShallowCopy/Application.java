public class Application {
    public static void main(String[] args) {
        Student stdObj = new Student("John", 20, "1234, Main Street, New York, NY");
        School schoolObj = new School("ABC School", "5678, Cross Street, New York, NY", stdObj);
        System.out.println("Main Student object: " + stdObj);
        System.out.println("Main School object: " + schoolObj);

        try{
           School newSchool = (School) schoolObj.clone();
           newSchool.getStdObj().setName("Rahul");
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("After changing name by using cloned object: ");
        System.out.println("Accessing main School object for checking student name: " + schoolObj.getStdObj().getName());
        System.out.println("Student name: " + stdObj.getName());
    }
}
