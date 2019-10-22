package sk.itsovy.strausz.array;

import java.util.Random;

public class MyArray {

    public static void test1(){
        int [] arr = new int[7];

        for(int i = 0; i<=6; i++){
            arr[i] = i+1;
        }
        for (int i = 6; i >=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void test2(){
        System.out.println();
        Random rnd = new Random();
        int [] arr = new int[10];

        for(int i = 0; i<=9; i++){
            arr[i]= rnd.nextInt(90)+10;
        }

        for (int i = 0; i <=9; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 9; i >=0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i <=9; i++){
           if(arr[i]%2==0) {   // value:arr


               System.out.print(arr[i] + " ");
           }
        }


    }

    }

