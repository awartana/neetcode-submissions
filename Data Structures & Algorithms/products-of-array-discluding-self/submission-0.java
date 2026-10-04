class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int post=1;
        int[] output=new int[nums.length];
        output[0]=1;
        for(int i=1;i<nums.length;i++){
            output[i]=nums[i-1]*pre;
            pre=output[i];
        }

        for(int j=nums.length-2;j>=0;j--){
            post=post*nums[j+1];
            output[j]=output[j]*post;
            
        }
        return output;
    }
}


        

        
    

