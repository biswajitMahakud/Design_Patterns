package SingletonDesignPattern;

//Lazy way to create singleton object

class Employee{
    private static Employee emp;
    private Employee(){
        
    }

    public static Employee getEmployee(){
        if(emp == null)
            emp = new Employee();
        
        return emp;
    }
}

//eager way to create singleton object

class Student{
    private static Student std = new Student(); //eager way: If we don't need that obj in our application, still It creates object.
    private Student(){

    }

    public static Student getStudent(){
        return std;
    }
}

//Thread safety

/*
 * Let's see If multiple thread executes, there may be a chance thread t1,t2 create diffrent object at same time...
 * If Thread safety is our concern then we need to use object creation inside synchronize block...
 */

 class Doctor{
    private static Doctor doctor;
    private Doctor(){

    }

    public static Doctor getDoctor(){
        if(doctor == null)
        synchronized(Doctor.class){
            doctor = new Doctor();
        }

        return doctor;
    }
 }


public class SingletonDesign{
    public static void main(String[] args) {
        Employee emp1 = Employee.getEmployee();
        Employee emp2 = Employee.getEmployee();
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        Student std1 = Student.getStudent();
        Student std2 = Student.getStudent();
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        System.out.println("Thread Example........");
        Runnable task = () -> {
            Doctor doctor = Doctor.getDoctor();
            System.out.println(Thread.currentThread().getName() + " - " + doctor.hashCode());
        };

        // Run multiple threads simultaneously
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();


    }
}