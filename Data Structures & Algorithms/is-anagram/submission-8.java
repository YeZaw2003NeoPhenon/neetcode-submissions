class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Map<Character,Integer> s_map = new HashMap<>();
        Map<Character,Integer> t_map = new HashMap<>();

        for(int i = 0; i < s_arr.length; ++i){
            s_map.put(s_arr[i], s_map.getOrDefault(s_arr[i], 0) + 1);
            t_map.put(t_arr[i], t_map.getOrDefault(t_arr[i], 0) + 1);
        }

        
        return s_map.equals(t_map);
    }
}