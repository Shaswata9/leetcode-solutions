class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        int maxArea=0;
        while(left<right){
            int width=right-left;
            if(height[left]<height[right]){
                area=height[left]*width;
                left++;
            }
            else{
               area=height[right]*width; 
               right--;
            }
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}