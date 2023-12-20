class Solution {
    public int buyChoco(int[] prices, int money) {
        int minPrice= Integer.MAX_VALUE;
        int secMinPrice= Integer.MAX_VALUE;
        for (int price: prices) {
            if (price < minPrice) {
                secMinPrice= minPrice;
                minPrice=price;
            }
            else {
                secMinPrice= Math.min(secMinPrice, price);
            }
        }
        if (minPrice + secMinPrice > money) {
            return money;
        }
        return money-(minPrice + secMinPrice);
    }
}