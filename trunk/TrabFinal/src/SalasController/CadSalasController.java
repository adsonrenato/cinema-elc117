/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SalasController;

import Main.Avisos;
import SalasModel.CadSalas;
import SalasView.CadSalasJFrame;
import TelaInicialView.TelaInicialJFrame;

/**
 *
 */
public class CadSalasController {
    private CadSalasJFrame view;
    private CadSalas model;
    private Avisos aviso = new Avisos();
    
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
        int lot;
        
        if(!sala.equals("") && !lotacao.equals("")){
            lot = Integer.parseInt(lotacao);
            model.adicionarsala(sala, lot);
        }else {
          
            aviso.message("Prencha todos campos por favor");
        }
        
    }
    
}
