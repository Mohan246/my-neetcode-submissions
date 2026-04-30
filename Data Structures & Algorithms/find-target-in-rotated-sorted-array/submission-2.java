class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1,pivot=0;
        //finding the pivot
        while(left<=right){
          int  mid=(left+right)/2;
            // if(mid==left || mid==right){
            //     pivot=mid;
            //     break;
            // }

            if(nums[mid]<nums[left])
                right=mid-1;
            else if(nums[mid]>nums[right])
                left=mid+1;
            else{
                pivot=left;
                break;
            }

        }
        System.out.println("pivot::"+pivot);
        left=0;right=pivot;
        //binary search in one segment
        while(left<=right){
           int mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
                right=mid-1;
            else
                left=mid+1;                
        }
        //binary search in one segment
        left=pivot;right=nums.length-1;
        while(left<=right){
         int   mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
                right=mid-1;
            else
                left=mid+1;                
        }
    return -1;
    }
}
