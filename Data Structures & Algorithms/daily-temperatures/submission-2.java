class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; ++i){
            int j = i + 1;
            for(; j < temperatures.length; ++j){

                if(temperatures[j] > temperatures[i]){
                    break;
                }
            }
            
            if(j == temperatures.length){
                res[i] = 0;
            }
            else{
                res[i] = j - i;
            }

        }
        return res;
    }
}
