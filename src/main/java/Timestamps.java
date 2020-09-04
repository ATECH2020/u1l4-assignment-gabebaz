import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
         int calcHours = (hours2 - hours1) * 3600;
         int calcMins = (minutes2 - minutes1) * 60;
         int calcSecs = seconds2 - seconds1;

         System.out.print(calcHours + calcMins + calcSecs);


        // closing the scanner object
        scanner.close();
    }
}