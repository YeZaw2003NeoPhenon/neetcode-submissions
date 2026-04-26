class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numsTobeChecked = new HashSet<>();

        for( int num : nums ){
            numsTobeChecked.add(num);
        }
        int longest_length = 0 ;

        for( int num : numsTobeChecked ){
            if(!numsTobeChecked.contains(num - 1)){
                int len = 1;

                while(numsTobeChecked.contains( len + num)){
                    len++;
                }
                 longest_length = Math.max(longest_length , len );
            }
        }
        return longest_length;
    }
}
