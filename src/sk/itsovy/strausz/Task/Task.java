package sk.itsovy.strausz.Task;

public class Task {

    int[] data = {2818, 7400, 146, 1870, 7668, 5307, 137, 473, 6359, 7633,
            2665, 5307, 1924, 49, 881, 3444, 1635, 4429, 1590, 5166, 2554, 7475,
            1286, 1913, 6145, 8329, 6460, 5965, 2278, 3609, 5979, 3877, 325,
            6847, 407, 4097, 5608, 6273, 3329, 4878, 7165, 879, 1533, 1055, 2014,
            3795, 5174, 5760, 1290, 8438, 5419, 5802, 1672, 6654, 2665, 3053,
            392, 1590, 3860, 849, 3986, 2519, 3568, 384, 6882, 4781, 1312,
            5919, 8319, 5378, 7095, 5823, 1778, 2791, 6989, 317, 2765, 7694,
            6039, 111, 1331, 6531, 2331, 3968, 6519, 6529, 6586, 6273, 4528,
            1554, 8415, 2971, 7810, 3645, 6826, 1254, 2600, 6385, 3329,
            7509, 2011, 4397, 5193, 1650, 7225, 7068, 3655};


    public void sort() {

        int n = data.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n; j++) {          // zoradi cisla vzostupne
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;


                }

            }
            System.out.print(data[i] + " ");
        }
        System.out.println();


    }


    public void average() {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {

            sum += data[i];
            avg = (double) sum / data.length;


        }

        System.out.println("Avg is: " + avg);


    }


    public void oddNumbers() {

        int countOdd = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                countOdd++;
            }
        }

        System.out.println("Count of odd numbers is: " + countOdd);
    }

    public void task4() {
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 7 == 0) {
                count++;
            }

        }

        System.out.println("Count is: " + count);
    }

    public void repeatingNumbers() {
        System.out.println("Repeated Elements are :");
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j])
                    System.out.print(data[i] + " ");
            }
        }


    }

}
