# Prototype Design Pattern

## Introduction
The **Prototype Design Pattern** is a **creational design pattern** that allows cloning of existing objects without depending on their concrete classes. Instead of creating a new object from scratch, an existing object is copied (cloned), which can be modified if needed.

This pattern is useful when the cost of creating an object is expensive, and cloning an existing instance improves performance.

---

## When to Use Prototype Design Pattern?
- When object creation is expensive and time-consuming.
- When we need to avoid complex object initialization.
- When an application needs multiple instances of similar objects.
- When a class has a fixed number of runtime configurations.
- When objects need to be created dynamically at runtime with little modification.

---

## Advantages of Prototype Design Pattern
✅ **Reduces the overhead** of creating objects from scratch.
✅ **Improves performance**, especially for expensive object creation.
✅ **Simplifies object creation** for objects with complex structures.
✅ **Avoids subclassing** by allowing cloning without knowing the exact class type.
✅ **Encapsulates object creation logic** inside the prototype.

---

## Disadvantages of Prototype Design Pattern
❌ **Deep cloning complexity** – If objects have complex nested references, deep copying can be tricky.
❌ **Not ideal for simple objects** – If object creation is not costly, a factory method may be a better approach.
❌ **Difficult to implement in some languages** that do not support cloning.

---

## Prototype Design Pattern UML Diagram
```
+------------------+
|    Prototype    |
|------------------|
| +clone(): Obj   |
+------------------+
       ▲  ▲
       |  |
+--------------+   +---------------+
| ConcreteProto|   | ConcreteProto |
| Type1        |   | Type2         |
|--------------|   |---------------|
| +clone()     |   | +clone()      |
+--------------+   +---------------+
```

---

## Implementation of Prototype Design Pattern
### Step 1: Create the Prototype Interface
```java
public interface Prototype {
    Prototype clone();
}
```

### Step 2: Implement Concrete Prototype Classes
```java
public class Employee implements Prototype {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public Prototype clone() {
        return new Employee(name, department);
    }

    public void showDetails() {
        System.out.println("Employee: " + name + ", Department: " + department);
    }
}
```

### Step 3: Using the Prototype Pattern
```java
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", "IT");
        emp1.showDetails();

        // Cloning Employee object
        Employee emp2 = (Employee) emp1.clone();
        emp2.showDetails();
    }
}
```

### Output:
```
Employee: John Doe, Department: IT
Employee: John Doe, Department: IT
```

---

## Deep vs. Shallow Cloning
- **Shallow Copy:** Copies field values but keeps references shared.
- **Deep Copy:** Clones all objects recursively to avoid shared references.

### Implementing Deep Copy
```java
public class Address implements Cloneable {
    String city;
    public Address(String city) { this.city = city; }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city);
    }
}
```

```java
public class Person implements Cloneable {
    private String name;
    private Address address;
    
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(this.name, (Address) this.address.clone());
    }
}
```

---

## When to Use Factory vs. Prototype Design Pattern?
| Feature              | Factory Pattern            | Prototype Pattern          |
|----------------------|---------------------------|----------------------------|
| **Purpose**         | Creates new objects       | Clones existing objects    |
| **Object Creation** | Creates a fresh instance  | Uses an existing instance  |
| **Performance**     | Can be expensive          | More efficient in cloning  |
| **Flexibility**     | Provides more abstraction | Faster object replication  |
| **Use Case**        | When new instances differ | When objects are similar   |

---

## Conclusion
The **Prototype Design Pattern** is a useful creational pattern that allows cloning objects instead of creating new ones from scratch. It improves performance and reduces object initialization overhead.

Use it when:
- Object creation is expensive.
- You need multiple instances of similar objects.
- You want to simplify object initialization.

However, be mindful of deep vs. shallow cloning complexities when dealing with nested objects!

---

### Related Design Patterns
- **Factory Pattern** – Creates new objects instead of cloning existing ones.
- **Singleton Pattern** – Ensures only one instance of a class exists.
- **Builder Pattern** – Used to create complex objects step-by-step.

Happy Coding! 🚀

