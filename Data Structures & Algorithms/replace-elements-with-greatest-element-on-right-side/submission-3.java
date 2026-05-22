class Solution {
    public int[] replaceElements(int[] arr) {
        
        // brute for each find the largest on right side and assign the value to result
        // for each element
        // so time O(n sqaure)

        int n=arr.length-1;
        int curMax=-1;
        for(int i=n;i>=0;i--){
            // always assign the right side current max irrespective
            // its larger than current or not 
            int current=arr[i];
            arr[i]=curMax;
            if(current>curMax){
                curMax=current;
            }
        }

        return arr;

    }
}