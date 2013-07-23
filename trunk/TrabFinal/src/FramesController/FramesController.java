/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesController;

import SalasView.CadSalasJFrame;
import SessoesView.CadSessaoJFrame;
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
    
    public void sessao(){
        view.setVisible(false);
        CadSessaoJFrame sessao = new CadSessaoJFrame();
        sessao.setVisible(true);
    }
    
    public void sala(){
        view.setVisible(false);
        CadSalasJFrame salas = new CadSalasJFrame();
        salas.setVisible(true);
        
    
    }
    
    
}
