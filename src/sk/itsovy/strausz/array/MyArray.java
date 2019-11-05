package sk.itsovy.strausz.array;

import sk.itsovy.strausz.school.Student;
import sk.itsovy.strausz.school.Teacher;

import java.util.Random;
import java.util.Scanner;

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


    public static void test4() {
        int arr[] = new int[19];

        arr[0] = 1;
        arr[1] = 1;


        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            //fibonaciho postupnost
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }


    public static int[] minmax(int a, int b, int c) {
        int[] result = new int[2];


        if (a > b && a > c) {
            result[1] = a;
        }
        if (b > a && b > c) {
            result[1] = b;
        }
        if (c > a && c > b) {
            result[1] = c;
        }                                            //vypise min aj max

        if (a < b && a < c) {
            result[0] = a;
        }
        if (c < a && c < b) {
            result[0] = c;

        }
        if (b < a && b < c) {
            result[0] = b;
        }

        System.out.println(result[0] + " " + result[1]);
        return result;
    }


    public static void test6() {
        int[] field = new int[10];

        int[] field2 = new int[10];


        for (int i = 0; i < field.length; i++) {

            field[i] = (int) Math.pow(2, i);           // mocniny dvojky

        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < 10; i++) {
            field2[9 - i] = field[i];

        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field2[i] + " ");         //mocniny dvojky naopak
        }
        System.out.println();

    }


    public static void test7() {


        int[] b = {12, 38, 47, 5, 29, 16, 10, 112, 48, 65, 75, 9};

        int size = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 3 != 0)
                size++;
        }

        int[] b3n = new int[size];            //vypise cisla delitelne 3 z pola b

        int j = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 3 != 0) {
                b3n[j] = b[i];
                j++;
            }
        }
        for (int value : b3n) {
            System.out.print(value + " ");
        }

        System.out.println();

        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {        // skopiruje B
            c[i] = b[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(c[i] + " ");
        }

        // alebo
//        for(int value:c){
//            System.out.print(value + " ");
//        }

//        int c [];
//        c= b.clone();                      //2. sposob ako skopirovat B


//        System.arraycopy(b,0,c,0,b.length); // 3. sposob ako skopirovat B
    }


    public static void test8() {
        Random rnd = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++) {

            int count = 0;
            int temp = rnd.nextInt(50) + 1;

            for (int j = 0; j < i; j++) {                       //nahodne cisla ktore sa nesmu opakovat
                if (temp == a[j]) {
                    count = 1;
                    break;
                }
            }
            if (count == 0)
                a[i] = temp;
            else
                i--;
        }
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }


    public static void test9() {
        Random rnd = new Random();

        Student[] arr = new Student[5];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = new Student("Student" + i, rnd.nextInt(68) + 10, "1N");
        }                                                         // vytvori 5. studentov

        for (Student temp : arr) {
            System.out.println(temp.getName() + " " + temp.getAge());
        }

        System.out.println();

        for (Student temp : arr) {
            if (temp.getAge() < 18) {
                System.out.println(temp.getName() + " " + temp.getAge());   // vypise neplnoletych
            }


        }
        System.out.println();

        Teacher[] arr1 = new Teacher[8];
        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = new Teacher("Teacher " + i, rnd.nextInt(80) + 20, rnd.nextInt(500) + 500);
        }                                                            //vytvori 8. ucitelov

        for (Teacher temp1 : arr1) {
            System.out.println(temp1.getName() + " " + temp1.getAge() + " " + temp1.getSalary());
        }

        System.out.println();

        for (Teacher temp1 : arr1) {
            if (temp1.getSalary() >= 765 && temp1.getSalary() <= 935) {
                System.out.println(temp1.getName() + " " + temp1.getAge() + " " + temp1.getSalary());
            }
        }


    }

    public static void test10() {
        String[] names = {"Ivan", "Peter", "Erik", "Zuzana", "Patrik", "Viliam"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");       //Vypise vsetky mena
        }
        System.out.println();

        //alebo

//        for (String name:names){
//            System.out.print(name +" ");
//        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("a") || names[i].contains("A")) {
                System.out.print(names[i] + " ");                         // v mene  sa nachadza "A"
            }
        }
        System.out.println();


        int max = names[0].length();

        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > max) {
                max = names[i].length();               //vypise najdlhsie mena
            }

        }
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() == max) {
                System.out.print(names[i] + " ");
            }
        }

        System.out.println();

        int min = names[0].length();

        for (int i = 1; i < names.length; i++) {
            if (names[i].length() < min) {
                min = names[i].length();                  //vypise najkratsie mena
            }
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() == min) {
                System.out.print(names[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].toUpperCase() + " ");       //Vypise vsetky mena velkymi pismenami
        }
        System.out.println();


        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            for (int j = 0; j < name.length(); j++) {
                String z = String.valueOf(name.charAt(j));   //Vypise vsetky mena bez samohlasok
                if ("AEIOUYaeiouy".contains(z)) {
                    System.out.print(".");
                } else {
                    System.out.print(z);
                }
            }
            System.out.print("  ");

        }


    }

