import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("PROGRAMMING EXERCISES 3");
        sortedName();
        bankCharges();

    }


    private static void sortedName(){

        String name1, name2, name3;
        String finalString = "";
        name1 = JOptionPane.showInputDialog("Enter the first name :");
        name2 = JOptionPane.showInputDialog("Enter the second name :");
        name3 = JOptionPane.showInputDialog("Enter the third name :");

        if(name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0){
            finalString += name1 + "\n";
            if(name2.compareToIgnoreCase(name3) <= 0){
                finalString += name2 + "\n";
                finalString += name3 + "\n";
            }
            else{
                finalString += name3 + "\n";
                finalString += name2 + "\n";
            }
        }
        else if(name2.compareToIgnoreCase(name1) <= 0 && name2.compareToIgnoreCase(name3) <= 0){
            finalString += name2 + "\n";
            if(name1.compareToIgnoreCase(name3) <= 0){
                finalString += name1 + "\n";
                finalString += name3 + "\n";
            }
            else{
                finalString += name3 + "\n";
                finalString += name1 + "\n";
            }
        }
        else{
            finalString += name3 + "\n";
            if(name2.compareToIgnoreCase(name1) <= 0){
                finalString += name2 + "\n";
                finalString += name1 + "\n";
            }
            else {
                finalString += name1 + "\n";
                finalString += name2 + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, finalString);
    }

    private static void bankCharges(){
        double totalFee = 10.0;
        int numberOfCheck = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of checks written this month :"));

        if(numberOfCheck >= 0 && numberOfCheck < 20){
            totalFee += (0.10*numberOfCheck);
        }
        else if(numberOfCheck >= 20 && numberOfCheck < 40){
            totalFee += (0.08*numberOfCheck);
        }
        else if(numberOfCheck >= 40 && numberOfCheck < 60){
            totalFee += (0.06*numberOfCheck);
        }
        else if(numberOfCheck >= 60){
            totalFee += (0.04*numberOfCheck);
        }
        else{
            System.out.println("Problem");
        }

        System.out.println("Bank service : $" + totalFee);
    }

}
