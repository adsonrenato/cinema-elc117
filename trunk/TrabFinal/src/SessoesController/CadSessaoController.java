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
    
    public void cadastrar(String sala,String filme,String data,String horario){
        if(filme.equals("") || data.equals("") || horario.equals("      /      /")){
            
        }
        else{
            System.out.println("ofasasfsaf");
        }
    }
    
}
