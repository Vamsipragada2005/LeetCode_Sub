class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        for (String op : operations) {
            switch (op) {
                case "C": {
                    int removed = stack.pop();
                    sum -= removed;
                    break;
                }
                case "D": {
                    int last = stack.peek();
                    int doubled = last * 2;
                    stack.push(doubled);
                    sum += doubled;
                    break;
                }
                case "+": {
        
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    int newScore = last + secondLast;
                    stack.push(last);   
                    stack.push(newScore);  
                    sum += newScore;
                    break;
                }
                default: {
                    int val = Integer.parseInt(op);
                    stack.push(val);
                    sum += val;
                    break;
                }
            }
        }

        return sum;
    }
}