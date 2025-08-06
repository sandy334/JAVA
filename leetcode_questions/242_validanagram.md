# Leetcode 242 - Valid Anagram

### 🧩 Problem Summary

Given two strings `s` and `t`, the goal is to determine if `t` is an **anagram** of `s`. An anagram is a word or phrase formed by rearranging the letters of another, using all original letters exactly once.

---

### 🧠 Main Idea

The most efficient way to solve this problem is to use a **frequency count**. If two strings are anagrams, they must have the exact same characters with the exact same number of occurrences. We use an array to count character frequencies in the first string and then decrement the counts while iterating through the second string.

---

### 🧱 Code Walkthrough

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        // Initial Check: If lengths differ, they can't be anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // Initialize an array to store character counts (for 'a' through 'z').
        int[] count = new int[26];

        // Step 1: Count character frequencies in string 's'.
        // 's.charAt(i) - 'a'' converts a character to a 0-25 index.
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Step 2: Decrement counts for characters in string 't' and validate.
        for (int i = 0; i < t.length(); i++) {
            // If a character in 't' has a count of 0, it means 't' has an
            // extra character or 's' didn't have this character.
            if (count[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            // Decrement the count as we 'use up' a character from 's'.
            count[t.charAt(i) - 'a']--;
        }
        
        // Step 3: If all characters matched perfectly, return true.
        // If we reach here, all characters in 't' were found in 's' with matching frequencies.
        return true;
    }
}