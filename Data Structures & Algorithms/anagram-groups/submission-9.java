class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Set<List<String>> res = new HashSet<>();

        for(int i = 0 ; i < strs.length; ++i){
            List<String> list = new ArrayList<>();
            for(int j = 0;j < strs.length; ++j){
                if(isAnagram(strs[i],strs[j])){
                    list.add(strs[j]);
                }
            }
            res.add(list);
        }
        return new ArrayList<>(res);
    }

    public boolean isAnagram(String s, String t){

        Map<Character,Integer> s_map = new HashMap<>();

        Map<Character,Integer> t_map = new HashMap<>();

        for(char ch : s.toCharArray()){
            s_map.put(ch, s_map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()){
            t_map.put(ch, t_map.getOrDefault(ch, 0) + 1);
        }
        return s_map.equals(t_map);
    }

}