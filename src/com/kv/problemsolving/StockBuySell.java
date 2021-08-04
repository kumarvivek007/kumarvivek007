/**
 * The cost of stock on each day is given in an array A[] of size N.
 * Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.
 * Example 1
 * Input:
 * N = 7
 * A[] = { 100, 180, 260, 310, 40, 535, 695 }
 *
 * Output:
 * (0 3) (4 6)
 *
 * Explanation 1:
 * We can buy stock on day 0,
 * and sell it on 3rd day,
 * which will give us maximum profit.
 *
 * Example 2
 * Input:
 * N = 10
 * A[] = {23, 13, 25, 29, 33, 19, 34, 45, 65, 67}
 *
 * Output:
 * (1 4) (5 9)
 */
package com.kv.problemsolving;


public class StockBuySell {
    public static void main(String args[]){
        int n = 10;
        int price[] = {23, 13, 25, 29, 33, 19, 34, 45, 65, 67};

        int buyPoint=0,sellPoint=0;
        /*while (buyPoint < n){
            for (int i = buyPoint+1; i<n; i++){
               // if(price[buyPoint] > price)
            }

        }*/
    }
}
