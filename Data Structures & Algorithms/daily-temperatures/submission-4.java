class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();


        int i = 0;
        int[] res = new int[temperatures.length];

        while(i < temperatures.length){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int j = stack.pop();
                res[j] = i - j;
            }

            stack.push(i);
            i++;
        }
        
        return res;
    }
}