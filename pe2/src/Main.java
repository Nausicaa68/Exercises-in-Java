import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("PROGRAMMING EXERCISES 2");
        testAverage(3);
        restaurantBill();
    }

    private static void testAverage(int numberOfScore){

        double[] score = new double[3];
        Scanner keyboard = new Scanner(System.in);

        for(int i=0 ; i<numberOfScore ; i++){
            System.out.print("Enter the score number " + (i+1) + " : ");
            score[i] = keyboard.nextDouble();
        }

        double average = 0;
        for(int i=0 ; i<numberOfScore ; i++){
            average += score[i];
        }
        average /= (double) numberOfScore;

        System.out.print(score[0] + " + "
                + score[1] + " + "
                + score[2] + " = "
                + average + "\n");
    }

    private static void restaurantBill(){
        System.out.print("What's the charge ? :");
        Scanner keyboard = new Scanner(System.in);
        double charge = keyboard.nextDouble();
        double tax = charge*0.0675;
        double tip = (charge + tax)*0.2;
        double total =  charge + tax + tip;

        System.out.print("Meal charge = " + charge + "\n"
                + "Tax amount  = " + tax + "\n"
                + "Tip amount = " + tip + "\n"
                + "Total = " + total + "\n" );

    }
}
