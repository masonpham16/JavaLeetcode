class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            // Assume no discount initially
            answer[i] = prices[i];
            
            // Look for the next smaller or equal price
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    break; // Stop once the discount is applied
                }
            }
        }
        
        return answer;
    }
}
