import java.util.ArrayList;

public class MinSplit {

    public static int minSplitInternal(int amount, int[] coins) {
        int remaining = amount;
        int numOfCoins = 0;

        for(int i = 0; i < coins.length; i++) {
            numOfCoins += remaining / coins[i];
            remaining = remaining % coins[i];
        }
        return numOfCoins;
    }


    public static int minSplit(int amount) {
        int[] coins = {50,20,10,5,1};
        return minSplitInternal(amount, coins);
    }

    public static void main(String[] args) {
        System.out.println(minSplit(9));
    }
}
