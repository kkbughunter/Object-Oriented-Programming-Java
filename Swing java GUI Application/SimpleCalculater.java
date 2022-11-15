import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;


class Calculater extends JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    Calculater(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("Simple Calculater"); 
        l1.setFont(new Font("Time New Roman", Font.BOLD, 30));
        l1.setForeground(Color.BLUE);
        l1.setBounds(60,10,500,30);
        add(l1);

        t1 = new JTextField(60);
        t2 = new JTextField(60);
        
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mul");
        b4 = new JButton("Div");


        t1.setBounds(100,60,120,30);
        // l2.setFont(new Font("Time New Roman", Font.ITALIC, 20));
        t2.setBounds(100,100,120,30);

        b1.setBounds(100,140,60,30);
        b2.setBounds(160,140,60,30);
        b3.setBounds(100,180,60,30);
        b4.setBounds(160,180,60,30);


        l2 = new JLabel("Result :  -");
        l2.setBounds(250,80,500,30);
        l2.setFont(new Font("Time New Roman", Font.ITALIC, 20));
        add(l2);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        add(t2);


        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Result : " + (no1+no2));
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Result : " + (no1-no2));
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Result : " + (no1*no2));
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Result : " + (no1/no2));
            }
        });


    }
}

class SimpleCalculater {
    public static void main(String[] args) {
        Calculater c = new Calculater();
        c.setBounds(400,200,600,300);
        c.setVisible(true);

    }
}






