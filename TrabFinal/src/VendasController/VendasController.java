/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VendasController;

import Main.Avisos;
import SessoesModel.ArquivoSessao;
import TelaInicialView.TelaInicialJFrame;
import VendasModel.Vendas;
import VendasView.VendasJFrame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 */
public class VendasController {
    
    private ArquivoSessao arquivo_sessoes = new ArquivoSessao();
    private ArquivoRelatorio relatorio = new ArquivoRelatorio();
    private Avisos aviso = new Avisos();
    
    private ArrayList<String> filmes = new ArrayList<>();
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
    
    public void vender(String filme,String sessao, String ingressos){
        int ing;
        
        if(!ingressos.equals("") && !ingressos.equals("0") && !sessao.equals("Sessões") && !filme.equals("Filmes")){
            ing = Integer.parseInt(ingressos);
            System.out.println(ing);
            model.vender(sessao, ing);

        }else{
            aviso.message("Digite um numero de ingressos valido e selecione um filme e uma sessão ");
        }
        view.setInicio();
           
    }

    public void addComboBoxFilmes(){
        int i,j;
        JComboBox filmeBox;
        ArrayList<String> filmelist = new ArrayList<>();
        ArrayList<String> aux = new ArrayList<>();

        filmeBox = view.getfilmeBox();
        filmelist = arquivo_sessoes.lerFilmes();
        
        for(i = 0; i < filmelist.size(); i++){
            for(j = 0; j < aux.size(); j++){
                if(filmelist.get(i).equals(aux.get(j))){
                    j = -1;
                    break;
                }
            }
            if(j != -1){
                aux.add(filmelist.get(i));
            }
        }
        
        for(i = 0; i < aux.size(); i++){
            filmeBox.addItem(aux.get(i));
        }
    }
    
    public void addComboBoxSessoes(String filme){
        JComboBox sessoesBox;
        sessoesBox = view.getsessoesBox();
        sessoesBox.removeAllItems();
        sessoesBox.addItem("Sessões");
        
        ArrayList<String> sessoeslist = new ArrayList<>();
        ArrayList<String> filmelist = new ArrayList<>();
        
        sessoeslist = arquivo_sessoes.lerSessoes();
        filmelist = arquivo_sessoes.lerFilmes();
        
        for(int i = 0; i< sessoeslist.size();i++){
            if(filmelist.get(i).equals(filme)){
               sessoesBox.addItem(sessoeslist.get(i));
            }
        }
        
    }
    
    public void relatorio(){
            filmes = arquivo_sessoes.lerFilmes();
            sessoes = arquivo_sessoes.lerSessoes();
            vendidos = arquivo_sessoes.lerVendidos();
            relatorio.criaarquivo();
            relatorio.zeraRelatorio();
            for(int i = 0;i<sessoes.size();i++){
                  relatorio.insere(filmes.get(i), sessoes.get(i), vendidos.get(i));
            }

            aviso.message("Relatório gerado com sucesso");
            abrirRelatorio();
        
            
        
    }
    
    public void abrirRelatorio(){
        try { 
            Runtime.getRuntime().exec("notepad relatorio.csv");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
