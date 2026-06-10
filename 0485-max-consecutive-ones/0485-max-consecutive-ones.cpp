class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int i=0,j=0,max=0;
        for(j=0;j<nums.size();j++){
            if(nums[j]!=1){
                if(j-i > max){
                    max = j-i;
                }
                i=j+1;
            }
        }
        if(max < j-i){
            max = j-i;
        }
        return max;
    }
};