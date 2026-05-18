class Solution {
    public int[] getConcatenation(int[] nums) {
        
        if(nums.length==0) return new int[0];
        int[] result=new int[2*nums.length];

        int j=nums.length;
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i];
            result[j++]=nums[i];
        }
    return result;

    }
}