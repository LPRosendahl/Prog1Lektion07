package opgave05;

public class Opgave05 {
    public static void main(String[] args) {
        int[] numbers = {7, 4, 3, 3, 5, 5, 5, 5, 1};
        int[] numbers1 = {4, 4, 4, 8, 8, 8};

        System.out.println("Den første liste har fire ens " + fourNumbersInARow(numbers));
        System.out.println("Den anden liste har fire ens " + fourNumbersInARow(numbers1));
    }

    private static boolean fourNumbersInARow(int[] numbers){
        int timesRepeated = 1;
        for (int index = 1; index < numbers.length; index++){
            if (numbers[index] == numbers[index - 1]){
                timesRepeated++;
                if (timesRepeated == 4){
                    return true;
                }
            } else {
                timesRepeated = 1;
            }
        }
        return false;
    }


}


//Lav en metode der afgør om en liste af heltal har fire ens tal i forlængelse af hinanden.
//
//7, 4, 3, 3, 3, 5, 5, 5, 5, 1 har fire ens tal i forlængelse af hinanden.
//
//4, 4, 4, 8, 8, 8 har ikke.