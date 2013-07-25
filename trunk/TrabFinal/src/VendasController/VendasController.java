/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VendasController;

import SalasModel.ArquivoSala;
import SessoesModel.ArquivoSessao;
import TelaInicialView.TelaInicialJFrame;
import VendasModel.Vendas;
import VendasView.VendasJFrame;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 */
public class VendasController {
    
    private ArquivoSessao sessoes;
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
    
    public void vender(String sessao, String ingressos){
        if(!ingressos.equals("") && !ingressos.equals("0")){
            Integer.parseInt(ingressos);
            System.out.println(ingressos);
        }else{
            System.out.println("erro");
        }
           
    }
    
    public void addComboBox(){
        JComboBox salaBox;
        ArrayList<String> sessaolist = new ArrayList<>();
        
        salaBox = view.getSessoesBox();
        this.sessoes = new ArquivoSessao();
        sessaolist = sessoes.lerSessoes();
        for(int i = 0;i<sessaolist.size();i++){
            salaBox.addItem(sessaolist.get(i));
        
       }
    
    }
}
