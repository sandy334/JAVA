
# 🔒 Java Encapsulation

**Encapsulation** is one of the four fundamental OOP concepts in Java. It means **hiding the internal details** of how an object works and **protecting sensitive data** from outside interference.

---

## 🧠 Why Use Encapsulation?

- ✅ Protects data from unintended modification
- ✅ Helps in achieving **data hiding**
- ✅ Allows controlled access via **getters** and **setters**
- ✅ Enhances code maintainability and flexibility

---

## 📦 How to Implement Encapsulation in Java

To implement encapsulation:
1. Declare the class variables as **private**
2. Provide **public getter and setter** methods to access and modify the private variables

---

## 🧪 Example: Encapsulation Using a `BankAccount` Class

```java
public class BankAccount {
    private double balance;  // private = restricted access

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
```

### 🔍 Explanation:
- The `balance` attribute is marked **private** and can only be accessed via public methods.
- Methods like `deposit` and `withdraw` ensure rules are enforced (e.g., no negative deposits).

---

## 👨‍💻 Using the Encapsulated Class

```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.deposit(1000);           // Deposit money
        account.withdraw(500);           // Withdraw money

        System.out.println("Balance: ₹" + account.getBalance()); // Access balance
    }
}
```

### ✅ Output:
```
Balance: ₹500.0
```

---

## 🔍 What Happens If You Try to Access `balance` Directly?

```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = 1000; // ❌ Error: balance has private access
    }
}
```

### ❌ Compilation Error:
```
Main.java:4: error: balance has private access in BankAccount
        account.balance = 1000;
               ^
```

---

## 📋 Summary

| Feature            | Benefit                                      |
|--------------------|----------------------------------------------|
| `private` fields   | Hide internal data from outside access       |
| `get` method       | Allows read access                           |
| `set` method       | Allows controlled write access               |
| Method validation  | Adds logic before data is changed            |

---

## 🚦 Best Practices

- Use **meaningful method names**: `getName()`, `setAge(int age)`
- Include **validation logic** inside `set` methods
- Make fields **read-only or write-only** as needed

```java
// Read-only field (getter only)
public String getId() {
    return id;
}

// Write-only field (setter only)
public void setPassword(String password) {
    this.password = password;
}
```

Encapsulation keeps your code secure, clean, and flexible! 🔐
