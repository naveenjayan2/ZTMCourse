package Questions;

public class BuyNSellStock {


    public int maxProfit(int[] prices) {

        int lowest=Integer.MAX_VALUE;

        int profit=0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < lowest){
                lowest = prices[i];
            }
            else if(prices[i] > profit + lowest){
                profit = prices[i] - lowest;

            }
        }
        return profit;
    }

    public int maxProfitBrut(int[] prices){
        int maxLength=0;
        for(int i=0; i<prices.length; i++){
            for (int j=i+1; j<prices.length; j++){
                if(prices[j] - prices[i] > maxLength){
                    maxLength = prices[j] - prices[i];
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {2,9,1,5};
        int[] prices3 = {3,2,1};
        int[] prices4 = {7,2,4,1};

        BuyNSellStock buyNSellStock1 = new BuyNSellStock();
        BuyNSellStock buyNSellStock2 = new BuyNSellStock();
        BuyNSellStock buyNSellStock3 = new BuyNSellStock();
        BuyNSellStock buyNSellStock4 = new BuyNSellStock();

        System.out.println(buyNSellStock1.maxProfit(prices1));
        System.out.println(buyNSellStock2.maxProfit(prices2));
        System.out.println(buyNSellStock3.maxProfit(prices3));
        System.out.println(buyNSellStock4.maxProfit(prices4));
    }

}



