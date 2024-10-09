public class Main {
    public static void main(String[] args) {

        int[][] Data1 = new int[][] {
            {4,6,8},
            {7,10,9}
        };

        int[][] Data2 = new int[][] {
            {5,6,8},
            {7,6,9}
        };

        System.out.println(Knapsack.Algorithm1(Data1,18));
        System.out.println(Knapsack.Algorithm1(Data2,18));

    }
}