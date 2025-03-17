public class Application {
    public static void main(String[] args) {
        Student std = new Student.StudentBuilder()
                .setAddress("Bhubaneswar")
                .setAge(22)
                .setEmailId("biswajit@dev.com")
                .setMarks(450)
                .setName("Biswajit Mahakud")
                .setPhone("9692098634")
                .setStudentId(101)
                .build();

        System.out.println(std);

        Student std2 = new Student.StudentBuilder()
                .setName("Harihara Pradhan")
                .setAge(26)
                .setEmailId("harihara@dev.com")
                .build();

        System.out.println(std2);
    }
}
