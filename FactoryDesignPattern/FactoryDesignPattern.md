
# **Factory Design Pattern – Complete Guide**

The **Factory Design Pattern** is a **creational design pattern** that provides an **interface for creating objects in a superclass**, but **allows subclasses to alter the type of objects that will be created**.

---

## **📌 When to Use Factory Pattern?**
✅ **When object creation logic is complex and should be hidden from the client.**  
✅ **When we need to return different subclasses based on input conditions.**  
✅ **When we want to centralize the creation of objects instead of exposing direct instantiation (new keyword).**  

---

## **📌 Factory Pattern vs Builder Pattern vs Singleton Pattern**

| Feature               | Factory Pattern | Builder Pattern | Singleton Pattern |
|-----------------------|----------------|-----------------|------------------|
| **Use Case**         | Object creation based on conditions | Construct complex objects step by step | Ensures a class has only one instance |
| **Object Complexity**| Handles simple to moderately complex objects | Used when an object has **many optional parameters** | Used for **global access to a single instance** |
| **Flexibility**       | High – Returns different instances based on input | High – Allows **custom configurations** | No flexibility – always returns the **same instance** |
| **Method Chaining**   | ❌ Not supported | ✅ Supports method chaining | ❌ Not applicable |

🔹 **Use Factory when creating objects dynamically based on input conditions.**  
🔹 **Use Builder when the object has many optional attributes and needs custom configurations.**  
🔹 **Use Singleton when you need only one instance of a class across your application.**  

---

# **📌 Factory Design Pattern – Java Implementation**

## **📌 1️⃣ Step 1: Define the Product Interface (Developer)**
```java
public interface Developer {
    void develop();
}
```

---

## **📌 2️⃣ Step 2: Implement Concrete Products**
```java
public class AndroidDeveloper implements Developer {
    @Override
    public void develop() {
        System.out.println("Developing Android App");
    }
}

public class UIDeveloper implements Developer {
    @Override
    public void develop() {
        System.out.println("Designing UI Components");
    }
}

public class SpringbootDeveloper implements Developer {
    @Override
    public void develop() {
        System.out.println("Building Spring Boot Backend");
    }
}
```

---

## **📌 3️⃣ Step 3: Create the Factory Class**
```java
public class DeveloperFactory {
    public static Developer getDeveloper(String type) {
        if (type.equalsIgnoreCase("Android")) {
            return new AndroidDeveloper();
        } else if (type.equalsIgnoreCase("UI")) {
            return new UIDeveloper();
        } else if (type.equalsIgnoreCase("Springboot")) {
            return new SpringbootDeveloper();
        }
        throw new IllegalArgumentException("Unknown developer type: " + type);
    }
}
```

---

## **📌 4️⃣ Step 4: Client Code (Using Factory Pattern)**
```java
public class Client {
    public static void main(String[] args) {
        Developer dev1 = DeveloperFactory.getDeveloper("Android");
        dev1.develop();

        Developer dev2 = DeveloperFactory.getDeveloper("UI");
        dev2.develop();

        Developer dev3 = DeveloperFactory.getDeveloper("Springboot");
        dev3.develop();
    }
}
```

---

## **📌 5️⃣ Output**
```
Developing Android App
Designing UI Components
Building Spring Boot Backend
```

---

# **📌 Advantages and Disadvantages of Factory Pattern**
## **✅ Advantages**
1. **Encapsulation** – Hides object creation logic from the client.
2. **Reusability** – Avoids redundant code by centralizing object creation.
3. **Flexibility** – Returns different objects based on input conditions.
4. **Loose Coupling** – Client code depends on the interface, not concrete implementations.

## **❌ Disadvantages**
1. **Complexity** – Adds an extra layer, increasing complexity.
2. **Maintenance** – Adding new types requires modifying the factory class.
3. **Not Suitable for Small Applications** – Overhead for simple object creation.

---
## **Link (Reference)**
[Visit GFG: Factory Design Pattern](https://www.geeksforgeeks.org/factory-method-for-designing-pattern/)

# **📌 Conclusion**
🔹 The **Factory Pattern is useful when object creation needs to be centralized and hidden from the client.**  
🔹 It **improves code maintainability** by reducing direct dependencies on concrete classes.  
🔹 **Best suited for applications where multiple subclasses are used based on conditions.**  
