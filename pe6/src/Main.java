import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]){

        double radius;
        do {
            radius = Double.parseDouble(JOptionPane.showInputDialog("Enter a radius : "));
        }while(radius <= 0.0);

        Circle aCircle = new Circle(radius);
        System.out.println("For a circle with a radius of " + aCircle.getRadius() + "\n"
                + "Area = " + aCircle.getArea() + "\n"
                + "Diameter = " + aCircle.getDiameter() + "\n"
                + "Circumference = " + aCircle.getCircumference() + "\n"
        );

        double score1, score2, score3;
        do {
            score1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number : "));
        }while(score1 <= 0.0);
        do {
            score2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number : "));
        }while(score2 <= 0.0);
        do {
            score3 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number : "));
        }while(score3 <= 0.0);

        testScore aTestScore = new testScore(score1, score2, score3);

        System.out.println("The average is : " + aTestScore.average());



    }
}
