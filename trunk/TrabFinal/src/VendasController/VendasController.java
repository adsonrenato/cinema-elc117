/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VendasController;

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
    
    private ArquivoSessao arquivo_sessoes = new ArquivoSessao();
    private ArquivoRelatorio relatorio = new ArquivoRelatorio();
    private ArrayList<String> sessoes = new ArrayList<>();
    private ArrayList<Integer> vendidos = new ArrayList<>();
    
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
        int ing;
        
        if(!ingressos.equals("") && !ingressos.equals("0") && !sessao.equals("Sessões")){
            ing = Integer.parseInt(ingressos);
            System.out.println(ing);
            model.vender(sessao, ing);

        }else{
            System.out.println("erro");
        }
        view.setInicio();
           
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
    public void relatorio(){
            sessoes = arquivo_sessoes.lerSessoes();
            vendidos = arquivo_sessoes.lerVendidos();
            relatorio.criaarquivo();
            relatorio.zeraRelatorio();
            for(int i = 0;i<sessoes.size();i++){
                  relatorio.insere(sessoes.get(i), vendidos.get(i));
            }
        
            
        
    }
    
}
