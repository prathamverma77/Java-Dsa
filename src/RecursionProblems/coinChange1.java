package RecursionProblems;

public class coinChange1 {

    static int coinChange1(int amount, int index, int[] coins) {
        // Base cases (you got these right!)
        if (amount == 0) return 1;
        if (amount < 0) return 0;
        if (index == coins.length) return 0;

        // Recursive cases
        int include_coin = coinChange1(amount - coins[index], index, coins);     // USE current coin
        int exclude_coin = coinChange1(amount, index + 1, coins);               // SKIP current coin

        return include_coin + exclude_coin;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int ways = coinChange1(amount , 0 , coins);
        System.out.println(ways);
    }

}
