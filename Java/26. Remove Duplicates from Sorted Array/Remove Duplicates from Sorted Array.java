class Solution {
    public int removeDuplicates(int[] nums) { // Use help of *sorted array*
        int k = nums.length > 0 ? 1 : 0;
        for (int n: nums) {
            if (n != nums[k-1])
            nums[k++] = n;
        }
        return k;
    }
}