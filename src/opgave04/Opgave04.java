package opgave04;

public class Opgave04 {
    public static void main(String[] args) {
        String[] words = {"ABBA", "mellem", "radar", "racecar", "ror"};

        for (String word : words) {
            if (isPalindrom(word)) {
                System.out.println(word + " er et palindrom.");
            } else {
                System.out.println(word + " er ikke et palindrom.");
            }
        }
    }

    private static boolean isPalindrom(String tekst) {
        tekst = tekst.toLowerCase(); // gør sammenligningen case-insensitiv
        int start = 0;
        int slut = tekst.length() - 1;

        while (start < slut) {
            if (tekst.charAt(start) != tekst.charAt(slut)) {
                return false;
            }
            start++;
            slut--;
        }

        return true;
    }
}


//Lav en metode der afgør om en streng er et pallidrom. "ABBA", "mellem" of "radar" er eksempler pallidromer.