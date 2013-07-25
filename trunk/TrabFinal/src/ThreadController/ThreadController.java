/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadController;


import VendasView.VendasJFrame;


/**
 *
 */
public class ThreadController {
    
    private VendasJFrame view;
    private Thread thread;
    
   public ThreadController(VendasJFrame view) {
        this.view = view;
  
   }


   
    public void runThread() {
        thread = new Thread(new MyRunnable(view.getJlabel()));
        thread.start();
    }

    void stopThread0() {
        if (thread != null) {
            thread.interrupt();
        }
    }
    
    
}
