/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadController;

import javax.swing.JButton;

/**
 *
 * @author Guilherme
 */
public class MyRunnable implements Runnable {
   
    private JButton banner;
    private static final int SLEEP_MILLIS = 1000;
    

    public MyRunnable(JButton banner) {
        this.banner = banner;
    }
    
    @Override
     public void run() {
        try {
            int i = 0;
            while (true) {
                Thread.sleep(SLEEP_MILLIS);
                if(i == 0){
                    banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("b1.jpg")));
                }
                if ( i == 2){
                    banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("b2.jpg")));
                }
                if ( i == 4){
                    banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("b3.jpg")));
                }
                if ( i >= 6){
                    i=-1;
                }
                i++;
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
     }
    
}
