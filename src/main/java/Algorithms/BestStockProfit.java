package Algorithms;

public class BestStockProfit {

    public Integer findBestProfit(int[] stockPriceValues) {
        int profit = Integer.MAX_VALUE;
        for(int i = 0; i < stockPriceValues.length ; i++){
            for(int j = i+1 ; j < stockPriceValues.length ; j++){
                if(stockPriceValues[j] > stockPriceValues[i]){
                    int probableProfile  = stockPriceValues[j] - stockPriceValues[i];
                    if(probableProfile > profit){
                        profit = probableProfile;
                    }
                }
            }
        }
        return profit;
    }

    public Integer findBestProfit1(int[] stockPriceValues) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < stockPriceValues.length; i++) {
            if (stockPriceValues[i] < minprice)
                minprice = stockPriceValues[i];
            else if (stockPriceValues[i] - minprice > maxprofit)
                maxprofit = stockPriceValues[i] - minprice;
        }
        return maxprofit;
    }


    public Integer findBestProfit2(int[] stockPriceValues) {
        int minimumValue = Integer.MAX_VALUE; int minIndex = 0;

        for (int i = 0; i < stockPriceValues.length; i++) {
         if(minimumValue > stockPriceValues[i]){
             minimumValue = stockPriceValues[i];
             minIndex = i;
         }
        }
        int profit = 0;
        for(int i = minIndex+1 ; i < stockPriceValues.length ; i++){
            if(profit < stockPriceValues[i]-minimumValue){
                profit = stockPriceValues[i];
            }
        }

        return profit;
    }
}
