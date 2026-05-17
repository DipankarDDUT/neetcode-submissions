class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // two ways if extra space used can solve in O(n) time 
        // if no extra space then log n time. that is sort it and check the adjacent index

        if(nums.length<2) return false;
        // hashmap not required only key is important so hashset
        // again no ordering and sorting required so no treeset so hashset 
        HashSet<Integer> preMap=new HashSet<>();
        // number , index. 
        for(int i=0;i<nums.length;i++){
            if(preMap.contains(nums[i])){
                return true;
            }
            preMap.add(nums[i]);
        }

        return false;
    }
}