class Solution {
    // public void swap(int[] nums,int i,int j){
    //     if(i!=j){
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //     }
    // }
    // public int removeElement(int[] nums, int val) {
        
    //     int n=nums.length-1;
    //     int i=0;
    //     int j=n;
    //     //current index + (nums.length-k+1) number of items eqaul to val
    //     while(i<=j){

    //             if(nums[i]==val){
    //                 swap(nums,i,j);
    //                 j--;
    //             }else{
    //                 i++;
    //             }

                
    //     }


    //     // i will point to index on first val index after that all index is val
    //     // as out put is 1 based index so remove -1 
    //     // return i-1;
    //     return i;
    // }

    // better solution is not using swapping as we can simply overwirte why need to swap 

    public int removeElement(int[] nums, int val) {

        int n=nums.length-1;
        int i=0;
        int j=n;
        while(i<=j){
            if(nums[i]==val){
                // simply bring the j and decrement j 
                nums[i]=nums[j];
                j--;
            }else{
              i++;
            }
        }
    
    return i;
    }
}