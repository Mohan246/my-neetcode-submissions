class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] op=new int[2*nums.length];
        for(int i=0;i<=nums.length-1;i++){
            op[i]=nums[i];
            op[i+nums.length]=nums[i];
        }
        return op;
    }
}