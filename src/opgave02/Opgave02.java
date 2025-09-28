package opgave02;

public class Opgave02 {
    public static void main(String[] args) {

        char[] characterArray = getCharacterArray();

        int[] vowelCounts = countVowels(characterArray);
        String[] vokaler = {"a", "e", "i", "o", "U", "y", "æ", "ø", "å"};
        for (int index = 0; index < vowelCounts.length; index++){
            System.out.println("Antal " + vokaler[index] + " er: " + vowelCounts[index]);

        }

        System.out.println();

        char[] leet = leetSpeak(characterArray);
        System.out.println(new String(leet));




    }


    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }

    private static int[] countVowels(char[] characterArray) {
        int[] numberOfVowels = new int[9];

        for (int index = 0; index < characterArray.length; index++) {
            char c = Character.toLowerCase(characterArray[index]);
            if (c == 'a') {
                numberOfVowels[0]++;
            } else if (c == 'e') {
                numberOfVowels[1]++;
            } else if (c == 'i') {
                numberOfVowels[2]++;
            } else if (c == 'o') {
                numberOfVowels[3]++;
            } else if (c == 'u') {
                numberOfVowels[4]++;
            } else if (c == 'y') {
                numberOfVowels[5]++;
            } else if (c == 'æ') {
                numberOfVowels[6]++;
            } else if (c == 'ø') {
                numberOfVowels[7]++;
            } else if (c == 'å') {
                numberOfVowels[8]++;
            }
        }


        return numberOfVowels;
    }

    private static char[] leetSpeak(char[] characterArray) {
        for (int index = 0; index < characterArray.length; index++) {
            char c = characterArray[index];
            if (c == 'A') {
                characterArray[index] = '4';
            } else if (c == 'B') {
                characterArray[index] = '8';
            } else if (c == 'C') {
                characterArray[index] = '[';
            } else if (c == 'E') {
                characterArray[index] = '3';
            } else if (c == 'I') {
                characterArray[index] = '|';
            } else if (c == 'J') {
                characterArray[index] = ']';
            } else if (c == 'O') {
                characterArray[index] = '0';
            } else if (c == 'S') {
                characterArray[index] = '$';
            } else if (c == 'T') {
                characterArray[index] = '7';
            } else if (c == 'Z') {
                characterArray[index] = '2';
            } else if (c == 'a') {
                characterArray[index] = '@';
            } else if (c == 'b') {
                characterArray[index] = '6';
            } else if (c == 'g') {
                characterArray[index] = '9';
            } else if (c == 'l') {
                characterArray[index] = '1';
            } else if (c == 's') {
                characterArray[index] = '5';
            } else if (c == 't') {
                characterArray[index] = '+';
            }
        }


        return characterArray;
    }
}

/*Lav en metode der tager et char[] som parameter, gennemløber det og tæller
hvor mange vokaler der er i det. Metoden skal returnere et int[] hvor index 0
angiver hvor mange a'er der er , index 1 angiver hvor mange e'er der er og så
viderer med vokalerne i, o, u, y, æ, ø, å
 */

/* opgave b:  Lav en metode der løber igennem bogstaverne i et
char array ud udskifter bogstaverne, så teksten bliver omformet
til leetspeak.

 */
