class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }

        for(int i=0;i<=n;i++){
            if(!arr.contains(i)) return i;
        }

        return -1;

    }
}