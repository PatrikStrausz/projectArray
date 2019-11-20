package sk.itsovy.strausz.array2D;

import java.util.Random;

public class Main {
    private final static int numRows = 4;
    private final static int numCols = 4;

    public static void main(String[] args) {


//        Random rnd = new Random();
//        int arr[][] = new int[numRows][numCols];
//        int r, c;
//        for (r = 0; r < numRows; r++) {
//            for (c = 0; c < numCols; c++) {
//                arr[r][c] = rnd.nextInt(10);
//            }
//        }
//
//
//        int max = arr[0][0];
//        int countOdd = 0;
//        int countEven =0;
//        for (r = 0; r < numRows; r++) {
//            for (c = 0; c < numCols; c++) {
//                if (arr[r][c] < 10) {
//                    System.out.print(" ");
//                }
//
//
//                System.out.print(arr[r][c] + " ");
//            }
//            System.out.println();
//        }
//
//        for (r = 0; r < numRows; r++) {
//            for (c = 0; c < numCols; c++) {
//
//                if (max < arr[r][c]) {
//                    max = arr[r][c];
//                }
//                if(arr[r] [c]%2==0){    // spocita parne cisla v poli
//                    countEven++;
//                }
//                if(arr[r] [c]%2!=0){ // spocita neparne cisla v poli
//                    countOdd++;
//                }
//
//
//            }
//        }
//        System.out.println("Max is: " +max);
//        System.out.println("Count of odd numbers: " +countOdd);
//        System.out.println("Count of even numbers: " +countEven);
//
//        int maxColSum=0;
//
//        for(r=0;r<numRows;r++)
//            maxColSum+=arr[r][0];
//
//        int sum=0;
//        for(c=1;c<numCols;c++) { // spocita sucet riadkov a vypise najvacsi
//            sum = 0;
//            for (r = 0; r < numRows; r++)
//                sum+=arr[r][c];
//            if(sum>maxColSum){
//                maxColSum=sum;
//
//            }
//        }
//        System.out.println("Max column value : "+ " [ sum: "+ maxColSum+" ]");
//
//        int minRC=numCols<numRows?numCols:numRows;
//        int mul=1;
//        for(r=0;r<minRC;r++) { // vynasobi cisla v diagonale
//            mul*=arr[r][r];
//        }
//        System.out.println("Multiplication of main diagonale is: "+mul);
//
//        for (c = 0; c < numCols; c++) {
//            for (r = 0; r < numRows; r++) {
//                if(arr[r][c] < 10 ){
//                    System.out.print(" ");
//                }
//                System.out.print(arr[r] [c] +" "); // transparentne vypise pole
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//
//
//
//        for (r = 0; r < numRows; r++) {
//            for (c = 0; c < numCols; c++) {
//
//                int index1 = rnd.nextInt(numRows);
//                int index2 = rnd.nextInt(numCols);
//                int index3 = rnd.nextInt(numRows);
//                int index4 = rnd.nextInt(numCols); // zmeni nahodne cisla v poli
//
//
//                int temp = arr[index1][index2];
//                arr[index1][index2] = arr[index3][index4];
//                arr[index3][index4] = temp;
//
//                System.out.print(arr[r][c] + " ");
//            }
//            System.out.println();
//            }
//        System.out.println();
//
//
//
//        int sum2=0;
//        for(int i =0; i<numCols; i++){
//            sum2 = sum2 + arr[0][i] + arr [numRows-1][i];
//        }
//        for(int i= 1; i<numRows-1;i++){
//            sum2 = sum2 + arr[i][0] + arr[i] [numCols-1]; // spocita cisla po obvode
//        }
//
//
//
//        System.out.println();
//         System.out.println("Sum is: " +sum2);

//        int[][] ticTacToe = {{1, 0, 2}, {0, 1, 2}, {0, 2, 0}};
//
//
//        for (int i = 0; i < ticTacToe.length; i++) {
//            for (int j = 0; j < ticTacToe.length; j++) {
//
//                System.out.print(ticTacToe[i][j] + " ");
//            }
//
//            System.out.println();
//        }


//        for (int i = 0; i < 3; i++) {
//            int temp = 1;
//            for (int j = 0; j < 3; j++) {
//                temp *= ticTacToe[i][j];
//                if (temp == 1) {
//                    System.out.println("Player one won.");
//                    break;
//                } else if (temp == 8) {
//                    System.out.println("Player two won.");
//                    break;
//                } else if (temp == 0) {
//                    System.out.println("Draw");
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            int temp = 1;
//            for (int j = 0; j < 3; j++) {
//                temp *= ticTacToe[j][i];
//
//                if (temp == 1) {
//                    System.out.println("Player one won.");
//                    break;
//                } else if (temp == 8) {
//                    System.out.println("Player two won.");
//                    break;
//                } else if (temp == 0) {
//                    System.out.println("No one won");
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            int temp = 1;
//
//            temp *= ticTacToe[i][i];
//
//            if (temp == 1) {
//                System.out.println("Player one won.");
//                break;
//            } else if (temp == 8) {
//                System.out.println("Player two won.");
//                break;
//            } else if (temp == 0) {
//                System.out.println("No one won");
//                break;
//            }
//
//        }
//
//        for (int j = 0; j < 3; j++) {
//            int temp = 1;
//            temp *= ticTacToe[j][j];
//
//            if (temp == 1) {
//                System.out.println("Player one won.");
//                break;
//            } else if (temp == 8) {
//                System.out.println("Player two won.");
//                break;
//            } else if (temp == 0) {
//                System.out.println("No one won");
//                break;
//            }
//        }

        Random rnd = new Random();
        int [] [] a = new int  [4] [4];
        int [] [] b = new int  [4] [4];

        for(int i=0;i<4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = rnd.nextInt(90)+10;
                b[i][j] = rnd.nextInt(90)+10;
            }

        }

        for(int i=0;i<4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " " );

            }
            System.out.println();

        }
        System.out.println();

        for(int i=0;i<4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + " " );

            }
            System.out.println();

        }

        System.out.println();

        int  [] [] sum = new int[4][4];
        for(int i=0; i<4; i++){
            for(int j = 0; j<4; j++){
                sum [i] [j] = a[i] [j] + b [i] [j]; // spocita hodnoty poli na rovnakej pozicii 
            }
        }

        for(int i=0; i<4; i++){
            for(int j = 0; j<4; j++) {
                System.out.print(sum[i] [j] + " ");
             }
            System.out.println( );
            }

    }
}


