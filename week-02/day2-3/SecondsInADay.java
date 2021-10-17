public class SecondsInADay {
        public static void main(String[] args) {
            int currentHours = 14;
            int currentMinutes = 34;
            int currentSeconds = 42;

            // Írj egy programot, ami kiszámítja, hogy hány másodperc
            // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
            // lehet beállítani (a végeredmény is legyen egész szám)

            int hoursLeftInSeconds = (23-currentHours)*60*60;
            int minutesLeftInSeconds = (59-currentMinutes)*60;
            int secondsLeft = 60-currentSeconds;
            System.out.println("Seconds left in the day: "+ (hoursLeftInSeconds+minutesLeftInSeconds+secondsLeft));
        }
    }

