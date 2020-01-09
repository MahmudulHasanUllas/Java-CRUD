
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ULLAS
 */
public class progressbar extends JFrame {

    JProgressBar pb;

    public progressbar() {

        pb = new JProgressBar();
        pb.setBounds(50, 50, 500, 35);
     
        
        pb.setValue(0);
        pb.setStringPainted(true);
        this.add(pb);
        this.setSize(700, 200);

        this.setUndecorated(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
    }

    public void update() {

        int i = 0;
        while (i < 101) {
            pb.setValue(i);
            i++;

            try {

                Thread.sleep(20);

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        progressbar pb = new progressbar();
        pb.setVisible(true);
        pb.setBackground(new Color(100, 100, 100, 0));
        

       
        pb.update();
        pb.setVisible(false);
        
        Login ts = new Login();
                ts.setVisible(true);
             
              
                
    }
}
