# Week 6 Notes

practice exercise: 7.6.2

```java
public boolean checkPalindrome(String s) {
    if (s.length() <= 1) {
        return true;
    } else {
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (first != last) {
            return false;
        }
        String middle = s.substring(1, s.length() - 1);
        return checkPalindrome(middle);
    }
}
```

practice exercise: 7.6.3

```java
public boolean subsetSum(int start, int[] nums, int target) {
    if (target == 0) {
        return true;
    } else if (start >= nums.length) {
        return false;
    } else {
        return subsetSum(start + 1, nums, target - nums[start]) || subsetSum(start + 1, nums, target);
    }
}
```
