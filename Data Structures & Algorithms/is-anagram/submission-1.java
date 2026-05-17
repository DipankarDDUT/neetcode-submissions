class Solution {
    public boolean isAnagram(String s, String t) {

                //         Why this is better
                // 1. Faster than HashMap

                // Array access:

                // count[index]

                // is much faster than:

                // map.get()
                // map.put()

                // because hashmap involves:

                // hashing
                // buckets
                // collisions
                // object overhead

                // Array is direct memory indexing ⚡

                // as said consist of all lower case so 26   otherwise 256 so we make the space complexity from O(n) hashMap
                // to 1  Array with constant size of 26 

                if(s.length()!=t.length()) return false;
                int[] freq=new int[26];
                for(int i=0;i<s.length();i++){
                    char sChar=s.charAt(i);
                    char tChar=t.charAt(i);
                    freq[sChar-'a']+=1;
                    freq[tChar-'a']-=1;
                }

                // ultimately it should be 0 
                // as s +1 and t -1 if same character than all index 0


                for(int index:freq){
                    if(index!=0) return false;
                }

                return true;


    }
}
