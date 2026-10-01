class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string=new StringBuilder();
        for (String s : strs) {
            encoded_string.append(s.length()).append('#').append(s);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        
        for(int i=0;i<str.length();i++) {
            int slash = str.indexOf('#', i);
            String s=str.substring(i, slash);
            int length=Integer.parseInt(s);
            i = slash + 1;
            decoded_strs.add(str.substring(i, i + length));
            i = i+ length-1;
        }
        return decoded_strs;
    }
}