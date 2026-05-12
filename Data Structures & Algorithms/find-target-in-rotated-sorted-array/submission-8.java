class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            
            int mid = l + (r - l) / 2;

            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }

        int pivot = l;

        int result = binarySearch(nums, 0, pivot - 1, target);

        if(result != -1){
            return result;
        }

        return binarySearch(nums, pivot, nums.length - 1, target);
    }

    public int binarySearch(int[] nums,int left, int right, int target){

        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
