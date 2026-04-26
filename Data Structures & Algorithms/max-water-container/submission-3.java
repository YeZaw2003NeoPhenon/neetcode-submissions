class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0;
        int j = heights.length - 1;
           int result = 0;

        while( i < j ){
            int width = j - i ;
            int height = Math.min(heights[i] , heights[j]);
            int area = width * height;

            result = Math.max( result , area );

            if( heights[i] < heights[j] ){
                i++;
            }
            else{
                j--;
            }
        }

        return result;
    }
}
  // O(N ^ 2) Brute Force
