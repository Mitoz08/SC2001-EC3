import java.util.Arrays;

public class Knapsack {

    public static int Algorithm1 (int[][] data, int totaWeight) {
        int[] curKnapSack = new int[totaWeight+1];
        int[] nxtKnapSack;

        // Initialise first row
        int weight = data[0][0];
        int price = data[1][0];
        for (int i = 0; i <= totaWeight; i++) {
            if (weight <= i) curKnapSack[i] = curKnapSack[i-weight] + price;
        }
        System.out.println(Arrays.toString(curKnapSack));

        for (int i = 1; i < data[0].length; i++) {
            weight = data[0][i];
            price = data[1][i];
            nxtKnapSack = new int[totaWeight+1];
            for (int j = 0; j <= totaWeight; j++) {
                nxtKnapSack[j] = curKnapSack[j];
                if (weight <= j) nxtKnapSack[j] =   Math.max(nxtKnapSack[j-weight] + price, nxtKnapSack[j]);
            }
            curKnapSack = nxtKnapSack;
            System.out.println(Arrays.toString(curKnapSack));
        }
        return curKnapSack[totaWeight];
    }
}
