
package modul8;
import javax.swing.*;
import java.awt.*;
public class percobaan1 extends JFrame{
    Button cb1 = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");

    percobaan1() {
        setTitle("Progran GUI Pertamaku");
        setLocation(200, 100);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void objek(){
        getContentPane() .setLayout(new FlowLayout());
        getContentPane() .setBackground(Color.GREEN);
        cb1.setBackground(Color.MAGENTA);
        getContentPane() .add(cb1);
        getContentPane() .add(cb2);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        percobaan1 ZZ = new percobaan1();
        ZZ.objek();
        
    }
    
    
}
