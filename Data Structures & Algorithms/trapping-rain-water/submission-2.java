class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] left_max = new int[n];

        int max = height[0];

        for( int i = 0 ; i < n ; ++i ){
            max = Math.max(max , height[i]);
            left_max[i] = max;
        }

        max = height[n - 1];

        int[] right_max = new int[n];

        for( int i = n - 1 ; i >= 0 ; --i ){
            max = Math.max(max , height[i]);
            right_max[i] = max;
        } 
        int result = 0 ;

        for( int i = 0 ; i < n ; ++i ){
            result += Math.min( left_max[i] , right_max[i] ) - height[i];
        }
        return result;
    }
}
