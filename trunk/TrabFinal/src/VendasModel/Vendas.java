/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VendasModel;

import SessoesModel.ArquivoSessao;
import VendasController.ArquivoRelatorio;
import java.util.ArrayList;

/**
 *
 */
public class Vendas {
    
    private ArquivoSessao arquivo_sessoes = new ArquivoSessao();
    private ArrayList<String> sessoes = new ArrayList<>();
    private ArrayList<Integer> lotacao = new ArrayList<>();
    private ArrayList<Integer> vendidos = new ArrayList<>();
    

    
    public void vender(String sessao, int ingressos){
            
            int i;
            sessoes = arquivo_sessoes.lerSessoes();
            lotacao = arquivo_sessoes.lerlotacao();
            vendidos = arquivo_sessoes.lerVendidos();
            
            for(i = 0; i < sessoes.size(); i++){
                if(sessoes.get(i).equals(sessao)){
                    if(lotacao.get(i) >= vendidos.get(i)+ingressos){
                        vendidos.set(i, vendidos.get(i)+ingressos);
            
                        arquivo_sessoes.zera();

                        for(i = 0; i < lotacao.size(); i++){
                            arquivo_sessoes.insere(sessoes.get(i), lotacao.get(i),vendidos.get(i));
                        }
                    } else {
                        System.out.println("erro");
                    }
                    break;
                }
            }
        
    }
 }

