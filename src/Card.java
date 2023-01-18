import java.util.Random;
import java.util.Scanner;

public class Card {
    String suit;
    int suitNumber;
    int inputSuitNumber;
    int value;

    public Card() {

    }

    public void beats() {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int input = 0;
        String input1 = "";
        System.out.println("Input a card value please");
        input = sc.nextInt();
        System.out.println("Input a card suit please");
        input1 = sc.next();
        value = rn.nextInt(1, 13);
        suitNumber = rn.nextInt(1,4);
        System.out.println(suitNumber);

        switch (input1) {
            case "s" -> inputSuitNumber = 4;
            case "h" -> inputSuitNumber = 3;
            case "d" -> inputSuitNumber = 2;
            case "c" -> inputSuitNumber = 1;
        }
        switch (suitNumber) {
            case 4 -> suit = "s";
            case 3 -> suit = "h";
            case 2 -> suit = "d";
            case 1 ->  suit="c";
        }

        if (inputSuitNumber < suitNumber) {
            System.out.println("You lose, our suit was " + suit);
        } else {
            if (value <= input) {
                System.out.println("You win, our card was " + value + " our suit was " + suit);
            } else {
                System.out.println("You lose, our card was " + value+ " our suit was " + suit);

            }


        }
    }
}


