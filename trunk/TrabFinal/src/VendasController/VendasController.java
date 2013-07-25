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
    
    ArquivoSessao arquivo_sessoes = new ArquivoSessao();
    ArrayList<String> sessoes = new ArrayList<>();
    ArrayList<Integer> lotacao = new ArrayList<>();
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
        int ing,i;
        
        if(!ingressos.equals("") && !ingressos.equals("0")){
            ing = Integer.parseInt(ingressos);
            System.out.println(ing);
            
            sessoes = arquivo_sessoes.lerSessoes();
            lotacao = arquivo_sessoes.lerlotacao();
            
            for(i = 0; i < sessoes.size(); i++){
                if(sessoes.get(i).equals(sessao)){
                    if(lotacao.get(i) >= ing){
                        lotacao.set(i, lotacao.get(i)-ing);
                    }
                }
            }
        }else{
            System.out.println("erro");
        }
           
    }

    public void addComboBox(){
        JComboBox salaBox;
        ArrayList<String> sessaolist = new ArrayList<>();
        
        salaBox = view.getSessoesBox();
        sessaolist = arquivo_sessoes.lerSessoes();
        for(int i = 0;i<sessaolist.size();i++){
            salaBox.addItem(sessaolist.get(i));
        
       }
    
    }
}
