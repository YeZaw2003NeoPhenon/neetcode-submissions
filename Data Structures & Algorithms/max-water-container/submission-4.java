class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxWater = 0;
        while(left < right){
            int water_area = Math.min(heights[left], heights[right]) * (right - left);

            maxWater = Math.max(maxWater, water_area);
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        
        return maxWater;
    }
}
