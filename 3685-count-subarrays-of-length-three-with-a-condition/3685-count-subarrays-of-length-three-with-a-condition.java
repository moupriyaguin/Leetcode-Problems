class Solution {
    public int countSubarrays(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            int x = nums[i-1];
            int y = nums[i+1];
            float z = (float)nums[i]/2;
            if((x+y) == z){
                count++;
            }
        }

        return count;
    }
}