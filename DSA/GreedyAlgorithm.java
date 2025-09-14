package DSA;

import java.util.*;

class GreedyAlgorithm {
    static void findMinCoins(int coins[], int amount) {
        Arrays.sort(coins);
        for(int i=coins.length-1; i>=0; i--) {
            while(amount >= coins[i]) {
                amount -= coins[i];
                System.out.print(coins[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 2758;
        findMinCoins(coins, amount); 
        // Output: 2000 500 200 50 5 2 1
    }
}
