📘 LeetCode 169: Majority Element
🧠 Problem Statement:
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n/2⌋ times. You may assume that the majority element always exists in the array.

🧮 Example:
Input: nums = [3,2,3]
Output: 3

Input: nums = [2,2,1,1,1,2,2]
Output: 2


---

### 💡 Approach:

The most straightforward way to solve this is by using a **hash map** to count the occurrences of each element. We iterate through the array once. For each number, we update its count in the hash map. As we do this, we also keep track of the element that currently has the highest count. Since the problem guarantees a majority element always exists, the last element we find with the highest count will be our answer.

This approach has a time complexity of $O(n)$ and a space complexity of $O(n)$ in the worst case, as the hash map might need to store all unique elements.

---

### ✅ Code (Java):

```java
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        // A hash map to store each number and its count.
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        // Variables to hold the result and the current highest count.
        int res = 0;
        int majority = 0;

        // Iterate through each number in the array.
        for(int n :nums){
            // Increment the count for the current number.
            // If the number isn't in the map, getOrDefault returns 0.
            hash.put(n,1 + hash.getOrDefault(n,0));
            
            // If the current number's count is higher than the current majority count,
            // update the result and the majority count.
            if(hash.get(n)>majority){
                res = n;
                majority = hash.get(n);
            }
        }
        
        // Return the number that had the highest count.
        return res;
    }
}
