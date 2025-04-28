class Solution {
    public boolean check(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) cnt++;
            if(i+1 == nums.length && nums[i]>nums[0] && cnt>0) return false;
        }

        if(cnt>1) return false;
        else return true;
    }
}