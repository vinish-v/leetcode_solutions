class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int  top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore); 
            }
            else if(operations[i].equals("D")){
                stack.push(2*stack.peek());
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int tot = 0;
        for(int score : stack){
            tot+=score;
        }
        return tot;
    }
}