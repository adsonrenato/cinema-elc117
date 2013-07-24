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
        view.setVisible(false);
        TelaInicialJFrame inicio = new TelaInicialJFrame();
        inicio.setVisible(true);
    }
    
    public void cadastrar(String sala,String filme,String data,String horario){
        String sessao;
        if(!filme.equals("") && !data.equals("") && !horario.equals("")){
           sessao = sala+"-"+filme+"-"+data+"-"+horario;
        }
        else{
            System.out.println("erro");
        }
    }
    
}
