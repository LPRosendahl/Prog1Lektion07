package opgave06;

public class Niam {
    public static void main(String[] args) {
        int[] myIntArray = {3, 6, 9, 12};
        printIntegerArray(myIntArray);
        addFive(myIntArray);
        printIntegerArray(myIntArray);

    }

    public static void printIntegerArray(int[] intArray) {
        for (int integer: intArray){
            System.out.println(integer);
        }
        System.out.println();
    }

    public static void addFive(int[] intArray) {
        for (int index = 0; index < intArray.length; index++){
            intArray[index] += 5;
        }
    }
}
