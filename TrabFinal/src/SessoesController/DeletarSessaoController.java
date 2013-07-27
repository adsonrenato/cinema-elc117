/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesController;

import Main.Avisos;
import SessoesModel.ArquivoSessao;
import SessoesModel.DeletarSessao;
import SessoesView.DelSessaoJFrame;
import TelaInicialView.TelaInicialJFrame;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Guilherme
 */
public class DeletarSessaoController {
    
    private DelSessaoJFrame view;
    private DeletarSessao model;
    private Avisos aviso =  new Avisos();
     
    private ArquivoSessao arquivo = new ArquivoSessao();
    
    public DeletarSessaoController(DelSessaoJFrame view, DeletarSessao model){
        this.view = view;
        this.model = model;
    }
    
    public void deletar(String filme, String sessao){
        if(!filme.equals("Filmes") && !sessao.equals("Sessões") ){
            model.deletar(filme, sessao);
            addComboBoxFilmes();
            addComboBoxSessoes(filme);
        }else{
            aviso.message("Selecione Filme e Sessão para poder deletar");
        }
    }
    
    public void addComboBoxFilmes(){
        int i,j;
        JComboBox filmeBox;
        ArrayList<String> filmelist = new ArrayList<>();
        ArrayList<String> aux = new ArrayList<>();

        filmeBox = view.getFilmeBox();
        filmelist = arquivo.lerFilmes();
        
        filmeBox.removeAllItems();
        filmeBox.addItem("Filmes");
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
        sessoesBox = view.getSessaoBox();
        sessoesBox.removeAllItems();
        sessoesBox.addItem("Sessões");
        
        ArrayList<String> sessoeslist = new ArrayList<>();
        ArrayList<String> filmelist = new ArrayList<>();
        
        sessoeslist = arquivo.lerSessoes();
        filmelist = arquivo.lerFilmes();
        
        for(int i = 0; i< sessoeslist.size();i++){
            if(filmelist.get(i).equals(filme)){
               sessoesBox.addItem(sessoeslist.get(i));
            }
        }
        
    }
    
    public void voltar(){
        view.setVisible(false);
        TelaInicialJFrame inicio = new TelaInicialJFrame();
        inicio.setVisible(true);
    }
    
}
