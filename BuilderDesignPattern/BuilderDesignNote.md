# Builder Design Pattern

The Builder Design Pattern is a creational design pattern that allows for the step-by-step creation of complex objects. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

## Key Concepts

- **Builder**: An interface or abstract class defining the steps to build the product.
- **ConcreteBuilder**: A class that implements the Builder interface and provides specific implementations for the building steps.
- **Product**: The complex object that is being built.
- **Director**: A class that constructs the object using the Builder interface.

## When to Use

- When the construction process of an object is complex.
- When you want to create different representations of a product using the same construction process.
- When you want to construct an object step-by-step.

## UML Diagram

```
+-----------------+       +-----------------+
|     Director    |       |     Builder     |
+-----------------+       +-----------------+
| - builder: Builder |<----| + buildPartA()  |
| + construct()     |       | + buildPartB()  |
+-----------------+       +-----------------+
    |                         ^
    |                         |
    v                         |
+-----------------+       +-----------------+
| ConcreteBuilder |       |     Product     |
+-----------------+       +-----------------+
| + buildPartA()  |       | - partA         |
| + buildPartB()  |       | - partB         |
| + getResult()   |       | + show()        |
+-----------------+       +-----------------+
```

## Example

### Builder Interface

```java
public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
```

### ConcreteBuilder

```java
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
    product.add("Part A");
    }

    @Override
    public void buildPartB() {
    product.add("Part B");
    }

    @Override
    public Product getResult() {
    return product;
    }
}
```

### Product

```java
import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
    parts.add(part);
    }

    public void show() {
    for (String part : parts) {
        System.out.println(part);
    }
    }
}
```

### Director

```java
public class Director {
    private Builder builder;

    public Director(Builder builder) {
    this.builder = builder;
    }

    public void construct() {
    builder.buildPartA();
    builder.buildPartB();
    }
}
```

### Client

```java
public class Client {
    public static void main(String[] args) {
    Builder builder = new ConcreteBuilder();
    Director director = new Director(builder);
    director.construct();
    Product product = builder.getResult();
    product.show();
    }
}
```

## Advantages

- Provides control over the construction process.
- Allows for the creation of complex objects in a step-by-step manner.
- Encapsulates the construction and representation of objects.

## Disadvantages

- Can be more complex than other creational patterns due to the additional classes involved.
- Requires the client to be aware of the builder and director classes.
