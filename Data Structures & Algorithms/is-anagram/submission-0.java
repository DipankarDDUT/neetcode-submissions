class Solution {
    public boolean isAnagram(String s, String t) {

            if(s.length()!=t.length()) return false;
            HashMap<Character,Integer> preMap=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char sChar=s.charAt(i);
                preMap.put(sChar,preMap.getOrDefault(sChar,0)+1);
            }
            
            for(int i=0;i<t.length();i++){
                char tChar=t.charAt(i);
                if(preMap.containsKey(tChar)){
                    if(preMap.get(tChar)<1) return false;
                    preMap.put(tChar,preMap.getOrDefault(tChar,0) - 1);
                }else{
                    return false;
                }
               
            }
          


            return true;
    }
}
