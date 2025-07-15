# 000001. two sum

**Difficulty:** Easy  
**Link:** [LeetCode Problem](https://leetcode.com/problems/two-sum/)

---

## 🧠 Problem Statement

Given an array of integers `nums` and an integer `target`, return the **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

---

## ✅ Example

```
Input: nums = [2,7,11,15], target = 9  
Output: [0,1]  
Explanation: nums[0] + nums[1] = 2 + 7 = 9
```

---

## ✅ Approach 1: Brute Force

### 🔍 Logic:
- Use two nested loops to check **every pair** of numbers.
- If their sum matches the target, return their indices.

### 🕒 Time Complexity: `O(n²)`  
### 🧠 Easy to understand but not efficient for large inputs.

---

## ✅ Approach 2: HashMap (Efficient)

### 🔍 Logic:
- Use a HashMap to store each number and its index.
- For every number, check if `target - currentNumber` exists in the map.
- If yes, you found the pair!

### 🕒 Time Complexity: `O(n)`  
### ⚡ Much faster — preferred for interviews.

### 🔁 Step-by-step:
1. Loop through each number in the array.
2. For each number:
   - Calculate what number is needed to reach the target.
   - Check if that number already exists in the map.
   - If yes → solution found.
   - If no → save this number and its index in the map.
