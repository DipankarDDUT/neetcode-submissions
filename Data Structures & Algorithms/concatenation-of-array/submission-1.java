class Solution {
    public int[] getConcatenation(int[] nums) {
        
        if(nums.length==0) return new int[0];
        int n=nums.length;
        int[] result=new int[2*nums.length];
        for(int i=0;i<n;i++){
            result[i]=nums[i];
            result[n+i]=nums[i];
        }
    return result;

    }
}