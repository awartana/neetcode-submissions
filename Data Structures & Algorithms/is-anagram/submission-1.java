class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> S=new HashMap<>();
        HashMap<Character,Integer> T=new HashMap<>();
        for(int i=0;i<s.length();i++){
           if(S.containsKey(s.charAt(i))){
            S.put(s.charAt(i),S.get(s.charAt(i))+1);
           }
           else{
            S.put(s.charAt(i),1);
           }
           if(T.containsKey(t.charAt(i))){
            T.put(t.charAt(i),T.get(t.charAt(i))+1);
           }
           else{
                T.put(t.charAt(i),1);
           }
        }
         for(Character c:S.keySet()){
            if(!S.get(c).equals(T.get(c))){
               return false;
            }
         }
         return true;
    }
}
