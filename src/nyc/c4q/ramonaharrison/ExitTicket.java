package nyc.c4q.ramonaharrison;

/**
 * Ramona Harrison
 * Access Code 2.1
 * ExitTicket.java
 * This class
 */
import java.util.Scanner;
import java.util.Random;

public class ExitTicket {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess;
        int number = rand.nextInt(20) + 1;
        boolean tooHigh;

        while (true) {
            System.out.println("Your guess: ");
            guess = input.nextInt();

                if (guess == number)
                    break;
                else {
                    if (guess > number)
                        tooHigh = true;
                    else
                        tooHigh = false;
                }

                if (tooHigh)
                    System.out.println("Your guess is too high!");
                else if (!tooHigh)
                    System.out.println("Your guess is too low!");


            }

            System.out.println("That's right!");
        }



    }


