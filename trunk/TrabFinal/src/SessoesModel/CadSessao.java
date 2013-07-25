/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesModel;

import java.util.ArrayList;
import SalasModel.ArquivoSala;

/**
 *
 */
public class CadSessao {
    
    ArquivoSessao arquivo = new ArquivoSessao();
    ArquivoSala arquivo_sala = new ArquivoSala();
    ArrayList<String> salas = new ArrayList<>();
    ArrayList<Integer> ingressos = new ArrayList<>();
    ArrayList<String> sessoes = new ArrayList<>();
    ArrayList<Integer> lotacao = new ArrayList<>();
    
    public void zeraarray(){
        for(int i=0;i>sessoes.size();i++){
            sessoes.remove(i);
            lotacao.remove(i);
        }
    }
    
    public void adicionarSessao(String sessao){
        salas = arquivo_sala.lerSalas();
        ingressos = arquivo_sala.lerVagas();
        int ingresso = 0;
        
        arquivo.criaarquivo();
        zeraarray();
        sessoes = arquivo.lerSessoes();
        lotacao = arquivo.lerlotacao();
        
        if(!verifica_existe(sessao)){
            sessoes.add(sessao);
        }
        
        arquivo.zera();
        
        for(int i = 0;i<sessoes.size();i++){
            arquivo.insere(sessoes.get(i), lotacao.get(i));          
        }
        
        for(int i = 0; i < salas.size(); i++){
            if(salas.get(i).equals(sessao)){
                ingresso = ingressos.get(i);
            }
        }
        
        arquivo.insere(sessao, ingresso);
        
    }
    
    public boolean verifica_existe(String numerosala){
        for(int i = 0; i < sessoes.size(); i++)
            if(numerosala.equals(sessoes.get(i)))
                return true;
        
        return false;
    }
    
}
