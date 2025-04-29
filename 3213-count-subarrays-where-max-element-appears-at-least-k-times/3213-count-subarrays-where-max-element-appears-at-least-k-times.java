class Solution {
    public long countSubarrays(int[] nums, int k) {
        // long maxi=Integer.MIN_VALUE;
        // long cnt=0,occur=0;
        // for(int i=0;i<nums.length;i++){
        //     maxi = Math.max(maxi,nums[i]);
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(long j=i;j<nums.length;j++){
        //         if(nums[(int)j]==maxi) occur++;
        //         if(occur>=k) cnt++;
        //     }
        //     occur=0;
        // }

        // return cnt;
        int maxElement = Arrays.stream(nums).max().getAsInt();
        long ans = 0, start = 0;
        int maxElementsInWindow = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) {
                maxElementsInWindow++;
            }
            while (maxElementsInWindow == k) {
                if (nums[(int) start] == maxElement) {
                    maxElementsInWindow--;
                }
                start++;
            }
            ans += start;
        }
        return ans;
    }
}