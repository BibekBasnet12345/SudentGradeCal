package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
public class StudentMarks {
    private JTextField txtstdname;
    private JTextField txtmarks1;
    private JTextField txtmarks2;
    private JTextField txtmarks3;
    private JTextField txttotal;
    private JTextField txtaverage;
    private JTextField txtgrade;
    private JButton calculateButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentMarks");
        frame.setContentPane(new StudentMarks().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentMarks() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int m1,m2,m3,total;
             double avg;
             m1=Integer.parseInt(txtmarks1.getText());
             m2=Integer.parseInt(txtmarks2.getText());
             m3=Integer.parseInt(txtmarks3.getText());
             total=m1+m2+m3;
             txttotal.setText(String.valueOf(total));
             avg=total/3;
             txtaverage.setText(String.valueOf(avg));
             if (avg>90){
                 txtgrade.setText("A+");
             }else if (avg>80){
                 txtgrade.setText("A");
             }else if (avg>70){
                 txtgrade.setText("B+");
             }else if (avg>60){
                 txtgrade.setText("B");
             }else if (avg>50){
                 txtgrade.setText("C");
             }else if (avg>40){
                 txtgrade.setText("D");
             }else {
                 txtgrade.setText("Fail");
             }
            }
        });
    }
}
