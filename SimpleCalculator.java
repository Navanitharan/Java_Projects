import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

  private JTextField display;
  private JButton[] numberButtons = new JButton[10];
  private JButton[] operatorButtons = new JButton[4];
  private JButton clearButton, equalsButton;

  private double number1, number2;
  private int operator;

  public SimpleCalculator() {
    setTitle("Simple Calculator");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    display = new JTextField();
    display.setEditable(false);
    getContentPane().add(display, BorderLayout.NORTH);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 3));
    for (int i = 0; i < 10; i++) {
      numberButtons[i] = new JButton(String.valueOf(i));
      numberButtons[i].addActionListener(this);
      buttonPanel.add(numberButtons[i]);
    }

    operatorButtons[0] = new JButton("+");
    operatorButtons[1] = new JButton("-");
    operatorButtons[2] = new JButton("*");
    operatorButtons[3] = new JButton("/");
    for (int i = 0; i < 4; i++) {
      operatorButtons[i].addActionListener(this);
      buttonPanel.add(operatorButtons[i]);
    }

    clearButton = new JButton("Clear");
    clearButton.addActionListener(this);
    buttonPanel.add(clearButton);
    equalsButton = new JButton("=");
    equalsButton.addActionListener(this);
    buttonPanel.add(equalsButton);

    getContentPane().add(buttonPanel, BorderLayout.CENTER);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source instanceof JButton) {
      JButton button = (JButton) source;
      String text = button.getText();
      if (text.matches("[0-9]")) {
        display.setText(display.getText() + text);
      } else if (text.equals("+")) {
        number1 = Double.parseDouble(display.getText());
        display.setText("");
        operator = 1;
      } else if (text.equals("-")) {
        number1 = Double.parseDouble(display.getText());
        display.setText("");
        operator = 2;
      } else if (text.equals("*")) {
        number1 = Double.parseDouble(display.getText());
        display.setText("");
        operator = 3;
      } else if (text.equals("/")) {
        number1 = Double.parseDouble(display.getText());
        display.setText("");
        operator = 4;
      } else if (text.equals("Clear")) {
        display.setText("");
      } else if (text.equals("=")) {
        number2 = Double.parseDouble(display.getText());
        double result = 0;
        switch (operator) {
          case 1:
            result = number1 + number2;
            break;
          case 2:
            result = number1 - number2;
            break;
          case 3:
            result = number1 * number2;
            break;
          case 4:
            result = number1 / number2;
            break;
        }
        display.setText(String.valueOf(result));
      }
    }
  }

  public static void main(String[] args) {
    new SimpleCalculator();
  }
}