public static void test11(){
    Scanner scanner = new Scanner(System.in);
    String name = " dss";
    System.out.println("Enter a word:");
    name = scanner.nextLine();

    int word= name.length();


    for(int i = word-1; i>=0; i--){                  //prijme slovo z klavesnice a vypise ho naopak
        name=name.trim();                             // vymaze zbytocne medzery
        System.out.print(name.charAt(i));

    }
 }

 public static void test12(){

        int []a = {17,0,-2,13,68,103,21,55,1};

        int n= a.length;
        for(int i = 0; i<=n-1; i++){
            for (int j = i+1; j <n; j++){          // zoradi cisla vzostupne
                if(a[i] > a[j]){
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]= temp;


                }

            }
            System.out.print(a[i]+ " ");
        }
 }


 public static void test13(){
        Random rnd = new Random();
        int a[]= new int[20];

     for (int i = 0; i < a.length; i++) {

         int count = 0;
         int temp = rnd.nextInt(80) + 1;


         for (int j = 0; j < i; j++) {
             if (temp == a[j]) {
                 count = 1;
                 break;
             }
         }
         if (count == 0)
             a[i] = temp;
         else
             i--;
     }
     for (int i = 0; i < a.length; i++) {  //vygeneruje 20 nahodnych cisel, ktore sa nesmu opakovat a potom ich zoradi vzostupne
         System.out.print(a[i] + " ");
     }

     System.out.println();

     int n= a.length; //koniec pola "n"
     for(int i = 0; i<=n-1; i++){
         for (int j = i+1; j <n; j++){
             if(a[i] > a[j]){
                 int temp= a[i];
                 a[i]=a[j];
                 a[j]= temp;
             }

         }
         System.out.print(a[i]+ " ");
     }
 }


 public static void test14() {
     String[] a = {"Monika", "Yelizaveta", "Nikoleta", "Denis", "Damian", "Jakub", "Laco",
             "Vlado", "Martin", "Miro", "Patrik", "Artem", "Tibor", "Jakub", "Jakub","Peto"};


     for (int i = 0; i < a.length; ++i) {
         for (int j = i + 1; j < a.length; ++j) {   // zoradi mena abecedne
             if (a[i].compareTo(a[j]) > 0) {
                 String temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }

         System.out.print(a[i] + " ");
     }

     System.out.println();

     for (int i = a.length-1; i >= 0; i--) {
         for (int j = i + 1; j < a.length; ++j) {   // zoradi mena abecedne naopak
             if (a[i].compareTo(a[j]) > 0) {
                 String temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }

         System.out.print(a[i] + " ");
     }


     }


 public static void test15(){ //bublinkova metoda
       int[] a = { 12,7,14,4,10};
int n = a.length;
       for(int i=0; i<n-1; i++){
           for(int j=0; j<n-1-i; j++){
               if(a[j] > a[j+1]){
                   int t = a[j];
                   a[j]= a[j+1];
                   a[j+1]= t;
               }

           }
       }
       for(int i=0; i<a.length;i++){
           System.out.print(a[i] + " ");
       }

 }


}






