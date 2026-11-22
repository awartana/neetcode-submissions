class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();

        String lowercase=s.toLowerCase();
        String cleaned=lowercase.replaceAll("[^a-zA-Z0-9]","");
        for(int i=cleaned.length()-1;i>=0;i--){
             char c=cleaned.charAt(i);
             sb.append(c);
        }
        String result=sb.toString();
        if(result.equals(cleaned)){
            return true;
        }
        return false;
        
    }
}
