import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PriceCalculator {

    JFrame frame = new JFrame("Price Calculator");
    static final int WIDTH = 500;
    static final int HEIGHT = 500;

    JPanel panel = new JPanel();

    JLabel text1 = new JLabel("Wholesale : ");
    JTextField tf1 = new JTextField();

    JLabel text2 = new JLabel("Markup Percentage : ");
    JTextField tf2 = new JTextField();

    JButton calculateButton = new JButton("Calculate");

    JLabel text3 = new JLabel();

    public PriceCalculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(300,200);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        panel.setLayout(null);

        text1.setBounds(10,20,165,25);
        panel.add(text1);
        tf1.setBounds(140,20,165,25);
        panel.add(tf1);

        text2.setBounds(10,50,165,25);
        panel.add(text2);
        tf2.setBounds(140,50,165,25);
        panel.add(tf2);

        calculateButton.setBounds(30, 80, 100, 25);
        panel.add(calculateButton);
        calculateButton.addActionListener(this::display);

        text3.setBounds(30, 110, 200, 25);
        panel.add(text3);

        frame.add(panel);

    }

    private void display(ActionEvent actionEvent) {
        double wholesale = Double.parseDouble(tf1.getText());
        double markup = Double.parseDouble(tf2.getText());
        double retail = wholesale + (wholesale*(markup/100.0));

        text3.setText("The retail is " + retail + " $");
    }

}
