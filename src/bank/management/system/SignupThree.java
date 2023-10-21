package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame {

    JRadioButton r1, r2, r3, r4;
    SignupThree(){
        setLayout(null);

        JLabel accountDetails = new JLabel("Page 3: Account Details");
        accountDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        accountDetails.setBounds(250, 80, 400, 30);
        add(accountDetails);

        JLabel type = new JLabel("Account Type :");
        type.setFont(new Font("Raleway", Font.BOLD, 24));
        type.setBounds(120, 140, 200, 40);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(Color.WHITE);
        r1.setBounds(140, 180, 200, 40);
        add(r1);
        r2 = new JRadioButton("Current Account");
        r2.setBackground(Color.WHITE);
        r2.setBounds(360, 180, 200, 40);
        add(r2);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        JLabel card = new JLabel("Card Number :");
        card.setFont(new Font("Raleway", Font.BOLD, 24));
        card.setBounds(120, 230, 200, 40);
        add(card);
        JLabel cardDetails = new JLabel("Your 16 Digit Card Number");
        cardDetails.setFont(new Font("Raleway", Font.BOLD, 10));
        cardDetails.setBounds(123, 250, 300, 40);
        add(cardDetails);
        JLabel number = new JLabel("XXXX-XXXX-XXXX-7624");
        number.setFont(new Font("Raleway", Font.BOLD, 24));
        number.setBounds(340, 230, 300, 40);
        add(number);


        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 24));
        pin.setBounds(120, 280, 200, 40);
        add(pin);
        JLabel pinDetails = new JLabel("Your 4 Digit Password");
        pinDetails.setFont(new Font("Raleway", Font.BOLD, 10));
        pinDetails.setBounds(123, 300, 300, 40);
        add(pinDetails);
        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Raleway", Font.BOLD, 24));
        pinNumber.setBounds(340, 280, 300, 40);
        add(pinNumber);



        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupThree();
    }
}
