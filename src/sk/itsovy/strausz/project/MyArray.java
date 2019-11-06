package sk.itsovy.strausz.project;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MyArray implements ArrayMethods{

    private int arr[];
    private int size;

    public MyArray(int size) {
        if(size<=0){
            System.out.println("Wrong size");
        }
        this.size = size;
        arr= new int[size];

        resetArrayToZero();
    }

    public int getSize() {
        return size;
    }

    private void resetArrayToZero() {
        for(int i = 0; i<size; i++){  //defaultne nastavi pole na same nuly
            arr[i]=0;
        }
    }

    public MyArray(int[] input) {
        if(input.length==0 ||input==null){
            System.out.println("Cannot declare an array!");
        }

        this.arr = input;
        this.size=input.length;
    }

    @Override
    public double getAverageValue() {
      int sum=0;
      for(int i=0; i<size;i++){
          sum+=arr[i] ;
      }
        return sum/size;
    }

    @Override
    public int min() {
       int min = arr[0];
       for(int i=0; i<size;i++) {
           if (arr[i] < min) {
               min = arr[i];
           }

       }
        return min;
    }

    @Override
    public int max() {
        int max = 0;
        for(int i=0; i<size;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    @Override
    public int min2()  {

        int min = min();
        int secondMin = arr[0];
        for (int j = 0; j < arr.length; j++) {


            if (secondMin > arr[j] && min != arr[j]) {
                secondMin = arr[j];
            }
        }
        return secondMin;
    }

    @Override
    public int max2() {
        int max = max();
        int secondMax = 0;
        for (int j = 0; j < arr.length; j++) {


            if (secondMax < arr[j] && max != arr[j]) {
                secondMax = arr[j];
            }
        }
        return secondMax;
    }

    @Override
    public void generateValues(int a, int b) {
        Random rnd = new Random();
        if(a<b) {
            int value = rnd.nextInt(b - a + 1) + a;
        }else {
            System.out.println("Wrong values");
        }

    }

    @Override
    public boolean contains(int value) {
        for(int i=0; i<size; i++){
            if(arr[i]==value){
                return true;
            }


        }
        return false;
    }

    @Override
    public int countOfValues(int value) {
        int count=0;
        for(int i=0;i<size;i++){
        if(value==arr[i]) {
            count++;
        }

        }
        return count;
    }

    @Override
    public int countOfEvenValues() {
        int countEven = 0;
        int countOdd=0;
        for (int i = 0; i < size; i++) {

            if (arr[i]%2==0){
                countEven++;
            }
            countOdd++;

        }
        return countEven;

    }

    @Override
    public void incrementValues() {
        for(int i=0;i<size; i++){
            arr[i]+=1;
            System.out.print(arr[i]+ " ");
        }


    }

    @Override
    public void sort(boolean asc) {
        if (asc) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else {
            for(int i=size-1; i>=0;i--){
                System.out.print(arr[i] + " ");
            }
        }
    }

    @Override
    public void addItem(int newValue) {
        int[] array2 = {newValue};
        int[] array = new int[arr.length + array2.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.arraycopy(array2, 0, array, arr.length, array2.length);




        for(int i=0; i<array.length;i++) {
           System.out.print(array[i] +  " " );
       }


    }

    @Override
    public void addItem(int newValue, int position) {

        int[] array2 = {newValue};
        int[] array = new int[arr.length + array2.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.arraycopy(array2, 0, array, arr.length, array2.length);




        for(int i=0; i<array.length;i++) {
            System.out.print(array[i] +  " " );
        }


    }




    @Override
    public int[] copy() {
   int a [] ;
    a= arr.clone();

         return a;
    }

    @Override
    public int getItem(int position) {
        return 0;
    }

    @Override
    public String toString (){
      return "s";
    }
}
