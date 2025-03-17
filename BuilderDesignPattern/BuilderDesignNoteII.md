# **Builder Design Pattern – Complete Guide**

The **Builder Design Pattern** is a **creational pattern** that provides a way to **construct complex objects step by step**. Instead of using a large constructor with multiple parameters, we use a **Builder class** that helps in **gradual object creation** with better readability.

---

## **📌 When to Use Builder Pattern?**
✅ **When an object has too many attributes**, some of which may be **optional**.  
✅ **When a constructor has too many parameters** (Telescoping Constructor Problem).  
✅ **When we need immutability** and want to build objects step by step.  
✅ **When objects should be created with flexible configurations**.  

---

## **📌 Builder vs Factory vs Singleton**

| Feature               | Builder Pattern | Factory Pattern | Singleton Pattern |
|-----------------------|----------------|-----------------|------------------|
| **Use Case**         | Construct complex objects step by step | Creates objects without exposing instantiation logic | Ensures a class has only one instance |
| **Object Complexity**| Used when the object has **many optional parameters** | Simple object creation logic | Used for **global access to a single instance** |
| **Flexibility**       | High – allows **customization** | Limited – returns an instance based on input | No flexibility – always returns the **same instance** |
| **Immutability**      | Encourages **immutable objects** | Not necessarily immutable | Can be immutable if designed properly |
| **Method Chaining**   | ✅ Supports method chaining | ❌ Does not support method chaining | ❌ Not applicable |

🔹 **Use Builder when the object has many optional attributes and needs custom configurations.**  
🔹 **Use Factory when you need to create objects dynamically based on input.**  
🔹 **Use Singleton when you need only one instance of a class across your application.**  

---

# **📌 Builder Design Pattern – Java Implementation**

## **📌 1️⃣ Step 1: Define the Product Class (User)**
```java
public class User {
    // Required parameters
    private final String firstName;
    private final String lastName;

    // Optional parameters
    private final int age;
    private final String email;
    private final String phoneNumber;
    private final String address;

    // Private constructor to enforce usage of Builder
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "User { " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                " }";
    }

    // Static Builder Class
    public static class UserBuilder {
        // Required parameters
        private final String firstName;
        private final String lastName;

        // Optional parameters (initialized with default values)
        private int age = 0;
        private String email = "";
        private String phoneNumber = "";
        private String address = "";

        // Constructor with required parameters
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter methods for optional fields (returning builder for method chaining)
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        // Build method to create User object
        public User build() {
            return new User(this);
        }
    }
}
```

---

## **📌 2️⃣ Step 2: Client Code (Using Builder)**
```java
public class Client {
    public static void main(String[] args) {
        // Creating a User with required fields only
        User user1 = new User.UserBuilder("John", "Doe").build();
        System.out.println(user1);

        // Creating a User with all optional fields
        User user2 = new User.UserBuilder("Alice", "Smith")
                .setAge(25)
                .setEmail("alice@example.com")
                .setPhoneNumber("123-456-7890")
                .setAddress("123 Main St, NY")
                .build();
        System.out.println(user2);

        // Creating a User with some optional fields
        User user3 = new User.UserBuilder("Bob", "Marley")
                .setAge(30)
                .setPhoneNumber("987-654-3210")
                .build();
        System.out.println(user3);
    }
}
```

---

## **📌 3️⃣ Output**
```
User { firstName='John', lastName='Doe', age=0, email='', phoneNumber='', address='' }
User { firstName='Alice', lastName='Smith', age=25, email='alice@example.com', phoneNumber='123-456-7890', address='123 Main St, NY' }
User { firstName='Bob', lastName='Marley', age=30, email='', phoneNumber='987-654-3210', address='' }
```

---

# **📌 Advantages and Disadvantages of Builder Pattern**
## **✅ Advantages**
1. **Better Readability** – No need for long constructors with multiple parameters.
2. **Immutability** – Objects are immutable since all attributes are final.
3. **Method Chaining** – Supports method chaining for flexible object creation.
4. **Scalability** – Easily add new fields without breaking existing code.
5. **Encapsulation** – Hides the complex creation process from the client.

## **❌ Disadvantages**
1. **More Code** – Requires a separate builder class, increasing code size.
2. **Overhead** – Might be unnecessary if the object has only a few fields.
3. **Memory Usage** – Requires an additional builder instance before constructing the object.

---

# **📌 Conclusion**
🔹 The **Builder Pattern is useful when creating objects with many optional parameters**.  
🔹 It **improves code readability and maintainability** compared to complex constructors.  
🔹 Use **Factory Pattern for simpler object creation** and **Singleton when only one instance is needed**.  

