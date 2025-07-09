
# Java Inner Classes

Java allows you to define a class within another class — known as an **inner class**. Inner classes are used to logically group classes and increase encapsulation.

---

## 🔹 1. Regular (Non-Static) Inner Class

### ✅ Definition:
A non-static inner class is associated with an instance of the outer class. To instantiate it, you need an object of the outer class.

### 📌 Example:

```java
class Library {
    String libraryName = "City Library";

    class Book {
        String bookTitle = "Java Basics";

        void display() {
            System.out.println(bookTitle + " at " + libraryName);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Library.Book book = library.new Book();
        book.display();
    }
}
```

### 🧠 Explanation:
- `Library` is the outer class.
- `Book` is the inner class.
- We create an object of `Library`, then use it to create an object of `Book`.
- Output: `Java Basics at City Library`

---

## 🔹 2. Private Inner Class

### ✅ Definition:
A private inner class is accessible only within the outer class. It cannot be accessed directly from outside classes.

### 📌 Example:

```java
class Computer {
    private class Processor {
        void showDetails() {
            System.out.println("Intel i7 Processor");
        }
    }

    void accessProcessor() {
        Processor p = new Processor();
        p.showDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.accessProcessor(); // Valid
        // c.new Processor(); // ❌ Error: Processor is private
    }
}
```

### 🧠 Explanation:
- `Processor` is private, so only `Computer` can access it.
- External instantiation will throw an error.

---

## 🔹 3. Static Inner Class

### ✅ Definition:
A static inner class **does not need** an instance of the outer class to be instantiated.

### 📌 Example:

```java
class University {
    static class Department {
        void printDepartment() {
            System.out.println("Computer Science Department");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        University.Department dept = new University.Department();
        dept.printDepartment();
    }
}
```

### 🧠 Explanation:
- `Department` is static, so it’s accessed directly via the outer class name.
- Output: `Computer Science Department`

---

## 🔹 4. Accessing Outer Class from Inner Class

### ✅ Definition:
A non-static inner class can directly access members of its outer class.

### 📌 Example:

```java
class Car {
    String model = "Tesla";

    class Engine {
        void showModel() {
            System.out.println("Car model is " + model);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.showModel();
    }
}
```

### 🧠 Explanation:
- `Engine` accesses the `model` variable of `Car` directly.
- Output: `Car model is Tesla`

---

## 📌 Summary Table

| Type                  | Access Modifier | Needs Outer Object | Can Access Outer Members |
|-----------------------|-----------------|---------------------|---------------------------|
| Regular Inner Class   | Public/Default  | ✅ Yes              | ✅ Yes                    |
| Private Inner Class   | Private         | ✅ Yes              | ✅ Yes                    |
| Static Inner Class    | Any             | ❌ No               | ❌ No                     |

---

## 📎 Use Cases of Inner Classes

- Logical grouping of classes
- Better encapsulation
- Creating helper classes used only within outer class
