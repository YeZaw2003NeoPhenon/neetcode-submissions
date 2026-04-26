class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();


        for( int num : nums ){
            map.put( num , map.getOrDefault(num , 0 ) + 1 );
        } 

        Queue<Integer> max_heap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a) );
        max_heap.addAll(map.keySet());
        
        // for( int key : map.keySet() ){
        //     max_heap.add(key);

        //     if( max_heap.size() > k ){
        //         max_heap.poll();
        //     }

        // }

        int[] res = new int[k];

        for( int i = 0 ; i < k ; ++i ){
           res[i] = max_heap.poll();
        }

        return res;

    }
};
