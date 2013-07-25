/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesController;

import Main.Avisos;
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
    private Avisos aviso =  new Avisos();
    
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
        if(!filme.equals("") && !data.equals("") && !horario.equals("") && !sala.equals("Salas")){
           sessao = "Sala:"+sala+"-"+"Filme:"+filme+"-"+"Data:"+data+"-"+"horario:"+horario;
           System.out.println(sessao);
           model.adicionarSessao(sessao,sala);
        }
        else{
            aviso.message("Prencha todos campos e selecione a sala por favor");
        }
        view.setInicio();
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
