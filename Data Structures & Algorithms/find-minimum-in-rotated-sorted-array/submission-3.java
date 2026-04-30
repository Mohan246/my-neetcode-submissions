class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int left=0,right=nums.length-1, mid=0;
        while(left<=right){
            if(nums[left]<nums[right]){
                min=Math.min(nums[left],min);
                break;
            }
          mid  =(left+right)/2;
            min=Math.min(nums[mid],min);
            if(nums[left]<=nums[mid])
                left=mid+1;
            else
                right=mid-1;                
        }        
        return min;
    }
}
