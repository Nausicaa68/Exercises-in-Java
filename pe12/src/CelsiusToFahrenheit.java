import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CelsiusToFahrenheit {

    JFrame frame = new JFrame("CelsiusToFahrenheit");
    static final int WIDTH = 500;
    static final int HEIGHT = 500;

    JPanel panel = new JPanel();

    JLabel text1 = new JLabel("Celsius : ");
    JTextField tf1 = new JTextField(10);

    JButton calculateButton = new JButton("Calculate");
    JLabel text2 = new JLabel();

    public CelsiusToFahrenheit(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(300,200);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        panel.setLayout(null);

        text1.setBounds(10,20,80,25);
        panel.add(text1);
        tf1.setBounds(100,20,165,25);
        panel.add(tf1);

        calculateButton.setBounds(30, 80, 100, 25);
        panel.add(calculateButton);
        calculateButton.addActionListener(this::display);

        text2.setBounds(30, 110, 200, 25);
        panel.add(text2);

        frame.add(panel);

    }

    private void display(ActionEvent actionEvent) {
        double celsius = Double.parseDouble(tf1.getText());
        double fahrenheit = ((9.0/5.0)*celsius + 32.0);
        text2.setText("In Fahrenheit : " + fahrenheit + " °F");
    }
}
