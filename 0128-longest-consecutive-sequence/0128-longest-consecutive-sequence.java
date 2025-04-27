class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)
        return 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int longest = 1;

        for(int it: set){
            if(!set.contains(it-1)){
                int count = 0;
                int x = it;
                while(set.contains(x)){
                    count++;
                    x = x + 1;
                }
                longest = Math.max(longest,count);
            }
        }

        return longest;
    }
}