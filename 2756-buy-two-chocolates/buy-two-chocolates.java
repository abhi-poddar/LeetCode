class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = prices[0]+prices[1];
        int result = money-sum;
        if(result>=0){
            return result;
        }
        return money;
    }
}