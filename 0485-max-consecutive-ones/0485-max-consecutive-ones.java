class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int max_ones=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                max_ones = Math.max(cnt,max_ones);
                System.out.println(max_ones);
                cnt=0;
            }
        }

        max_ones = Math.max(cnt,max_ones);

        return max_ones;
    }
}