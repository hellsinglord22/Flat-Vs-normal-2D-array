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

        /// lets try the flat array ///
        startingTime = System.currentTimeMillis();

        /// Read, Assign ///
        for (int i = 0; i < 100000000; i++) {
            int value = flatArray[0 + (4 * 10)];
            flatArray[9 + (9 * 10)] = value;
        }

        elapsedTime = System.currentTimeMillis() - startingTime;

        System.out.printf("Flat array time: %d\n" , elapsedTime);

        /// 2D array ///
        startingTime = System.currentTimeMillis();

        /// Read, Assign ///
        for (int i = 0; i < 100000000; i++) {
            int value = normal2DArray[0][4];
            normal2DArray[9][9] = value;
        }

        elapsedTime = System.currentTimeMillis() - startingTime;
        System.out.printf("2D array time: %d\n" , elapsedTime);

    }
}