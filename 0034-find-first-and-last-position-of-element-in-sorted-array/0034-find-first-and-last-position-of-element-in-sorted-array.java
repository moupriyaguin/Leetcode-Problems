class Solution {
    public int lowerBound(int[] nums, int target){
        int ans = -1;
        int low=0, high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] == target){
                ans = mid;
            }
            if(nums[mid]>=target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }

    public int upperBound(int[] nums, int target){
        int ans = -1;
        int low=0, high=nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] == target){
                ans = mid;
            }
            if(nums[mid]<=target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
       int result[] = {-1,-1};
       result[0] = lowerBound(nums,target);
       result[1] = upperBound(nums,target);

       return result;
    }
}