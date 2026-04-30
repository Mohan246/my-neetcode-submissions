class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> occurenceCount=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            occurenceCount.put(nums[i],1+occurenceCount.getOrDefault(nums[i],0));
        }
        List<Map.Entry> entryList=occurenceCount.entrySet().stream().filter(entry->entry.getValue()>1).collect(Collectors.toList());
        return entryList.size()>0?true:false;
    }
}