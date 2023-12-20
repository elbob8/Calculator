
package calculator;

import Tools.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import static javax.swing.WindowConstants.*;

/**
 *
 * @author Elbob
 */
public class Calculator extends JFrame implements ActionListener{
    
    JPanel home = new JPanel();
    JTextField txt;
    JButton button[] = new JButton[10];
    JButton button_opertion[] = new JButton[5];
    JButton Clear,Result, full_stop;
    char c_ope;
    double result,Num1,Num2;
    
    
    public String Add_Num(String num){
        String add = txt.getText() + num;
        return add;
    }

    public void opertion(char c_ope){
        this.c_ope = c_ope;
        Num1 = Double.parseDouble(txt.getText());
        txt.setText("");
    }
    public Calculator(){
            setTitle("Calculator");
            try {
            setIconImage(ImageIO.read(this.getClass().getResource("/Tools/images/cool.png")));
            } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, "icon app not found");
            }
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setSize(280, 370);
            setLayout(null);
            setLocationRelativeTo(null);
            setVisible(true);
            
            
            home = new JPanel();
            home.setSize(getWidth(), getHeight());
            home.setLayout(null);
            home.setBackground(Color.decode("#000000"));
            add(home);
            
            txt = new MyTextFiled(50);
            txt.setBounds(15, 10, 180, 50);
            txt.setToolTipText("Writing");
            home.add(txt,BorderLayout.CENTER);
            
            Clear = new MyButton("C");
            Clear.setBounds(200, 10, 50, 50);
            Clear.setToolTipText("Clear All");
            Clear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
            }
            });
            home.add(Clear,BorderLayout.CENTER);
            
            
            
            button_opertion[0] = new MyButton("+");
            button_opertion[0].setBounds(200, 80, 50, 50);
            button_opertion[0].setToolTipText("Add");
            button_opertion[0].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opertion('+');
            }
            });
            home.add(button_opertion[0],BorderLayout.CENTER);
            
            button_opertion[1] = new MyButton("-");
            button_opertion[1].setBounds(200, 140, 50, 50);
            button_opertion[1].setToolTipText("Sub");
            button_opertion[1].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opertion('-');
            }
            });
            home.add(button_opertion[1],BorderLayout.CENTER);
            
            button_opertion[2] = new MyButton("X");
            button_opertion[2].setBounds(200, 200, 50, 50);
            button_opertion[2].setToolTipText("Mul");
            button_opertion[2].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opertion('*');
            }
            });
            home.add(button_opertion[2],BorderLayout.CENTER);
            
            button_opertion[3] = new MyButton("/");
            button_opertion[3].setBounds(200, 260, 50, 50);
            button_opertion[3].setToolTipText("Div");
            button_opertion[3].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opertion('/');
            }
            });
            home.add(button_opertion[3],BorderLayout.CENTER);
            
            button[0] = new MyButton("1");
            button[0].setBounds(15, 80, 50, 50);
            button[0].setToolTipText("Put (1)");
            button[0].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("1"));
            }
            });
            home.add(button[0],BorderLayout.CENTER);
            
            button[1] = new MyButton("2");
            button[1].setBounds(70, 80, 50, 50);
            button[1].setToolTipText("Put (2)");
            button[1].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("2"));
            }
            });
            home.add(button[1],BorderLayout.CENTER);
            
            button[2] = new MyButton("3");
            button[2].setBounds(125, 80, 50, 50);
            button[2].setToolTipText("Put (3)");
            button[2].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("3"));
            }
            });
            home.add(button[2],BorderLayout.CENTER);
            
            button[3] = new MyButton("4");
            button[3].setBounds(15, 140, 50, 50);
            button[3].setToolTipText("Put (4)");
            button[3].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("4"));
            }
            });
            home.add(button[3],BorderLayout.CENTER);
            
            button[4] = new MyButton("5");
            button[4].setBounds(70, 140, 50, 50);
            button[4].setToolTipText("Put (5)");
            button[4].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("5"));
            }
            });
            home.add(button[4],BorderLayout.CENTER);
            
            button[5] = new MyButton("6");
            button[5].setBounds(125, 140, 50, 50);
            button[5].setToolTipText("Put (6)");
            button[5].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("6"));
            }
            });
            home.add(button[5],BorderLayout.CENTER);
            
            button[6] = new MyButton("7");
            button[6].setBounds(15, 200, 50, 50);
            button[6].setToolTipText("Put (7)");
            button[6].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("7"));
            }
            });
            home.add(button[6],BorderLayout.CENTER);
            
            button[7] = new MyButton("8");
            button[7].setBounds(70, 200, 50, 50);
            button[7].setToolTipText("Put (8)");
            button[7].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("8"));
            }
            });
            home.add(button[7],BorderLayout.CENTER);
            
            button[8] = new MyButton("9");
            button[8].setBounds(125, 200, 50, 50);
            button[8].setToolTipText("Put (9)");
            button[8].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("9"));
            }
            });
            home.add(button[8],BorderLayout.CENTER);
            
            button[9] = new MyButton("0");
            button[9].setBounds(70, 260, 50, 50);
            button[9].setToolTipText("Put (0)");
            button[9].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("0"));
            }
            });
            home.add(button[9],BorderLayout.CENTER);
            
            Result = new MyButton("=");
            Result.setBounds(125, 260, 50, 50);
            Result.setToolTipText("Result");
            Result.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Num2 = Double.parseDouble(txt.getText());
            switch(c_ope){
            case '+':
                result = Num1 + Num2;
            break;
            case '-':
                result = Num1 - Num2;
            break;
            case '*':
                result = Num1 * Num2;
            break;
            case '/':
                result = Num1 / Num2;
            break;
            }
            if (result % 1 == 0) {
            // الناتج عدد صحيح
            txt.setText(String.valueOf((int)result));
            } else {
            // الناتج عدد عشري
            txt.setText(String.format("%.0f", result));
            }
            
            }
            });
            home.add(Result,BorderLayout.CENTER);
            
             full_stop = new MyButton(".");
             full_stop.setBounds(15, 260, 50, 50);
             full_stop.setToolTipText("Put(.)");
             full_stop.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(Add_Num("."));
            }
            });
            home.add( full_stop,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
