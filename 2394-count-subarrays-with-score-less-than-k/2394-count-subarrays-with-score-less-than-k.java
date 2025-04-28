class Solution {
    public long countSubarrays(int[] nums, long k) {
        // int left=0,right=0;
        // long sum=nums[0],cnt=0,score;
        // while(left<nums.length){
        //     score = sum*(right-left+1);
        //     if(score<k){
        //         cnt++; 
        //         if(right+1<nums.length){
        //             right++;
        //             sum += nums[right];
        //         }
        //         else{
        //             left++;
        //             sum = nums[right];
        //         }
        //     }
        //     else if(score>=k){
        //         left++;
        //         right=left;
        //         sum=nums[left];
        //     }
        // }
        // return cnt;
        int left = 0;
        long sum = 0, cnt = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left];
                left++;
            }
            cnt += (right - left + 1);
        }
        return cnt;
    }
}