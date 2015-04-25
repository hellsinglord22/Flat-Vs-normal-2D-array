/**
 * Description: The program shows the performance
 * advantage of 1D arrays over 2D arrays.
 * A flat array is nearly twice as fast.
 */

public class App {
    public static void main(String[] args) {
        // Attributes //
        long startingTime, elapsedTime;

        int[] flatArray = new int[10 * 10];
        int[][] normal2DArray = new int[10][10];

        flatArray[0 + (4 * 10)] = 1;
        normal2DArray[0][4] = 1;

    }
}