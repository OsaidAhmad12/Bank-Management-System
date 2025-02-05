package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
public class Signup extends JFrame implements ActionListener
{
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textName,textFname,textemail,textmarried,textaddress,textcity,textpincode,textstate;
    JDateChooser jDateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);
    Signup()
    {
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name: ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);


        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        JLabel labelfName=new JLabel("Father's Name: ");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);


        textFname=new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);



        JLabel DOB=new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);


        jDateChooser=new JDateChooser();
        jDateChooser.setForeground(new Color(105,105,105));
        jDateChooser.setBounds(300,340,400,30);
        add(jDateChooser);

        JLabel label6=new JLabel("Gender: ");
        label6.setFont(new Font("Raleway",Font.BOLD,20));
        label6.setBounds(100,290,200,30);
        add(label6);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);


        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labele=new JLabel("Email Address: ");
        labele.setFont(new Font("Raleway",Font.BOLD,20));
        labele.setBounds(100,390,200,30);
        add(labele);

        textemail=new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,14));
        textemail.setBounds(300,390,400,30);
        add(textemail);


        JLabel married_status=new JLabel("Marital Status: ");
        married_status.setFont(new Font("Raleway",Font.BOLD,20));
        married_status.setBounds(100,440,200,30);
        add(married_status);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2=new JRadioButton("Non married");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,120,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,90,30);
        add(m3);



        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel address=new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,490,200,30);
        add(address);

        textaddress=new JTextField();
        textaddress.setFont(new Font("Raleway",Font.BOLD,14));
        textaddress.setBounds(300,490,400,30);
        add(textaddress);

        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        textcity=new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);


        JLabel pincode=new JLabel("Pincode: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        textpincode=new JTextField();
        textpincode.setFont(new Font("Raleway",Font.BOLD,14));
        textpincode.setBounds(300,590,400,30);
        add(textpincode);

        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,640,200,30);
        add(state);

        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String formno=first;
        String name=textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField)jDateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected())
            gender="Male";
        else if(r2.isSelected())
            gender="Female";
        else
            gender="Others";
        String email=textemail.getText();
        String marital=null;
        if(m1.isSelected())
            marital="married";
        else if(m2.isSelected())
            marital="Unmarried";
        else
            marital="Others";
        String address=textaddress.getText();
        String city=textcity.getText();
        String pincode=textpincode.getText();
        String state=textstate.getText();

        try
        {
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }
            else
            {
                Con con1=new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        new Signup();
    }

}
