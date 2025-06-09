class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        //Optimal 2
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
            xor2=xor2^nums[i];
            xor1=xor1^i;
        }

        xor1 = xor1^n;
        return xor1^xor2;

        //Optimal 1
        // int sum = n*(n+1)/2;
        // int s2=0;
        // for(int i=0;i<n;i++){
        //     s2+=nums[i];
        // }

        // return sum-s2;
        //Better
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