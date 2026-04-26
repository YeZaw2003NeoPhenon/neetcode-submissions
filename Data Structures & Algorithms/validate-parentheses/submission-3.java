class Solution {
    public boolean isValid(String s) {
        
        Map<Character,Character> bracket_tracker = new HashMap<>();

        Stack<Character> stack = new Stack<>();

        bracket_tracker.put(')', '(');
        bracket_tracker.put('}', '{');
        bracket_tracker.put(']', '[');

        for( int i = 0; i < s.length(); ++i ){
            char ch = s.charAt(i);

            if(bracket_tracker.containsKey(ch)){
                if(!stack.isEmpty() && bracket_tracker.get(ch).equals(stack.peek())){
                    stack.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        if( !stack.isEmpty()){
            return false;
        }
        return stack.isEmpty();
    }
}
