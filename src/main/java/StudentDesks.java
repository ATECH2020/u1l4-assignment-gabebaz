import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        /*
         *  your code goes here
         */
        int desks1 = (group1 / 2) + (group1 % 2);
        int desks2 = (group2 / 2) + (group2 % 2);
        int desks3 = (group3 / 2) + (group3 % 2);
        int totalDesks = desks1 + desks2 + desks3;

        System.out.println(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}