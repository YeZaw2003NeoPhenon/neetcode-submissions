class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){

        int[] cnt = new int[26];

            for(char ch : s.toCharArray()){
                cnt[ch - 'a']++;
            }

            String key = Arrays.toString(cnt);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
