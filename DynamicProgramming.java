import java.util.Arrays;

public class DynamicProgramming {

    // public static int countWays(int n){
    // int [] memo = new int[n+1];
    // Arrays.fill(memo, -1);
    // return countWays(n,memo);

    // }

    public static int countWays(int n) {

        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        else {
            int[] memo = new int[n];
            memo[0] = 1;
            memo[1] = 1;
            memo[2] = 2;

            for (int i = 3; i < n; i++) {
                memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];

            }
            return (memo[n - 1] + memo[n - 2] + memo[n - 3]);
        }
    }

    // public static int countWays(int n, int[] memo){
    // if(n<0){
    // return 0;
    // }
    // else if (n == 0){
    // return 1;
    // }
    // else if (memo[n] > -1){
    // return memo[n];
    // }
    // else {
    // memo[n] = countWays(n-1,memo) + countWays(n-2,memo) + countWays(n-3, memo);
    // return memo[n];
    // }
    // }
    public static void main(String[] args) {

        System.out.println(countWays(9));

    }

}