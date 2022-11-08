package modul8;

import java.awt.*;
import javafx.scene.layout.Border;
import javax.swing.*;

public class pendahuluan3 extends JFrame {

    public static void main(String[] args) {
        JFrame form = new JFrame("Design");
        form.setSize(200, 300);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setLayout(null);
        form.setLocationRelativeTo(null);

        //javax.swing.border.Border bk= BorderFactory.createLineBorder(Color.blue);
        JLabel teks1 = new JLabel("Masukkan Angka Pertama:");
        teks1.setBounds(20, 10, 200, 15);
        form.add(teks1);

        JTextField input1 = new JTextField();
        input1.setBounds(20, 30, 130, 15);
        form.add(input1);

        JLabel teks2 = new JLabel("Masukkan Angka Kedua:");
        teks2.setBounds(20, 50, 200, 15);
        form.add(teks2);

        JTextField input2 = new JTextField();
        input2.setBounds(20, 70, 130, 15);
        form.add(input2);

        JLabel teks3 = new JLabel("Masukkan Angka Ketiga:");
        teks3.setBounds(20, 90, 200, 15);
        form.add(teks3);

        JTextField input3 = new JTextField();
        input3.setBounds(20, 110, 130, 15);
        form.add(input3);

        JButton btn1 = new JButton("+");
        btn1.setBounds(15, 130, 50, 25);
        btn1.setBackground(Color.lightGray);
        form.add(btn1);

        JButton btn2 = new JButton("-");
        btn2.setBounds(70, 130, 50, 25);
        btn2.setBackground(Color.lightGray);
        form.add(btn2);

        JButton btn3 = new JButton("*");
        btn3.setBounds(125, 130, 50, 25);
        btn3.setBackground(Color.lightGray);
        form.add(btn3);

        JButton btn4 = new JButton("/");
        btn4.setBounds(70, 160, 50, 25);
        btn4.setBackground(Color.lightGray);
        form.add(btn4);

    }
}
