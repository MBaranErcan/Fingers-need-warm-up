class Solution {
    public int maxProduct(int[] nums) {
        
        int ans = 0;
        
        if(nums.length <= 1) return nums[0];
        
        for (int i=0; i<nums.length; i++) {
            int product = 1;
            for(int j=i; j<nums.length; j++) {
                product = (product*nums[j]);
                ans = Math.max(product, ans);
        
            }
        }
           
        return ans;
    }
}