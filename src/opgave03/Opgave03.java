package opgave03;

public class Opgave03 {
    public static void main(String[] args) {

        System.out.println(weekday(5, 14));
    }

    public static String weekday(int dayOfWeek, int daysInTheFuture) {

        String[] weekdays = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};
        dayOfWeek = (dayOfWeek + daysInTheFuture) % 7;
        return weekdays[dayOfWeek];
    }
}

//Reimplementer metoden weekday, men brug et array til at udskrive ugedagene i stedet for if/else sætningen.