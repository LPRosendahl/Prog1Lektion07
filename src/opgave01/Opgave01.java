package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        System.out.print("Numbers from integerArray: ");
        printIntegerArray(integerArray);
        System.out.println();
        System.out.println(crossSum(9));
        System.out.println(crossSum(123));

        int sum = addIntegerArray(integerArray);
        System.out.println("Sum af integerArray er: " + sum);

        double average = averageIntegerArray(integerArray);
        System.out.println("Average number in integerArray: " + average);

        crossSumIntegerArray(integerArray);

        System.out.println("Cross sums:");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        // Beregn tværsum af tværsum med din metode
        int[] result = crossSumOfCrossSumIntegerArray(integerArray);

        // Udskriv resultatet
        System.out.println("Cross sum of cross sums:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Index " + i + ": " + result[i]);
        }

        // Tæl hvor mange gange hvert enkeltciffer forekommer
        int[] counts = new int[9]; // index 0 = tallet 1, index 8 = tallet 9
        for (int i = 0; i < result.length; i++) {
            int value = result[i];
            if (value >= 1 && value <= 9) {
                counts[value - 1]++;
            }
        }

        // Udskriv tælling
        System.out.println("\nForekomster af enkeltcifre:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i + 1) + " forekommer " + counts[i] + " gange");
        }
    }









    public static int crossSum(int number) {
        if (number == 0) return 0;

        while (number >= 10) {
            int crossSum = 0;
            while (number > 0) {
                crossSum += number % 10;
                number /= 10;
            }
            number = crossSum;
        }
        return number;
    }

    private static int[] getIntegerArray() {
        int[] integerArray = {1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002};
        return integerArray;
    }

    private static void printIntegerArray(int[] integerArray) { // opgave a:
        for (int index = 0; index < integerArray.length; index++) {
            System.out.println(integerArray[index]);
        }
    }

    private static int addIntegerArray(int[] integerArray) { // opgave b
        int sum = 0;
        for (int index = 0; index < integerArray.length; index++) {
            sum = sum + integerArray[index];

        }
        return sum;
    }

    private static double averageIntegerArray(int[] integerArray) { // opgave c
        double average = 0;
        double sum = 0;
        for (int index = 0; index < integerArray.length; index++) {
            sum = sum + integerArray[index];

        }
        average = sum / integerArray.length;
        return average;
    }

    private static int[] crossSumIntegerArray(int[] integerArray) { // opgave d
        for (int index = 0; index < integerArray.length; index++) {

            int a = crossSum(integerArray[index]);

            integerArray[index] = a;
        }
        return integerArray;
    }

    private static int[] crossSumOfCrossSumIntegerArray(int[] integerArray) {
        integerArray = crossSumIntegerArray(integerArray);
        integerArray = crossSumIntegerArray(integerArray);


        return integerArray;
    }
}



