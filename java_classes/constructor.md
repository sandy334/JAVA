
# 🚀 Java Constructors Explained

In Java, a **constructor** is a special method used to **initialize objects** of a class. It is automatically called when a new object is created.

---

## 🧱 1. What is a Constructor?

- Has the **same name** as the class.
- **No return type**, not even `void`.
- Automatically invoked during **object creation** using `new`.

---

## 🛠️ Example 1: Constructor Without Parameters (Default Constructor)

```java
public class Student {
    String name;
    int rollNo;

    // Constructor with no parameters
    public Student() {
        name = "Default Name";
        rollNo = 1;
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Constructor is called here
        System.out.println(s1.name + " - " + s1.rollNo);
    }
}
```

### ✅ Output:
```
Default Name - 1
```

### 🔍 Explanation:
- The constructor `Student()` sets default values.
- When the object `s1` is created, the constructor is automatically called.

---

## 🧳 Example 2: Constructor With Parameters

```java
public class Student {
    String name;
    int rollNo;

    // Constructor with parameters
    public Student(String studentName, int studentRoll) {
        name = studentName;
        rollNo = studentRoll;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aarav", 101);
        System.out.println(s1.name + " - " + s1.rollNo);
    }
}
```

### ✅ Output:
```
Aarav - 101
```

### 🔍 Explanation:
- Parameters let you assign **custom values** to object attributes during creation.
- `Student s1 = new Student("Aarav", 101)` passes values to the constructor.

---

## 🎯 Example 3: Multiple Parameters (More Attributes)

```java
public class Student {
    String name;
    int rollNo;
    String department;

    // Constructor with three parameters
    public Student(String name, int rollNo, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = dept;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Riya", 202, "Computer Science");
        System.out.println(s1.name + " | " + s1.rollNo + " | " + s1.department);
    }
}
```

### ✅ Output:
```
Riya | 202 | Computer Science
```

### 🔍 Explanation:
- Constructor can take **multiple parameters** to initialize different fields.
- `this.name` refers to the **current object’s attribute** and differentiates it from the parameter name.

---

## 💡 Key Notes

| Concept | Description |
|--------|-------------|
| **Constructor Name** | Must be the same as the class name |
| **Return Type** | Constructors do **not** have a return type |
| **When Called?** | Automatically when `new` object is created |
| **Default Constructor** | Provided by Java if no constructor is defined |
| **Custom Constructor** | You can define constructors with or without parameters |

---

## 📘 Summary

Constructors in Java are essential for initializing object data. You can use:
- **No-argument constructors** for default values.
- **Parameterized constructors** to pass custom values.
- Combine both for more flexibility by using **constructor overloading** (not shown here).

Let constructors do the heavy lifting during object creation!

