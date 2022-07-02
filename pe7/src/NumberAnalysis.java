import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAnalysis {

    public static List<Float> fileReader(String path) throws IOException {

        List<Float> listOfNumbers = new ArrayList<Float>();
        Scanner scan = null;

        try{
            scan = new Scanner(new File(path));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        while (scan.hasNext()){
            if(scan.hasNextFloat()) {
                listOfNumbers.add(scan.nextFloat());
            }
            else{
                scan.next();
            }
        }

        return listOfNumbers;
    }

    public static float lowestNumber(List<Float> listOfNumbers){
        float lowestNumber = listOfNumbers.get(0);
        for(int i=1 ; i<listOfNumbers.size() ; i++){
            if(lowestNumber > listOfNumbers.get(i)){
                lowestNumber = listOfNumbers.get(i);
            }
        }

        return lowestNumber;
    }

    public static float higherNumber(List<Float> listOfNumbers){
        float higherNumber = listOfNumbers.get(0);
        for(int i=1 ; i<listOfNumbers.size() ; i++){
            if(higherNumber < listOfNumbers.get(i)){
                higherNumber = listOfNumbers.get(i);
            }
        }

        return higherNumber;
    }

    public static float totalNumber(List<Float> listOfNumbers){
        float total = 0;
        for(int i=0 ; i<listOfNumbers.size() ; i++){
            total += listOfNumbers.get(i);
        }

        return total;
    }

    public static float average(List<Float> listOfNumbers){
        float average = 0;
        average = ( totalNumber(listOfNumbers) / listOfNumbers.size() );
        return average;
    }

}
