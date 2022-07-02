import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROGRAMMING EXERCISES 7");

        try {
            List<Float> listOfNumbers = NumberAnalysis.fileReader("src/numbers.txt");

            System.out.println("In the following list of " + listOfNumbers.size() + " numbers : \n"
                    + listOfNumbers + "\n"
                    + "The lowest number in the array : " + NumberAnalysis.lowestNumber(listOfNumbers) + "\n"
                    + "The highest number in the array : " + NumberAnalysis.higherNumber(listOfNumbers) + "\n"
                    + "The total of the number in the array : " + NumberAnalysis.totalNumber(listOfNumbers) + "\n"
                    + "The average of the number in the array : " + NumberAnalysis.average(listOfNumbers) + "\n"
            );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
