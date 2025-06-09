class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int s2=0;
        for(int i=0;i<n;i++){
            s2+=nums[i];
        }

        return sum-s2;
        // List<Integer> arr = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     arr.add(nums[i]);
        // }

        // for(int i=0;i<=n;i++){
        //     if(!arr.contains(i)) return i;
        // }

        // return -1;

    }
}