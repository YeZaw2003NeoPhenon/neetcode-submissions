class Solution {
    public int trap(int[] height) {
        
        int waterTrapper = 0 ;

        for( int i = 1 ; i < height.length - 1 ; ++i ){
            int left_max = 0 ;

            for( int j = 0 ; j < i ; ++j ){
                left_max = Math.max(height[j] , left_max);
            }

              int right_max = 0 ;

            for( int j = i + 1; j < height.length ; ++j ){
                right_max = Math.max(height[j] , right_max);
            }

          int currentTrappedWater = Math.min(left_max , right_max) - height[i]; 

          if( currentTrappedWater > 0 ){
             waterTrapper += currentTrappedWater;
          }

      }
      
        return waterTrapper;
    }
}
