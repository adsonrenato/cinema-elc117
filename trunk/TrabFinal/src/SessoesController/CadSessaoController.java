/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesController;

import SalasModel.ArquivoSala;
import SessoesModel.CadSessao;
import SessoesView.CadSessaoJFrame;
import TelaInicialView.TelaInicialJFrame;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 */
public class CadSessaoController {
    
    private ArquivoSala salas;
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
           System.out.println(sessao);
           model.adicionarSessao(sessao);
        }
        else{
            System.out.println("erro");
        }
    }
    
    public void addComboBox(){
        JComboBox salaBox;
        ArrayList<String> salalist = new ArrayList<>();
        
        salaBox = view.getSalaBox();
        this.salas = new ArquivoSala();
        salalist = salas.lerSalas();
        for(int i = 0;i<salalist.size();i++){
            salaBox.addItem(salalist.get(i));
        }
        
    }
    
}
