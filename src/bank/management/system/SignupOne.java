package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JDateChooser dateChooser;

    JRadioButton male, female, single, married, others;
    SignupOne(){
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong()% 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(250, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("NAME :");
        name.setFont(new Font("Raleway", Font.BOLD, 24));
        name.setBounds(120, 140, 100, 40);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        nameTextField.setBounds(400,140, 350, 30);
        add(nameTextField);

        JLabel fname = new JLabel("FATHER'S NAME :");
        fname.setFont(new Font("Raleway", Font.BOLD, 24));
        fname.setBounds(120, 190, 250, 40);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        fnameTextField.setBounds(400, 190, 350, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway", Font.BOLD, 24));
        dob.setBounds(120, 240, 200, 40);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(Color.BLACK);
        dateChooser.setBounds(400, 240, 350, 30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Arial", Font.BOLD, 24));
        gender.setBounds(120, 290, 200, 40);
        add(gender);

        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(400, 290, 100, 40);
        add(male);

        female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(520, 290, 100, 40);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Raleway", Font.BOLD, 24));
        email.setBounds(120, 340, 200, 40);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        emailTextField.setBounds(400,340, 350, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway", Font.BOLD, 24));
        marital.setBounds(120, 390, 200, 40);
        add(marital);

        single = new JRadioButton("Single");
        single.setBackground(Color.WHITE);
        single.setBounds(400, 390, 100, 40);
        add(single);

        married = new JRadioButton("Married");
        married.setBackground(Color.WHITE);
        married.setBounds(520, 390, 100, 40);
        add(married);

        others = new JRadioButton("Others");
        others.setBackground(Color.WHITE);
        others.setBounds(640, 390, 100, 40);
        add(others);


        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(single);
        maritalGroup.add(married);
        maritalGroup.add(others);

        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 24));
        address.setBounds(120, 440, 200, 40);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        addressTextField.setBounds(400,440, 350, 30);
        add(addressTextField);

        JLabel city = new JLabel("city :");
        city.setFont(new Font("Raleway", Font.BOLD, 24));
        city.setBounds(120, 490, 200, 40);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        cityTextField.setBounds(400,490, 350, 30);
        add(cityTextField);

        JLabel state = new JLabel("state :");
        state.setFont(new Font("Raleway", Font.BOLD, 24));
        state.setBounds(120, 540, 200, 40);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        stateTextField.setBounds(400,540, 350, 30);
        add(stateTextField);


        JLabel pincode = new JLabel("Pincode :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 24));
        pincode.setBounds(120, 590, 200, 40);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        pinTextField.setBounds(400,590, 350, 30);
        add(pinTextField);

        JButton next = new JButton("Next");
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBounds(670,660, 80, 30);
        next.addActionListener(this);
        add(next);





        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender ="Male";
        } else if (female.isSelected()) {
            gender="Female";
        }
        String email= emailTextField.getText();
        String maritalStatus = null;
        if (single.isSelected()){
            maritalStatus= "Single";
        } else if (married.isSelected()) {
            maritalStatus="Married";
        } else if (others.isSelected()) {
            maritalStatus= "Others";
        }
        String address =addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required.");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalStatus+"','"+address+"','"+city+"','"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
            }
        } catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
