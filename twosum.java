/* Brute force approach:

One brute force approach is to consider every pair of elements and check if their sum equals the target. 
This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, 
and the inner loop iterates from the next element to the last element. However, this approach has a time complexity of O(n^2).

- Nested 'for' loop
  - For each element 'x'
    - We will want to perform another nested 'for' loop to find 'y', where x+y is equal to target
    
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }
}
