class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int s=target-nums[i];
             
            if(m.containsKey(nums[i])){
                return new int[]{m.get(nums[i]),i};
            }
            if(!m.containsKey(s)){
                m.put(s,i);
            }

        }
        return new int[]{};
    }
}
