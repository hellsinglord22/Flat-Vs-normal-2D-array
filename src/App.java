/**
 * Description: The program shows the performance
 * advantage of 1D arrays over 2D arrays.
 * A flat array is nearly twice as fast.
 */

public class App {
    public static void main(String[] args) {
        long startTime , elapsedTime , finishTime;

        startTime = System.nanoTime();

        for(int i = 0 ; i < 1000000 ; i ++ ){
            /// do nothing //
        }
        finishTime = System.nanoTime();

        finishTime = finishTime - startTime;
        System.out.printf("Time take to loop 1,000,000 time: %d\n", finishTime);

        startTime = System.nanoTime();

        for(int i = 0 ; i < 1000000000 ; i ++ ){
            /// do nothing //
        }
        finishTime = System.nanoTime();

        finishTime = finishTime - startTime;
        System.out.printf("Time take to loop 1,000,000,00 time: %d\n", finishTime);





    }
}