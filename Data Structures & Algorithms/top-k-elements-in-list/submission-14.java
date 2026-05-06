class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> countMap = new HashMap<>();

        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            list.add(new int[]{entry.getValue(), entry.getKey()});
        }

        list.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];

        for(int i = 0; i < k; ++i){
            res[i] = list.get(i)[1];
        }

        return res;
    }
}