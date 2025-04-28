class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            // if(!map.containsKey(prefixSum))map.put(prefixSum,i);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}