class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int profit = 0;
      
        int buying_index = 0;
        int selling_index = 1;

        while(selling_index < prices.length && buying_index < selling_index){

            int buying_price = prices[buying_index];
            int selling_price = prices[selling_index];
            System.out.println("buying index : "+buying_index+"!"+" Selling index :" + selling_index);

            if(buying_price <= selling_price){
                profit = Math.max(profit,selling_price - buying_price);
                selling_index++;
            }
            else if(buying_price > selling_price){
                buying_index = selling_index;
                selling_index++;
            }

        }
        return profit;
    }
}
