package Primera;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener {

    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, sum, result, res, div, mult, delete;
    //private JLabel screen;
    String operacion[] = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    String number = "";
    int index = 0;

    public Calculator() {
      //  screen = new JLabel("");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        sum = new JButton("+");
        res = new JButton("-");
        div = new JButton("/");
        mult = new JButton("*");
        result = new JButton("=");
        delete = new JButton("C");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        sum.addActionListener(this);
        res.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);

        result.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(div);
        add(b4);
        add(b5);
        add(b6);
        add(mult);
        add(b7);
        add(b8);
        add(b9);

        add(sum);
        add(delete);
        add(b0);

        add(result);
        add(res);
        setLayout(new GridLayout(4, 4));
        // setLayout(null);
    }

    public static void main(String srg[]) {
        Calculator gui = new Calculator();
        gui.setBounds(0, 0, 700, 400);
        gui.setLocationRelativeTo(null);

        gui.setVisible(true);
        gui.setResizable(false);
        System.out.println();
    }

    public void reset(String frist) {
        operacion[0] = frist;
        for (int x = 1; x < operacion.length; x++) {
            operacion[x] = "0";
        }
    }

    public void resultFuntion() {
        operacion[index] = number;
        index = 2;
        int resultado = 0;
        for (int x = 0; x < operacion.length; x += 2) {

            if (operacion[x + 1] == "0") {
                break;
            }
            switch (operacion[x + 1]) {
                case "+":
                    resultado = Integer.parseInt(operacion[x]) + Integer.parseInt(operacion[x + 2]);
                    operacion[x + 2] = Integer.toString(resultado);
                    break;
                case "-":
                    resultado = Integer.parseInt(operacion[x]) - Integer.parseInt(operacion[x + 2]);
                    operacion[x + 2] = Integer.toString(resultado);
                    break;
                case "*":
                    resultado = Integer.parseInt(operacion[x]) * Integer.parseInt(operacion[x + 2]);
                    operacion[x + 2] = Integer.toString(resultado);
                    break;
                case "/":
                    resultado = Integer.parseInt(operacion[x]) / Integer.parseInt(operacion[x + 2]);
                    operacion[x + 2] = Integer.toString(resultado);
                    break;
                default:
                    break;
            }
            operacion[x + 1] = "0";
            operacion[x] = "0";
        }
        operacion[0] = Integer.toString(resultado);
        operacion[1] = "+";
        System.out.println(resultado);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            number += "1";
        } else if (e.getSource() == b2) {
            number += "2";
        } else if (e.getSource() == b3) {
            number += "3";
        } else if (e.getSource() == b4) {
            number += "4";
        } else if (e.getSource() == b5) {
            number += "5";
        } else if (e.getSource() == b6) {
            number += "6";
        } else if (e.getSource() == b7) {
            number += "7";
        } else if (e.getSource() == b8) {
            number += "8";
        } else if (e.getSource() == b9) {
            number += "9";
        } else if (e.getSource() == b0) {
            number += "0";
        } else if (e.getSource() == sum) {
            operacion[index] = number;
            operacion[index + 1] = "+";
            index += 2;
            number = "";
        } else if (e.getSource() == res) {
            operacion[index] = number;
            operacion[index + 1] = "-";
            index += 2;
            number = "";
        } else if (e.getSource() == div) {
            operacion[index] = number;
            operacion[index + 1] = "/";
            index += 2;
            number = "";
        } else if (e.getSource() == mult) {
            operacion[index] = number;
            operacion[index + 1] = "*";
            index += 2;
            number = "";

        } else if (e.getSource() == delete) {
            reset("0");
        } else if (e.getSource() == result) {
            resultFuntion();
        }
    }
}
