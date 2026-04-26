class Solution {
    public int findMin(int[] nums) {
        

        int currMin = nums[0];

        for( int i = 1 ; i < nums.length ; ++i ){
            if( currMin > nums[i] ){
                currMin = nums[i];
            }
            else{
                continue;
            }
        }
        return currMin;
    }
}
