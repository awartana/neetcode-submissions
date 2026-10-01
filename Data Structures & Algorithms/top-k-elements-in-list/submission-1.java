class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m=new HashMap<>();
        int[] ans=new int[k];
        for(int n:nums){
            if(!m.containsKey(n)){
                m.put(n,1);
            }
            else{
                m.put(n,m.get(n)+1);
            }
        }
    for(int i=0;i<k;i++){
        int max=Collections.max(m.values());
        
        for(Map.Entry<Integer, Integer> entry:m.entrySet()){
            if(entry.getValue()==max){
                ans[i]=entry.getKey();
        m.remove(entry.getKey());
        
        break;

            }
        }
    }
    return ans;
        
    }
}
