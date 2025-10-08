package Com;

public class Stocks {
	public static int buyAndSellStocks (int[] selling_price) {
	int buying_price = Integer.MAX_VALUE;
	int MaxProfit = 0;
	for(int i=0;i<selling_price.length;i++)
	{
		if(buying_price<selling_price[i])
		{
			int profit = selling_price[i] - buying_price;
			MaxProfit = Math.max(MaxProfit, profit);
		}
		else
		{
			buying_price = selling_price[i];
		}
	}
	return MaxProfit;
}
public static void main(String[] args) {
	int[] selling_price = {7,1,5,3,6,4};
	int max = buyAndSellStocks(selling_price);
	System.out.println("The Maximum Profit obtained is :" +max);
	
	}
}
