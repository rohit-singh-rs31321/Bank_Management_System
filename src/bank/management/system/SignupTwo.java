package bank.management.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{


    JTextField panTextField, aadharTextField,  nameTextField , fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JComboBox religion,  category, income, education, occupation;
    String formno;

    JRadioButton sYes, sNo, eYes, eNo  ;
    SignupTwo( String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FROM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(250, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 24));
        name.setBounds(120, 140, 150, 40);
        add(name);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christan", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(400, 145, 350, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway", Font.BOLD, 24));
        fname.setBounds(120, 190, 250, 40);
        add(fname);

        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(400, 195, 350, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incomeLabel = new JLabel("Income :");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 24));
        incomeLabel.setBounds(120, 240, 200, 40);
        add(incomeLabel);


        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(400, 245, 350, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Arial", Font.BOLD, 24));
        educational.setBounds(120, 290, 200, 40);
        add(educational);

        JLabel Qualification = new JLabel("Qualification :");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 24));
        Qualification.setBounds(120, 315, 200, 40);
        add(Qualification);

        String valEducational[] = {"Non-Graduate", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(valEducational);
        education.setBounds(400, 320, 350, 30);
        education.setBackground(Color.WHITE);
        add(education);



        JLabel occupationLabel = new JLabel("Occupation :");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 24));
        occupationLabel.setBounds(120, 390, 200, 40);
        add(occupationLabel);

        String valOccupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(400, 395, 350, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        JLabel panNumber = new JLabel("PAN Number");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 24));
        panNumber.setBounds(120, 440, 200, 40);
        add(panNumber);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        panTextField.setBounds(400,440, 350, 30);
        add(panTextField);

        JLabel aadharLabel = new JLabel("Aadhar Number :");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 24));
        aadharLabel.setBounds(120, 490, 250, 40);
        add(aadharLabel);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.PLAIN, 22));
        aadharTextField.setBounds(400,490, 350, 30);
        add(aadharTextField);

        JLabel state = new JLabel("Senior Citizen :");
        state.setFont(new Font("Raleway", Font.BOLD, 24));
        state.setBounds(120, 540, 200, 40);
        add(state);

        sYes = new JRadioButton("Yes");
        sYes.setBounds(400, 545, 100, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);
        sNo = new JRadioButton("No");
        sNo.setBounds(520, 545, 100, 30);
        sNo.setBackground(Color.WHITE);
        add(sNo);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(sYes);
        seniorGroup.add(sNo);


        JLabel existingLabel = new JLabel("Exisiting Account :");
        existingLabel.setFont(new Font("Raleway", Font.BOLD, 24));
        existingLabel.setBounds(120, 590, 250, 40);
        add(existingLabel);

        eYes = new JRadioButton("Yes");
        eYes.setBounds(400, 595, 100, 30);
        eYes.setBackground(Color.WHITE);
        add(eYes);
        eNo = new JRadioButton("No");
        eNo.setBounds(520, 595, 100, 30);
        eNo.setBackground(Color.WHITE);
        add(eNo);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eYes);
        existingGroup.add(eNo);




        JButton next = new JButton("Next");
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBounds(670,660, 80, 30);
        next.addActionListener(this);
        add(next);





        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();

        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String seniorcitizen = null;
        if(sYes.isSelected()){
            seniorcitizen ="Yes";
        } else if (sNo.isSelected()) {
            seniorcitizen="No";
        }
        String existingaccount = null;
        if (eYes.isSelected()){
            existingaccount= "Yes";
        } else if (eNo.isSelected()) {
            existingaccount="No";
        }


        try{
            if(pan.equals("")){
                JOptionPane.showMessageDialog(null, "Pan numberf is Required.");
            } else if (aadhar.equals("")) {
                JOptionPane.showMessageDialog(null, "Aadhar is Required.");
            } else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
            }
        } catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {

        new SignupTwo("");
    }
}
