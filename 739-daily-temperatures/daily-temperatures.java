class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int answer[]=new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int indx = stack.pop();
                answer[indx] = i-indx;
            }
            stack.push(i);
        }
        return answer;
    }
}