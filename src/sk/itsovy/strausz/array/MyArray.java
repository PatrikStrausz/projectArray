package sk.itsovy.strausz.array;

import java.util.Random;

public class MyArray {

    public static void test1() {
        int[] arr = new int[7];

        for (int i = 0; i <= 6; i++) {
            arr[i] = i + 1;
        }
        for (int i = 6; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void test2() {
        System.out.println();
        Random rnd = new Random();
        int[] arr = new int[10];

        for (int i = 0; i <= 9; i++) {
            arr[i] = rnd.nextInt(90) + 10;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i <= 9; i++) {
            if (arr[i] % 2 == 0) {   // value:arr


                System.out.print(arr[i] + " ");
            }
        }


    }

    public static void test3() {
        System.out.println();
        Random rnd = new Random();
        int arr[] = new int[12];

        int sum = 0;
        double avg = 0;
        int countEven = 0;
        int countOdd = 0;


        for (int i = 0; i <= 11; i++) {
            arr[i] = rnd.nextInt(90) + 10;

        }

        int min = arr[0];
        int secondMin = arr[0];
        int secondMax = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            avg = (double) sum / arr.length;
            System.out.print(arr[i] + " ");

            if (arr[i] > max) {

                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] % 2 == 0) {
                countEven++;

            } else if (arr[i] % 2 != 0) {
                countOdd++;
            }


        }

        for (int j = 0; j < arr.length; j++) {

            if (secondMin > arr[j] && min != arr[j]) {
                secondMin = arr[j];
            }
            if (secondMax < arr[j] && max != arr[j]) {
                secondMax = arr[j];
            }
        }

        System.out.println();
        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + avg);
        System.out.println("Max is: " + max);
        System.out.println("Second largest is: " + secondMax);
        System.out.println("Min is: " + min);
        System.out.println("Second lowest is: " + secondMin);
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);

    }


    public static void test4(){
        int arr[] = new int [19];

        arr[0]=1;
        arr[1]=1;


        for(int i=2; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
                                                   //fibonaciho postupnost
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }



    }




    public static int[] minmax ( int a, int b, int c){
        int[] result = new int[2];


        if (a > b && a > c) {
            result[1] = a;
        }
       if(b > a && b > c){
            result[1]= b;
       }
       if(c > a && c > b){
            result[1] = c;
       }

       if(a < b && a < c){
            result[0]=a;
       }
       if( c < a && c < b){
            result[0]=c;

       }
       if(b < a && b < c){
            result[0]=b;
       }

        System.out.println(result[0]+ " " + result[1]);
        return result;
    }



}

