class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
           return 0;
        }
        Arrays.sort(nums);
        
        int size=1;
        int finalsize=1;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i+1]==nums[i]){
                continue;
            }
            //2 → 3 → 4 → 4 → 5
            //The longest consecutive sequence is 2, 3, 4, 5, whose length is 4, not 5.
            if(nums[i+1]==nums[i]+1){
               size++;
            }
            else{
                finalsize=Math.max(size,finalsize);
                  
                size=1;
            }

        }
        finalsize=Math.max(size,finalsize);
        return finalsize;
        
    }
}
