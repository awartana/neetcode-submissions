class Solution {
    public boolean isPalindrome(String s) {
         /***StringBuilder sb=new StringBuilder();

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
        return false;***/
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(j>i && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
