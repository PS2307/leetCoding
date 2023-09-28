class Solution {
    public int trap(int[] height) {
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int RightMax[]=new int[height.length];
        RightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }int trpwat=0;
        for(int i=0;i<height.length;i++){
            int lvl=Math.min(leftMax[i],RightMax[i]);
            trpwat+=lvl-height[i];
            // System.out.println(trpwat);
        }return trpwat;
    }
}