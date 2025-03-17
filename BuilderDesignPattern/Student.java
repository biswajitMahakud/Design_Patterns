public class Student {
    private final int studentId;
    private final String name;
    private final int age;
    private final double marks;
    private final String emailId;
    private final String phone;
    private final String address;

    private Student(StudentBuilder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.age = builder.age;
        this.marks = builder.marks;
        this.emailId = builder.emailId;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", marks=" + marks + ", emailId="
                + emailId + ", phone=" + phone + ", address=" + address + "]";
    }

    public static class StudentBuilder {
        private int studentId;
        private String name;
        private int age;
        private double marks;
        private String emailId;
        private String phone;
        private String address;

        public StudentBuilder() {

        }

        public StudentBuilder setStudentId(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setMarks(double marks) {
            this.marks = marks;
            return this;
        }

        public StudentBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}