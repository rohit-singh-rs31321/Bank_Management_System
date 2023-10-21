package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton login, signup , clear;

    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("Automated Teller Machine");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10,100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(200,150,150, 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        cardTextField.setBounds(350,150,250, 40);
        add(cardTextField);


        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(200,210,150, 40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        pinTextField.setBounds(350,210,250, 40);
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(350,300,120,35);
//        login.setBackground(Color.BLACK);
//        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(480,300,120,35);
//        clear.setBackground(Color.BLACK);
//        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(350,350,250,35);
//        signup.setBackground(Color.BLACK);
//        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);






        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == login){

        }
        if (ae.getSource() == clear){
             cardTextField.setText("  ");
             pinTextField.setText("");
        }
        if (ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
