class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0;
        int cur=0;
        for(int num:nums){
            if(num==1){
                cur++;
            }else{
              max=Math.max(cur,max);
              cur=0;
            }
        }

        // continuous all last 1 max consecutive then no 0 then no max assigned so return like this
        return max>cur?max:cur;
    }
}