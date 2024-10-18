/*
Multiplicacion mediante sumas 
 */
package Primera;

import java.awt.event.*;
import javax.swing.*;

public class Gui implements ActionListener {

    public static void main(String srg[]) {
        Gui gui = new Gui();

        JFrame j = new JFrame();
        JLabel label1 = new JLabel("Interfaz 1");
        JLabel label2 = new JLabel("Interfaz 2");
        JButton a = new JButton("Cerrar");

        label1.setBounds(10, 20, 300, 30);
        label2.setBounds(10, 100, 300, 30);

        a.setBounds(300, 250, 100, 30);
        a.addActionListener(gui);
        j.add(a);
        j.add(label1);
        j.add(label2);
        j.setBounds(0, 0, 500, 700);
        j.setLayout(null);
        j.setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        System.out.println("Press button");
    }

}

class NewGUI extends JFrame implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("Press button");
    }

    public NewGUI() {
        JButton a = new JButton("Cerrar");
        setBounds(0, 0, 500, 500);
        setLayout(null);
        a.setBounds(300, 250, 100, 30);
        add(a);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
