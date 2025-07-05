
# LeetCode 319: Bulb Switcher

## Problem Statement

There are `n` bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off, or turning off if it's on). You continue this process for `n` rounds.

Return the number of bulbs that are **on** after `n` rounds.

---

## Explanation

### Key Insight:

Each bulb is toggled in rounds corresponding to its **factors**. For example, bulb 6 is toggled in rounds 1, 2, 3, and 6. A bulb ends up **on** only if it is toggled an **odd number of times**.

### When does that happen?

A number has an **odd number of factors** only when it is a **perfect square**. For example:

- 1 → [1]
- 4 → [1, 2, 4]
- 9 → [1, 3, 9]

All other numbers have even number of factors because factors usually come in pairs `(a * b = n)`.

---

## Solution

So, the number of bulbs that remain **on** after `n` rounds is simply the **number of perfect squares ≤ n**.

This is calculated by:

```
Math.sqrt(n)
```

For example:

- n = 3 → bulbs on: 1 (only bulb 1)
- n = 10 → bulbs on: 3 (bulbs 1, 4, 9)

### Code

```java
class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
```

### Time Complexity

- **O(1)** — We perform a constant-time square root operation.
