class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i, 0)+1);
        // }

        // for(int key:map.keySet()){
        //     if(map.get(key)>nums.length/2)
        //     return key;
        // }

        int element = nums[0], count = 1;
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                element = nums[i];
            }
            if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }

        count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == element)
            count++;
        }

        if(count>nums.length/2)
        return element;

        return -1;
    }
}