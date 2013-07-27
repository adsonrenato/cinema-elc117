/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesModel;

import Main.Avisos;
import SalasModel.ArquivoSala;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class DeletarSessao {
    
    private ArquivoSessao arquivo = new ArquivoSessao();
    private ArquivoSala arquivo_sala = new ArquivoSala();
    private Avisos aviso = new Avisos();
    
    private ArrayList<String> salas = new ArrayList<>();
    private ArrayList<Integer> ingressos = new ArrayList<>();
    private ArrayList<Integer> vendidos = new ArrayList<>();
    
    private ArrayList<String> filmes = new ArrayList<>();
    private ArrayList<String> sessoes = new ArrayList<>();
    private ArrayList<Integer> lotacao = new ArrayList<>();
    
    public void deletar(String filme, String sessao){
        int i;
        salas = arquivo_sala.lerSalas();
        ingressos = arquivo_sala.lerVagas();
        vendidos = arquivo.lerVendidos();
        int ingresso = 0;
        
        arquivo.criaarquivo();
        zeraarray();
        
        filmes = arquivo.lerFilmes();
        sessoes = arquivo.lerSessoes();
        lotacao = arquivo.lerlotacao();
        
 
            sessoes.add(sessao);
            
            arquivo.zera();
            String verifica = filme+sessao;
            String verifica2;
            for(i = 0; i < lotacao.size(); i++){
                verifica2 = filmes.get(i)+sessoes.get(i);
                if(!verifica.equals(verifica2))
                    arquivo.insere(filmes.get(i),sessoes.get(i), lotacao.get(i), vendidos.get(i));
            }

            aviso.message("Sessão deletada com sucesso");
        }
    
    
    public void zeraarray(){
        for(int i=0;i>sessoes.size();i++){
            filmes.remove(i);
            sessoes.remove(i);
            lotacao.remove(i);
        }
    }
    

    
}
