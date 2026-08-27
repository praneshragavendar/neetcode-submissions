class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int res=0;
        int area=0;
        while(i<j){
            area=(j-i)*Math.min(height[i],height[j]);
            res=Math.max(area,res);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}
