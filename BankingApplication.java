import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankingApplication extends JFrame implements ActionListener {

  private JFrame loginFrame, homeFrame;
  private JTextField usernameField, passwordField;
  private JButton loginButton, createAccountButton, openNewAccountButton, showBalanceButton, closeButton;
  private JLabel messageLabel;

  public BankingApplication() {
    loginFrame = new JFrame("Login");
    loginFrame.setSize(300, 200);
    loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    usernameField = new JTextField();
    passwordField = new JTextField();
    loginButton = new JButton("Login");
    createAccountButton = new JButton("Create Account");

    messageLabel = new JLabel("");

    JPanel loginPanel = new JPanel();
    loginPanel.setLayout(new GridLayout(3, 2));
    loginPanel.add(new JLabel("Username:"));
    loginPanel.add(usernameField);
    loginPanel.add(new JLabel("Password:"));
    loginPanel.add(passwordField);
    loginPanel.add(loginButton);
    loginPanel.add(createAccountButton);

    loginFrame.add(loginPanel);
    loginFrame.setVisible(true);

    homeFrame = new JFrame("Home");
    homeFrame.setSize(300, 200);
    homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    openNewAccountButton = new JButton("Open New Account");
    showBalanceButton = new JButton("Show Balance");
    closeButton = new JButton("Close");

    JPanel homePanel = new JPanel();
    homePanel.setLayout(new GridLayout(3, 1));
    homePanel.add(openNewAccountButton);
    homePanel.add(showBalanceButton);
    homePanel.add(closeButton);

    homeFrame.add(homePanel);

    loginButton.addActionListener(this);
    createAccountButton.addActionListener(this);
    openNewAccountButton.addActionListener(this);
    showBalanceButton.addActionListener(this);
    closeButton.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == loginButton) {
      String username = usernameField.getText();
      String password = passwordField.getText();
      if (username.equals("navani") && password.equals("123")) {
        loginFrame.setVisible(false);
        homeFrame.setVisible(true);
      } else {
        messageLabel.setText("Invalid username or password");
      }
    } else if (source == createAccountButton) {
      // TODO: Implement create account functionality
    } else if (source == openNewAccountButton) {
      // TODO: Implement open new account functionality
    } else if (source == showBalanceButton) {
      // TODO: Implement show balance functionality
    } else if (source == closeButton) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    new BankingApplication();
  }
}