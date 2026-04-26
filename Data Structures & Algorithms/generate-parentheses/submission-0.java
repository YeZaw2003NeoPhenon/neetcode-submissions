class Solution {
    private Stack<Character> stack;
    private List<String> result;
    public List<String> generateParenthesis(int n) {
        this.stack = new Stack<>();
        this.result = new ArrayList<>();
        backtrack(0 , 0 , n );
        return result;
    }
    public void backtrack(int open , int close , int n ){

        if( close > open){
            return;
        }

        if( open == n && open == close ){
            StringBuilder sb = new StringBuilder();
            for( char ch : stack ){
                sb.append(ch);
            }
            result.add(sb.toString());
        }

        if( open < n ){
            stack.push('(');
            backtrack( open + 1 , close , n );
            stack.pop();
        }

        if(close < open){
            stack.push(')');
            backtrack( open , close + 1, n );
            stack.pop();            
        }

    }
}
