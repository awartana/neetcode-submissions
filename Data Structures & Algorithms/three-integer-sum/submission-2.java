class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        int i;
        for (i=0;i<nums.length-2;i++){
            //Optimization, if the lowest number is grester than 0, sum can never be 0;
            if(nums[i]>0){
                break;
            }
             if(i>0 && nums[i-1]==nums[i]){
                
                continue;
             }
             int j=i+1;
             int k=nums.length-1;
             while(j<k){
                 
                
                if(nums[i]+nums[j]+nums[k]==0){
                  result.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k]))); 
                  j++;
                  k--; // Or new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                 while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
 
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--; }
                     
                    
                
                else{
                    j++;
                    
                }
             }
             

        }
        return result;
    }
}