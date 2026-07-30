class Solution {
    public int[] replaceElements(int[] arr) {
        int temp_1=-1,temp_2=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(i!=arr.length-1){
             temp_2=Math.max(arr[i+1],temp_1);
            }             
            temp_1=arr[i];
            arr[i]=temp_2;
        }
        return arr;
    }
}