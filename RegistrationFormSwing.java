import javax.swing.*;
import java.awt.event.*;

public class RegistrationFormSwing extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JLabel l1, l2, dob, l3, l4, l5, l6;
    JTextField FName, LName, DOB, Place, ConNumber;
    JRadioButton male, female;
    JButton Submit;

    RegistrationFormSwing() {
        setLayout(null);
        setBounds(100, 100, 568, 476);
        l1 = new JLabel("Enter your FirstName:");
        l1.setBounds(20, 22, 113, 34);
        add(l1);

        FName = new JTextField();
        FName.setBounds(135, 30, 217, 34);
        add(FName);

        l2 = new JLabel("Enter your LastName:");
        l2.setBounds(20, 56, 113, 34);
        add(l2);

        LName = new JTextField();
        LName.setBounds(135, 64, 217, 34);
        add(LName);

        dob = new JLabel("Enter Date Of Birth");
        dob.setBounds(20, 90, 113, 34);
        add(dob);

        DOB = new JTextField();
        DOB.setBounds(135, 98, 217, 34);
        add(DOB);

        l3 = new JLabel("Place");
        l3.setBounds(20, 124, 113, 34);
        add(l3);

        Place = new JTextField();
        Place.setBounds(135, 132, 217, 34);
        add(Place);

        l4 = new JLabel("Contact Number");
        l4.setBounds(20, 158, 113, 34);
        add(l4);

        ConNumber = new JTextField();
        ConNumber.setBounds(135, 166, 217, 34);
        add(ConNumber);

        l5 = new JLabel("Gender");
        l5.setBounds(20,192 ,113 ,34);
        add(l5);

        male = new JRadioButton("Male", true);
        male.setBounds(135 ,200 ,70 ,30);
        
        female = new JRadioButton("Female", false);
        female.setBounds(205 ,200 ,80 ,30);
        
        ButtonGroup bg=new ButtonGroup();
        
        bg.add(male);bg.add(female);
        
        add(male);add(female);

        
        

        
        

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        

        
        


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        


        
        
        
        




        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




        
        
        




Submit = new JButton("Submit");
Submit.setBounds(50 ,250 ,100 ,30);
Submit.addActionListener(this);
add(Submit);
}

public void actionPerformed(ActionEvent ae) {
if (ae.getActionCommand().equals("Submit")) {
JOptionPane.showMessageDialog(this,"Thankyou for Registering","Submit",JOptionPane.INFORMATION_MESSAGE);
//System.exit(0);
}
}

public static void main(String args[]) {
RegistrationFormSwing obj = new RegistrationFormSwing();
obj.setTitle("RegistrationForm");
obj.setSize(600 ,400);
obj.setResizable(true);
obj.setVisible(true);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
