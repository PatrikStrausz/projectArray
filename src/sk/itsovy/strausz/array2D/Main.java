package sk.itsovy.strausz.array2D;

import java.util.Random;

public class Main {
    private final static int numRows = 4;
    private final static int numCols = 4;

    public static void main(String[] args) {


        Random rnd = new Random();
        int[][] array;
        int r, c;


        array = new int[numRows][numCols];

        int maxColSum = 0;
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numCols; c++) {
                array[r][c] = rnd.nextInt(10) ;

            }

        }
        int min = array[0][0];
        int max = array[0][0];

        int column = 0;
        int sum = 0;

        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numCols; c++) {
                if (array[r][c] < 10)
                    System.out.print(" ");


                if (max < array[r][c]) {
                    max = array[r][c];
                }

                if (min > array[r][c]) {
                    min = array[r][c];
                }


                System.out.print(array[r][c] + "  ");



            }


            System.out.println();


        }

        System.out.println();
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);


//        int maxColSum = 0;
//        int column = 0;
//        int sum = 0;
//
//        for (r = 0; r < numRows; r++) {
//            maxColSum += array[r][0];
//        }
//
//        for (c = 1; c < numCols; c++)
//            sum = 0;
//        for (r = 0; r < numRows; r++)
//            sum += array[r][c];   // spocita sucet riadkov a vypise najvacsi
//        if (sum > maxColSum) {
//            maxColSum = sum;
//            column = c;
//
//        }



//        System.out.println("Max column value: " + column + " sum: " + maxColSum);

        int minRc = numCols<numRows?numCols:numRows;
        int mult=1;
        for(r =0;r<minRc;r++){
            mult*=array[r] [r];
        }
        System.out.println("Mul of main diagonal is: " +mult);


        for (c = 0; c < numCols; c++) {

            for (r = 0; r < numRows; r++) {

                if (array[r][c] < 10)
                    System.out.print(" ");
                System.out.print(array[r] [c] + " "); // transparentne vypise pole
            }
            System.out.println( );
        }



 int [][]ticTacToe = {{1,0,2}, {0,1,2}, {0,2,0}};
        ticTacToe= new int[3][3];

    }

}
