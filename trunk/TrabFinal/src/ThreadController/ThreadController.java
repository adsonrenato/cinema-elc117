/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadController;


import VendasView.VendasJFrame;


/**
 *
 * @author Guilherme
 */
public class ThreadController {
    
    private VendasJFrame view;
    private Thread thread;
    
   public ThreadController(VendasJFrame view) {
        this.view = view;
  
   }


   
    public void runThread() {
        // Create a new thread object
        thread = new Thread(new MyRunnable(view.getJbutton(0)));
        // Set view to a new state
        //view.setRunning(0);
        // Start running thread0
        thread.start();
    }

    void stopThread0() {
        if (thread != null) {
            thread.interrupt();
        }
    }
    
    
}
