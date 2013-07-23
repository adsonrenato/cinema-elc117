/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesController;

import TelaInicialView.TelaInicialJFrame;
import VendasView.VendasJFrame;

/**
 *
 * @author Guilherme
 */
public class FramesController {
    
    private TelaInicialJFrame view;
    
    public FramesController(TelaInicialJFrame view){
        this.view = view;
    }
    
    public void venda(){
        view.setVisible(false);
        VendasJFrame venda = new VendasJFrame();
        venda.setVisible(true);
        
    }
    
    
}
