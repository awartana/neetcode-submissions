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
        
    

        /*int[][] arr = new int[nums.length][2];

        for (int k = 0; k < nums.length; k++) {
            arr[k][0] = nums[k];
            arr[k][1] = k;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i][0] + arr[j][0];

            if (sum == target) {
                return new int[]{arr[i][1], arr[j][1]};
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }

        return new int[]{
    Math.min(arr[i][1], arr[j][1]),
    Math.max(arr[i][1], arr[j][1])
};*/
    }
}
    

    
