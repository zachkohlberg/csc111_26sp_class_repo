# Week 6 Notes

subset sum solution (7.6.3):

```java
public boolean subsetSum(int start, int[] nums, int target) {
    if (target == 0) {
        return true;
    } else if (start == nums.length) {
        return false;
    } else {
        return subsetSum(start + 1, nums, target) || subsetSum(start + 1, nums, target - nums[start]);
    }
}
```
