class Solution {
    public int maxProfit(int[] prices) {
        int j, i, a = 0, b = prices[0],c=0;
      
        for (i=1; i< prices.length ; i++) {
          if(b>prices[i])
          {
            b=prices[i];
          }
          a = prices[i] - b;
            if (a > c) {

            c = a;
                
            }

        }
        if (c>0) {
           return c;
        } else {
            return 0;
        }
    }
}
