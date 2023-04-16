class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        boolean found = false;
        
        for(int i=0; i<nums.length&&!found;i++) {
            int a = nums[i];
            int b = target-a;
            
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j]==b) {
                    found=true;
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        } 
        return res;
    }
}