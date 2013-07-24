/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesModel;

import java.util.ArrayList;

/**
 *
 */
public class CadSessao {
    
    ArquivoSessao arquivo = new ArquivoSessao();
    ArrayList<String> sessoes = new ArrayList<>();
    ArrayList<Integer> lotacao = new ArrayList<>();
    
    public void zeraarray(){
        for(int i=0;i>sessoes.size();i++){
            sessoes.remove(i);
            lotacao.remove(i);
        }
    }
    
    public void adicionarSessao(String sessao, int ingressos){
        arquivo.criaarquivo();
        zeraarray();
        sessoes = arquivo.lerSessoes();
        lotacao = arquivo.lerlotacao();
        
        arquivo.insere(sessao, ingressos);
        
    }
    
    
}
