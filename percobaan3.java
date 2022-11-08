package modul8;
import java.awt.*;
import javax.swing.*;
public class percobaan3 extends JFrame{
    //buat elemen
    JTextField tf = new JTextField();
    JButton bt1 = new JButton("1");
    JButton bt2 = new JButton("2");
    JButton bt3 = new JButton("3");
    JButton bt4 = new JButton("4");
    JButton bt5 = new JButton("5");
    JButton bt6 = new JButton("6");
    JButton bt7 = new JButton("7");
    JButton bt8 = new JButton("8");
    JButton bt9 = new JButton("9");
    JButton bt0 = new JButton("0");
    JButton btPlus = new JButton("+");
    JButton btReduce = new JButton("-");
    JButton btDivide = new JButton("/");
    JButton btMultiplied = new JButton("*");
    JButton btEqual = new JButton("=");
    JButton btC = new JButton("C");
    
    percobaan3(){
        setTitle("Design Preview");
        setSize(310, 280);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        //menambahkan elemen
        getContentPane() .setLayout(null);
        getContentPane() .setBackground(Color.CYAN);
        getContentPane() .add(tf);
        getContentPane() .add(bt1);
        getContentPane() .add(bt2);
        getContentPane() .add(bt3);
        getContentPane() .add(bt4);
        getContentPane() .add(bt5);
        getContentPane() .add(bt6);
        getContentPane() .add(bt7);
        getContentPane() .add(bt8);
        getContentPane() .add(bt9);
        getContentPane() .add(bt0);
        getContentPane() .add(btPlus);
        getContentPane() .add(btReduce);
        getContentPane() .add(btDivide);
        getContentPane() .add(btMultiplied);
        getContentPane() .add(btEqual);
        getContentPane() .add(btC);
        //Position
        tf.setBounds(20, 20,260, 30);
        bt1.setBounds(20, 60, 50, 30);
        bt2.setBounds(90, 60, 50, 30);
        bt3.setBounds(160, 60,50, 30);
        btPlus.setBounds(230, 60,50, 30);
        bt4.setBounds(20, 100,50, 30);
        bt5.setBounds(90, 100,50, 30);
        bt6.setBounds(160, 100,50, 30);
        btReduce.setBounds(230, 100,50, 30);
        bt7.setBounds(20, 140,50, 30);
        bt8.setBounds(90, 140,50, 30);
        bt9.setBounds(160, 140,50, 30);
        btMultiplied.setBounds(230, 140,50, 30);
        bt0.setBounds(20, 180,50, 30);
        btC.setBounds(90, 180,50, 30);
        btEqual.setBounds(160, 180,50, 30);
        btDivide.setBounds(230, 180,50, 30);
        setVisible(true);
        
        //warna
        bt1.setBackground(Color.MAGENTA);
        bt2.setBackground(Color.MAGENTA);
        bt3.setBackground(Color.MAGENTA);
        bt4.setBackground(Color.MAGENTA);
        bt5.setBackground(Color.MAGENTA);
        bt6.setBackground(Color.MAGENTA);
        bt7.setBackground(Color.MAGENTA);
        bt8.setBackground(Color.MAGENTA);
        bt9.setBackground(Color.MAGENTA);
        bt0.setBackground(Color.MAGENTA);
        btDivide.setBackground(Color.MAGENTA);
        btEqual.setBackground(Color.MAGENTA);
        btC.setBackground(Color.MAGENTA);
        btPlus.setBackground(Color.MAGENTA);
        btReduce.setBackground(Color.MAGENTA);
        btMultiplied.setBackground(Color.MAGENTA);
        
    }
    public static void main(String[] args) {
        percobaan3 aa = new percobaan3();
        aa.objek();
    }
}
