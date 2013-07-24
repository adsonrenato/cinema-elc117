/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VendasController;

import TelaInicialView.TelaInicialJFrame;
import VendasModel.Vendas;
import VendasView.VendasJFrame;

/**
 *
 * @author Guilherme
 */
public class VendasController {
    
    private VendasJFrame view;
    private Vendas model;
    
    public VendasController(VendasJFrame view, Vendas model){
        this.view = view;
        this.model = model;        
    }
    
    public void voltar(){
        view.setVisible(false);
        TelaInicialJFrame inicio = new TelaInicialView.TelaInicialJFrame();
        inicio.setVisible(true);
    }
    
}
