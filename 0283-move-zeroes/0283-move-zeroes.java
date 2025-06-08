class Solution {
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while (j < n) {
            if (nums[i] != 0) {
                i++;
                j++;
                continue;
            }
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }
}