class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int index=0;index<n;index++){
            int leftsum=0,rightsum=0;
            for(int left=index-1;left>=0;left--)leftsum+=nums[left];
            for(int right=index+1;right<n;right++)rightsum+=nums[right];
            if(leftsum==rightsum)
            return index;
        }  
        return -1;
    }
}