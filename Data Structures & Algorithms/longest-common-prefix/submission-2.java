class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0) return "";    
        StringBuilder sb=new StringBuilder();

        // find the shortest length string 
        int len=strs[0].length();
        for(int i=0;i<strs.length;i++){
            len=Math.min(len,strs[i].length());
        }

        for(int i=0;i<len;i++){
            char s=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(s!=strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(s);
        }

        return sb.toString();
    }
}