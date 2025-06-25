
# Java Star (Asterisk) Pattern Programs

This document contains Java programs for various star pattern types with detailed comments explaining the logic.

## 1. Square and Rectangle of Stars

**Pattern:**
```
*****
*****
*****
*****
*****
```

```java
public class SquareStarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows and columns

        // Loop over each row
        for (int i = 0; i < n; i++) {
            // Loop over each column in the row
            for (int j = 0; j < n; j++) {
                System.out.print("*"); // Print star without space for compact square
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
```

## 2. Left-Aligned Triangle (Half Pyramid) of Stars

**Pattern:**
```
*
**
***
****
*****
```

```java
public class LeftAlignedTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop over each row
        for (int i = 1; i <= n; i++) {
            // Print stars equal to the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
```

## 3. Right-Aligned Triangle (Half Pyramid) of Stars

**Pattern:**
```
    *
   **
  ***
 ****
*****
```

```java
public class RightAlignedTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop over each row
        for (int i = 1; i <= n; i++) {
            // Print spaces before stars for right alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
```

## 4. Full Pyramid of Stars

**Pattern:**
```
    *
   ***
  *****
 *******
*********
```

```java
public class FullPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop over each row
        for (int i = 1; i <= n; i++) {
            // Print spaces to center the pyramid
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars: (2*i - 1) stars in the i-th row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
```

## 5. Inverted Pyramid or Triangle of Stars

**Pattern:**
```
*********
 *******
  *****
   ***
    *
```

```java
public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop from n down to 1 for inverted pyramid
        for (int i = n; i >= 1; i--) {
            // Print spaces for centering
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars: (2*i - 1) stars in the i-th row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
```

## 6. Diamond-Shaped Star Pattern

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

```java
public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for upper half

        // Upper half including middle row
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half excluding middle row
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## 7a. Hollow Square Star Pattern

**Pattern:**
```
*****
*   *
*   *
*   *
*****
```

```java
public class HollowSquare {
    public static void main(String[] args) {
        int n = 5; // Size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
```

## 7b. Hollow Pyramid Star Pattern

**Pattern:**
```
    *
   * *
  *   *
 *     *
*********
```

```java
public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
```

## 7c. Hollow Diamond Star Pattern

**Pattern:**
```
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
```

```java
public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Upper half of hollow diamond
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) System.out.print("*");
            for (int k = 0; k < 2 * i; k++) System.out.print(" ");
            for (int j = i; j < n; j++) System.out.print("*");
            System.out.println();
        }

        // Lower half of hollow diamond
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print("*");
            for (int k = 2 * (n - i - 1); k > 0; k--) System.out.print(" ");
            for (int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
```
