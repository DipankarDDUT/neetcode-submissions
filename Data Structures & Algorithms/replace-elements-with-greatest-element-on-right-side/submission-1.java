class Solution {
    public int[] replaceElements(int[] arr) {
        
        // brute for each find the largest on right side and assign the value to result
        // for each element
        // so time O(n sqaure)
         if(arr.length==0) return new int[0];
         if(arr.length==1) return new int[]{-1};

        // we will start from second last as last there is no right element
        // this time we will do in place 
        int n=arr.length-1;
        int curMax=arr[n];
        arr[n]=-1;
        for(int i=n-1;i>=0;i--){
            // always assign the right side current max irrespective
            // its larger than current or not 
            int temp=Math.max(arr[i],curMax);
            arr[i]=curMax;
            curMax=temp;  
        }

        return arr;

    }
}