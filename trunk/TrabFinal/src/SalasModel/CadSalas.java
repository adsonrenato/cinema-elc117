/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SalasModel;

import java.util.ArrayList;

/**
 *
 */
public class CadSalas {    
    ArquivoSala arquivo = new ArquivoSala();
    ArrayList<String> salas = new ArrayList<>();
    ArrayList<Integer> ingressos = new ArrayList<>();
    private String numerosala;
    private int lotacao;
    
     public void adicionarsala(String numerosala, int lotacao){
         this.numerosala = numerosala;
         this.lotacao = lotacao;
         arquivo.criaarquivo();
         salas = arquivo.lerSalas();
         ingressos = arquivo.lerVagas();
         
     }
    
    
    
    
}
