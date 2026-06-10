class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        // set<int> st;
        // for(int i=0;i<nums.size();i++){
        //     st.insert(nums[i]);
        // }
        // int ind=0;
        // for(auto it:st){
        //     nums[ind] = it;
        //     ind++;
        // }

        // return ind;

        int i=0,j=1;
        
        while(j<nums.size()){
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i+1;
    }

    //     int j = 1;
    //     for(int i = 1; i < nums.size(); i++){
    //         if(nums[i] != nums[i - 1]){//i=1,j=1|i=2,j=1
    //             nums[j] = nums[i];//nums[1] = 2
    //             j++;//j=2
    //         }
    //     }
    //     return j;
    // }
};