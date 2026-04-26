class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for( String token : tokens ){
            int a,b;
            switch(token){
                case "+":
                     a = stack.pop();
                     b = stack.pop();
                    stack.push(a + b);
                    break;
                    
                case "-":
                     a = stack.pop();
                     b = stack.pop();
                    stack.push( b - a );
                    break;

                case "*":
                     stack.push(stack.pop() * stack.pop());
                     break;

                case "/":
                     a = stack.pop();
                     b = stack.pop();
                    stack.push( (int)((double) b / a));  
                    break;
                default:
                    stack.push(Integer.parseInt(token));                             
            }
        }
        return stack.pop();
    }
}
