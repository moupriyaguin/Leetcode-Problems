    class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int[] temp = new int[n-k];
        for(int i=0;i<(n-k);i++){
            temp[i] = nums[i];
        }

        for(int i=n-k;i<n;i++){
            nums[i-(n-k)] = nums[i];
        }

        for(int i=k;i<n;i++){
            nums[i] = temp[i-k];
        }


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