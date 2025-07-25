# Contains Duplicate

## Problem Description

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and `false` if every element is distinct.

**Example 1:**
Input: `nums = [1,2,3,1]`
Output: `true`

**Example 2:**
Input: `nums = [1,2,3,4]`
Output: `false`

**Example 3:**
Input: `nums = [1,1,1,3,3,4,3,2,4,2]`
Output: `true`

**Constraints:**
* $1 \le nums.length \le 10^5$
* $-10^9 \le nums[i] \le 10^9$

## Solution Approach (High-Level)

The most straightforward way to solve this problem is by using a **hash set** (or hash table). A hash set allows for $O(1)$ average time complexity for insertions and lookups.

1.  Initialize an empty hash set.
2.  Iterate through each number in the input array `nums`.
3.  For each number, check if it already exists in the hash set.
    * If it exists, we've found a **duplicate**, so return `true`.
    * If it doesn't exist, add the number to the hash set.
4.  If the loop completes without finding any duplicates, return `false`.

## Java Solution

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}