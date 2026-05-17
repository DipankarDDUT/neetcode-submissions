class Solution {
    public int[] twoSum(int[] nums, int target) {
        
            int[] result=new int[2];
            HashMap<Integer,Integer> freqMap=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(freqMap.containsKey(target-nums[i])){
                    result[0]=freqMap.get(target-nums[i]);
                    result[1]=i;
                }
                freqMap.put(nums[i],i);
            }

            return result;
        
    }
}
