import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Calculator {

    private Font font = new Font("Verdana", Font.BOLD, 20);
    private JFrame f = new JFrame("Calculator");
    private JPanel p = new JPanel(new GridBagLayout());
    private JTextArea textScreen = new JTextArea();
    private JButton number1 = new JButton("1");
    private JButton number2 = new JButton("2");
    private JButton number3 = new JButton("3");
    private JButton number4 = new JButton("4");
    private JButton number5 = new JButton("5");
    private JButton number6 = new JButton("6");
    private JButton number7 = new JButton("7");
    private JButton number8 = new JButton("8");
    private JButton number9 = new JButton("9");
    private JButton number0 = new JButton("0");
    private JButton multiply = new JButton("×");
    private JButton divide = new JButton("÷");
    private JButton add = new JButton("+");
    private JButton subtract = new JButton("-");
    private JButton sign = new JButton("+/-");
    private JButton C = new JButton("C");
    private JButton dot = new JButton(".");
    private JButton equals = new JButton("=");
    private GridBagConstraints c = new GridBagConstraints();
    private Dimension d = new Dimension(75, 50);

    String operator = "";
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public Calculator() {

        textScreen.setFont(font);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(300,350);

        textScreen.setSize(290,55);
        textScreen.setLocation(7, 5);
        textScreen.setEditable(false);
        number1.setPreferredSize(d);
        number2.setPreferredSize(d);
        number3.setPreferredSize(d);
        number4.setPreferredSize(d);
        number5.setPreferredSize(d);
        number6.setPreferredSize(d);
        number7.setPreferredSize(d);
        number8.setPreferredSize(d);
        number9.setPreferredSize(d);
        number0.setPreferredSize(d);
        C.setPreferredSize(d);
        sign.setPreferredSize(d);
        dot.setPreferredSize(d);
        equals.setPreferredSize(d);
        divide.setPreferredSize(d);
        multiply.setPreferredSize(d);
        subtract.setPreferredSize(d);
        add.setPreferredSize(d);

        c.gridx = 0;
        c.gridy = 0;
        p.add(C, c);
        c.gridx = 1;
        p.add(sign, c);
        c.gridx = 2;
        p.add(divide, c);
        c.gridx = 3;
        p.add(multiply, c);
        c.gridy = 1;
        c.gridx = 0;
        p.add(number7, c);
        c.gridx = 1;
        p.add(number8, c);
        c.gridx = 2;
        p.add(number9, c);
        c.gridx = 3;
        p.add(subtract, c);
        c.gridy = 2;
        c.gridx = 0;
        p.add(number4, c);
        c.gridx = 1;
        p.add(number5, c);
        c.gridx = 2;
        p.add(number6, c);
        c.gridx = 3;
        p.add(add, c);
        c.gridy = 3;
        c.gridx = 0;
        p.add(number1, c);
        c.gridx = 1;
        p.add(number2, c);
        c.gridx = 2;
        p.add(number3, c);
        c.gridx = 3;
        c.gridy = 4;
        c.gridx = 0;
        p.add(number0, c);
        c.gridx = 1;
        c.gridx = 2;
        p.add(dot, c);
        c.gridx = 3;
        p.add(equals, c);

        number1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("1");
                numbers.add(1);
            }
        });
        number2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("2");
                numbers.add(2);
            }
        });
        number3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("3");
                numbers.add(3);
            }
        });
        number4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("4");
                numbers.add(4);
            }
        });
        number5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("5");
                numbers.add(5);
            }
        });
        number6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("6");
                numbers.add(6);
            }
        });
        number7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("7");
                numbers.add(7);
            }
        });
        number8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("8");
                numbers.add(8);
            }
        });
        number9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("9");
                numbers.add(9);
            }
        });
        number0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("0");
                numbers.add(0);
            }
        });
        multiply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("×");
                operator = "*";
            }
        });
        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("÷");
                operator = "/";
            }
        });
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("+");
                operator = "+";
            }
        });
        subtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append("-");
                operator = "-";
            }
        });
        C.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.setText("");
                numbers.remove(0);
                numbers.remove(1);
                operator = "";
            }
        });
        dot.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                textScreen.append(".");
            }
        });
        equals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                if (operator.equals("+")) {
                    int result = (numbers.get(0) + numbers.get(1));
                    textScreen.setText(Integer.toString(numbers.get(0) + numbers.get(1)));
                    numbers.set(0, result);
                    numbers.remove(1);
                }
                else if (operator.equals("-")) {
                    int result = (numbers.get(0) - numbers.get(1));
                    textScreen.setText(Integer.toString(numbers.get(0) - numbers.get(1)));
                    numbers.set(0, result);
                    numbers.remove(1);
                }
                else if (operator.equals("*")) {
                    int result = (numbers.get(0) * numbers.get(1));
                    textScreen.setText(Integer.toString(numbers.get(0) * numbers.get(1)));
                    numbers.set(0, result);
                    numbers.remove(1);
                }
                else if (operator.equals("/")) {
                    double result = numbers.get(0)/numbers.get(1);
                    textScreen.setText(Double.toString(numbers.get(0)/numbers.get(1)));
                    numbers.set(0, (int)result);
                    numbers.remove(1);
                }
            }
        });


        f.add(textScreen);
        f.add(p);
        f.add(p, BorderLayout.SOUTH);

    }

}