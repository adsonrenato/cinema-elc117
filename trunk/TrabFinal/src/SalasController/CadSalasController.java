/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SalasController;

import SalasModel.CadSalas;
import SalasView.CadSalasJFrame;
import TelaInicialView.TelaInicialJFrame;

/**
 *
 */
public class CadSalasController {
    private CadSalasJFrame view;
    private CadSalas model;
    
    public CadSalasController(CadSalasJFrame view, CadSalas model){
        this.view = view;
        this.model = model;
    }
    
    public void voltar(){
        view.setVisible(false);
        TelaInicialJFrame inicio = new TelaInicialJFrame();
        inicio.setVisible(true);
    }
    

    
    public void cadastro(String sala,String lotacao){
        if(!sala.equals("") && !lotacao.equals("")){
            Integer.parseInt(lotacao);
            System.out.println(lotacao);
        }else {
            System.out.println("erro");
        }
        
    }
    
}
