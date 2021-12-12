import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int counter = 0;
        int compScore = 0;
        int userScore = 0;

        while (counter == 0){
            int compChoice = 1 + r.nextInt(3);

            System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors.");
            int userPrompt = sc.nextInt();

            if(userPrompt == compChoice) {


                System.out.println("It's a tie.");

            }else if (userPrompt == 1) {

                if (compChoice == 2) {

                    System.out.println("Computer selected paper.");
                    System.out.println("You lost!");

                    compScore++;
                    System.out.println("Computer: " + compScore);
                    System.out.println("User: " + userScore);

                }
                else if (compChoice == 3) {

                    System.out.println("Computer selected scissors.");
                    System.out.println("You won!");

                    userScore++;
                    System.out.println("Computer: " + compScore);
                    System.out.println("User: "+userScore);


                }
            }else if (userPrompt == 2) {

                if(compChoice == 1) {

                    System.out.println("Computer selected rock.");
                    System.out.println("You won!");

                    userScore++;
                    System.out.println("Computer: "+compScore);
                    System.out.println("User: "+userScore);
                }else if (compChoice == 3) {

                    System.out.println("Computer selected scissors.");
                    System.out.println("You lost!");

                    compScore++;
                    System.out.println("Computer: "+compScore);
                    System.out.println("User: "+userScore);
                }
            }else if (userPrompt == 3) {
                if (compChoice == 1) {
                    System.out.println("Computer selected rock.");
                    System.out.println("You lost!");

                    compScore++;
                    System.out.println("Computer: " + compScore);
                    System.out.println("User: " + userScore);
                } else if (compChoice == 2) {
                    System.out.println("Computer selected paper.");
                    System.out.println("You won!");

                    userScore++;
                    System.out.println("Computer: " + compScore);
                    System.out.println("User: " + userScore);

                }
            }


            if (userScore == 5) {
                System.out.println("YOU WON THE GAME!");
                counter++;


            }



            if (compScore == 5) {
                System.out.println("YOU LOST THE GAME!");
                counter++;


            }

        }






    }
}
