import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROGRAMMING EXERCISES 4");
        distanceTravel(); System.out.println("");
        //celciusToFahrenheit(); System.out.println("");
       // diceGame(10); System.out.println("");

    }

    private static void distanceTravel(){
        Scanner keyboard = new Scanner(System.in);

        double speed, hourTraveled;
        do{
            System.out.println("Enter the speed (mph) : ");
            speed = keyboard.nextDouble();
        }while(speed < 0);
        do{
            System.out.println("Enter the hour traveled : ");
            hourTraveled = keyboard.nextDouble();
        }while(hourTraveled < 1);


        System.out.println("Hour    Distance Traveled");
        System.out.println("--------------------------");
        int i;
        for(i=1 ; i<=hourTraveled; i++){
            System.out.println(" " + i + "     " + speed*i);
        }
        if(hourTraveled - (int)hourTraveled != 0.0 ){
            // if the time traveled is not integer
            System.out.println(" " + hourTraveled + "     " + speed*hourTraveled);
        }
    }

    private static void celciusToFahrenheit(){
        System.out.println("Celcius | Fahrenheit");
        System.out.println("------- | ----------");
        for(double i=0 ; i<=20 ; i++){
            System.out.println(i + "         " + ((9.0/5.0)*i + 32.0));
        }
    }

    private static void diceGame(int numberOfPlay){
        Random randomValue = new Random();
        int computerDiceValue, playerDiceValue, nbWinComputer = 0, nbWinPlayer = 0;
        System.out.println("");

        for(int i=1 ; i<=numberOfPlay ; i++){
            computerDiceValue = randomValue.nextInt(6) + 1;
            playerDiceValue = randomValue.nextInt(6) + 1;

            System.out.println("Game " + i + "\n"
                    + "Computer score : " + computerDiceValue + "\n"
                    + "Player score : " + playerDiceValue);

            if(computerDiceValue < playerDiceValue){
                System.out.println("Player wins !");
                nbWinPlayer += 1;
            }
            else if(computerDiceValue > playerDiceValue){
                System.out.println("Computer wins !");
                nbWinComputer += 1;
            }
            else{
                System.out.println("Tie ! So the computer wins ! (just kidding)");
            }

            System.out.println("-----------------------");
        }

        System.out.println("\tFinsih !");
        System.out.println("The computer wins " + nbWinComputer + "times.");
        System.out.println("The player wins " + nbWinPlayer + "times.");

        if(nbWinComputer > nbWinPlayer){
            System.out.println("Computer wins !");
        }
        else if(nbWinComputer < nbWinPlayer){
            System.out.println("Player wins !");
        }
        else{
            System.out.println("Tie ! Friendship wins ! ");
        }

    }


}
