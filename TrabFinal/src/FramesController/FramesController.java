/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesController;

import SalasView.CadSalasJFrame;
import SessoesView.CadSessaoJFrame;
import SessoesView.DelSessaoJFrame;
import TelaInicialView.TelaInicialJFrame;
import VendasView.VendasJFrame;

/**
 *
 */
public class FramesController {
    
    CadSalasJFrame salas = new CadSalasJFrame();
    CadSessaoJFrame sessao = new CadSessaoJFrame();
    VendasJFrame venda = new VendasJFrame();
    DelSessaoJFrame delsessao = new DelSessaoJFrame();
    private TelaInicialJFrame view;
    
    public FramesController(TelaInicialJFrame view){
        this.view = view;
    }
    
    public void venda(){
        view.setVisible(false);
        venda.setVisible(true);     
    }
    
    public void sessao(){
        view.setVisible(false);
        sessao.setVisible(true);
    }
    
    public void sala(){
        view.setVisible(false);
        salas.setVisible(true);
        
    
    }
    public void DelSessao(){
        view.setVisible(false);
        delsessao.setVisible(true);
    }
    
    
}
