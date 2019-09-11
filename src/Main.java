import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {





        ArrayList<Integer> numbers = new ArrayList<>();

        Random numberRandom = new Random();

        int numberSearch = 0;


        for (int i = 0; i <= 9 ; i++) {

            int num = 1 + numberRandom.nextInt(50);
            numbers.add(num);

        }

        System.out.println(numbers);


        System.out.println();
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer between 1-50:  ");
        numberSearch = input.nextInt();
        System.out.println();
        System.out.println("Value to find: " + numberSearch);


        for (int i = 0; i < 10 ; i++){

            if (numbers.get(i) == numberSearch){
                System.out.println();
                System.out.println( numberSearch + " is in the ArrayList...");

            }
        }


//Bonus: Only display one message. Either: # was not found or # was found 5 times. (Or however many times that it occurs)

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        numberSearch = 0;
        int searchCount = 0;

        for (int i = 0; i <= 9 ; i++) {

            int num = 1 + numberRandom.nextInt(50);
            numbers.add(num);

        }

        System.out.println(numbers);


        System.out.println();
        System.out.println();
        System.out.println("Enter a positive integer between 1-50:  ");
        numberSearch = input.nextInt();
        System.out.println();
        System.out.println("Value to find: " + numberSearch);


        for (int i = 0; i < 20 ; i++){

            if (numbers.get(i) == numberSearch){
                System.out.println();
                searchCount = searchCount + 1;

            }
        }

        if (searchCount == 0) {
            System.out.println("The number " + numberSearch + " was not found...");
        }
        if (searchCount == 1) {
            System.out.println("The number " + numberSearch + " was found " + searchCount + " time...");
        }
        if (searchCount > 1) {
            System.out.println("The number " + numberSearch + " was found " + searchCount + " times...");
        }




    }
}
