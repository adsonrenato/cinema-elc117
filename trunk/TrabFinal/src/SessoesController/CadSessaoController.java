/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesController;

import SessoesModel.CadSessao;
import SessoesView.CadSessaoJFrame;
import TelaInicialView.TelaInicialJFrame;

/**
 *
 */
public class CadSessaoController {
    
    private CadSessaoJFrame view;
    private CadSessao model;
    
    public CadSessaoController(CadSessaoJFrame view, CadSessao model){
        this.view = view;
        this.model = model;
       
    }
    
    public void voltar(){
        view.setEnabled(false);
        TelaInicialJFrame inicio = new TelaInicialJFrame();
        inicio.setVisible(true);
    }
    
}
