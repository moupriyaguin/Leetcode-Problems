class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[k]){
                k++;
                nums[k]=nums[j];
            }
        }

        k=k+1;
        return k;


        // Map<Integer,Integer> map = new HashMap<>();
        // int k=0;
        // for(int i=0;i<nums.length;i++){
        //     if(!map.containsKey(nums[i])){
        //         // swap(nums[k],nums[i])
        //         int temp = nums[k];
        //         nums[k] = nums[i];
        //         nums[i] = nums[k];

        //         map.put(nums[i],i);
        //         k++;
        //     }
        // }
        // return k;
    }
}