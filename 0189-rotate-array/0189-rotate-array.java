class Solution {
    private void reverse(int[] nums, int from, int to) {
        int i = from, j = to;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);


        // int[] temp = new int[n-k];
        // for(int i=0;i<(n-k);i++){
        //     temp[i] = nums[i];
        // }

        // for(int i=n-k;i<n;i++){
        //     nums[i-(n-k)] = nums[i];
        // }

        // for(int i=k;i<n;i++){
        //     nums[i] = temp[i-k];
        // }

        // while(k>0){
        //     for(int j=n-1;j>0;j--){
        //         int temp = nums[j];
        //         nums[j] = nums[j-1];
        //         nums[j-1] = temp;
        //     }
        //     k--;
        // }
    }
}