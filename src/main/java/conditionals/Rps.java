package conditionals;

import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Select \n 'r' for 'Rock', 'p' for 'Paper' and, 's' for 'Scissors'");
        String playersChoice = new Scanner((System.in)).nextLine();
        int computerChoice = new Random().nextInt(3);
        String compChoice = "";

        if (computerChoice == 0){
             compChoice = "Rock";
        }
        else if (computerChoice == 1){
             compChoice ="Paper";
        }
        else {
            compChoice = "Scissors";
        }

        if ((playersChoice.equalsIgnoreCase("r") && computerChoice == 2) ||
                (playersChoice.equalsIgnoreCase("p") && computerChoice == 0) ||
                (playersChoice.equalsIgnoreCase("s") && computerChoice ==1 )){
            System.out.println("I chose "+ compChoice);
            System.out.println("You win!!");
        }

        else if ((playersChoice.equalsIgnoreCase("r") && computerChoice == 0) ||
                (playersChoice.equalsIgnoreCase("p") && computerChoice == 1) ||
                (playersChoice.equalsIgnoreCase("s") && computerChoice ==2 )){
//            System.out.println("I chose "+ switch(computerChoice){
//                case 0 -> "Paper";
//                case 1 -> "Scissors";
//                case 2 -> "Rock";
//                default -> throw new IllegalStateException("Unexpected value: " + computerChoice);
//            });
            System.out.println("I chose "+ compChoice);
            System.out.println("Draw, try again");
        }

        else{
            System.out.println("I chose "+ compChoice);
            System.out.println("Fail,try again");
        }
    }
}
