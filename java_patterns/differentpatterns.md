
# Java Pattern Programs

This document provides examples of common pattern printing programs in Java using loops. Each section includes a visual example of the pattern and the corresponding Java code.

---

## 1. Diamond Patterns

### a) Diamond with Stars

**Pattern:**
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

**Java Code:**
```java
public class DiamondStarPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}
```

---

### b) Diamond with Numbers

**Pattern:**
```
    1
   123
  12345
 1234567
123456789
 1234567
  12345
   123
    1
```

**Java Code:**
```java
public class DiamondNumberPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print(j);
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print(j);
            System.out.println();
        }
    }
}
```

---

### c) Diamond with Letters

**Pattern:**
```
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
```

**Java Code:**
```java
public class DiamondAlphabetPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 0; j < (2 * i - 1); j++) System.out.print((char)('A' + j));
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 0; j < (2 * i - 1); j++) System.out.print((char)('A' + j));
            System.out.println();
        }
    }
}
```

---

## 2. Sandglass / Hourglass Star Pattern

**Pattern:**
```
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
```

**Java Code:**
```java
public class SandglassPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}
```

---

## 3. Trapezium Pattern

**Pattern:**
```
*****
 ****
  ***
   **
    *
```

**Java Code:**
```java
public class TrapeziumPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = n; j > i; j--) System.out.print("*");
            System.out.println();
        }
    }
}
```

---

## 4. Pant-Style Pattern

**Pattern:**
```
*       *
 *     *
  *   *
   * *
    *
```

**Java Code:**
```java
public class PantStylePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < 2 * (n - i - 1); j++) System.out.print(" ");
            if (i != n - 1) System.out.print("*");
            System.out.println();
        }
    }
}
```

---

## 5. Multiplication Table Pattern

**Pattern:**
```
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
```

**Java Code:**
```java
public class MultiplicationTablePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 6. Pattern with Numbers and Stars

**Pattern:**
```
*1
*2*
*3*4*
*5*6*7*
```

**Java Code:**
```java
public class NumberStarCombo {
    public static void main(String[] args) {
        int n = 4, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + num);
                num++;
            }
            System.out.println("*");
        }
    }
}
```

---

## 7. Odd Number Triangle Pattern

**Pattern:**
```
1
3 5
7 9 11
13 15 17 19
```

**Java Code:**
```java
public class OddNumberTriangle {
    public static void main(String[] args) {
        int n = 4, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}
```

---

## 8. Random Number/Character Pattern

**Pattern:**
```
2 4 1 3 5
5 3 2 4 1
```

**Java Code:**
```java
public class RandomNumberPattern {
    public static void main(String[] args) {
        int[][] arr = { {2, 4, 1, 3, 5}, {5, 3, 2, 4, 1} };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
