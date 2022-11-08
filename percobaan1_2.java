package modul8;

import javax.swing.*;
import java.awt.*;

public class percobaan1_2 extends JFrame{
    Checkbox cb1 = new Checkbox("Pilih A");
    Checkbox cb2 = new Checkbox("Pilih B");
    Checkbox cb3 = new Checkbox("Pilih C");
    percobaan1_2(){
        setTitle("Program GUI Pertamaku");
        setLocation(200,100);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane() .setLayout(null);
        getContentPane() .setBackground(Color.GREEN);
        getContentPane() .add(cb1);
        getContentPane() .add(cb2);
        getContentPane() .add(cb3);
        cb1.setBounds(30,90,150,20);
        cb2.setBounds(30,120,150,20);
        cb3.setBounds(30,150,150,20);
        setVisible(true);
    }
    public static void main(String[] args) {
        percobaan1_2 ZZ = new percobaan1_2();
        ZZ.objek();
    }
}
