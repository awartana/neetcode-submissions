class Solution {
    public int trap(int[] height) {
        if(height==null||height.length==0){
            return 0;
        }
        int trap=0;
        /**for(int i=0;i<height.length;i++){
            int maxleft=height[i];  // The current bar must be included in both maximum calculations, either through initialization or through the loops.
            int maxright=height[i];
            for(int l=0;l<i;l++){
               maxleft=Math.max(maxleft,height[l]);
            }
            for(int r=i+1;r<height.length;r++){
                maxright=Math.max(maxright,height[r]);
            }
            trap=trap+(Math.min(maxleft,maxright)-height[i]);
        }

        return trap;**/

      int[] leftmax=new int[height.length];
      int[] rightmax=new int[height.length];
      leftmax[0]=height[0];
      for(int i=1;i<height.length;i++){
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
      }
      rightmax[height.length-1]=height[height.length-1];
      for(int i=height.length-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
      }
      for(int i=0;i<height.length;i++){
        trap=trap+Math.min(leftmax[i],rightmax[i])-height[i];
      }

      return trap;
    }
}
