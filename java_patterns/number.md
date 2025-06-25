
# Java Number Pattern Programs

This document contains Java programs for various number pattern types with detailed comments explaining the logic.

## 1. Simple Number Triangle (Increasing)

**Pattern:**
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

```java
public class IncreasingNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

## 2. Simple Number Triangle (Decreasing)

**Pattern:**
```
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
```

```java
public class DecreasingNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```

## 3. Pyramid of Numbers

**Pattern:**
```
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
```

```java
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
```

## 4. Inverted Pyramid of Numbers

**Pattern:**
```
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
```

```java
public class InvertedNumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
```

## 5. Pascal’s Triangle

**Pattern:**
```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

```java
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
```

## 6. Floyd’s Triangle

**Pattern:**
```
1
2 3
4 5 6
7 8 9 10
```

```java
public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 4;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
```

## 7. Number Square

**Pattern:**
```
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
```

```java
public class NumberSquare {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

## 8. Reverse Number Patterns

**Pattern:**
```
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
```

```java
public class ReverseNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

## 9. Alternate or Repeating Number Patterns

**Pattern:**
```
1 2 1 2 1
2 1 2 1 2
1 2 1 2 1
2 1 2 1 2
1 2 1 2 1
```

```java
public class AlternateNumberPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("2 ");
            }
            System.out.println();
        }
    }
}
```
