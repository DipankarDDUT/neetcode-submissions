class Solution {
    public int majorityElement(int[] nums) {
        
        // as majority element always exists in the array 
        // we can use hashMap O(n) and time O(n)

        // when count is 0 that time take that element 
        // Using Boyer Moore Voting Algorithm
        if(nums.length<2) return nums[0]; 
        int count=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
                if(count==0){
                    result=nums[i];
                }
                if(nums[i]==result){
                    count++;
                }else{
                    count--;
                }
              
        }

        return result;
    }
}