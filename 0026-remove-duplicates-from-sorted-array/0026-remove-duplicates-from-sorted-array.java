class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                // swap(nums[k],nums[i])
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = nums[k];

                map.put(nums[i],i);
                k++;
            }
            
        }
        return k;
    }
}