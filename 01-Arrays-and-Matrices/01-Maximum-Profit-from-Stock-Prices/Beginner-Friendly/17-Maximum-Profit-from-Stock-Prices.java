class MaximumProfitfromStockPrices {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int arraySize = prices.length;
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < arraySize; i++) {
            int currentPrice = prices[i];

            if (currentPrice < minimumPrice) {
                minimumPrice = currentPrice;
            } else {
                int currentProfit = currentPrice - minimumPrice;

                if (currentProfit > maximumProfit) {
                    maximumProfit = currentProfit;
                }
            }
        }

        System.out.println("Maximum Profit = " + maximumProfit);
    }
}
