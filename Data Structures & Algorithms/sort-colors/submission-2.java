class Solution {
    public void swap(int nums[], int i,int j){
        if(i!=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
    public void sortColors(int[] nums) {
        
        // brute 
        // keep a counter for each 0 1 2 
        // then based on counter 
        // while zero>0 then one>0 then two>0 keep on adding 
        // to nums 
        // total time 2N
        // we will make it single N

        // one will always point to after index of  last occuring 1 in
        // the array after loop ends

        int one=0;
        int zero=0;
        int two=nums.length-1;
        // remeber one<=two = is required 
        // as one always poitn to after last 1 so that
        // index also needs to checked 
        while(one<=two){
            if(nums[one]==1){
                one++;
            }else if(nums[one]==0){
                    swap(nums,one,zero);
                    one++;
                    zero++;

            }else{
                swap(nums,one,two);
                two--;
            }
        }
    }
}