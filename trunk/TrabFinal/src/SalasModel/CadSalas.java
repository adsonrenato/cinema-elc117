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
    
    public void zeraarray(){
        for(int i=0;i>ingressos.size();i++){
            salas.remove(i);
            ingressos.remove(i);
        }
    }
    
     public void adicionarsala(String numerosala, int lotacao){
         arquivo.criaarquivo();
         zeraarray();
         salas = arquivo.lerSalas();
         ingressos = arquivo.lerVagas();
         
         if(verifica_existe(numerosala)){
             salas.add(numerosala);
             ingressos.add(lotacao);
         }
         for(int i = 0;i<salas.size();i++){
             arquivo.insere(salas.get(i), ingressos.get(i));
         }
         
     }
     
    
    public boolean verifica_existe(String numerosala){
        for(int i = 0; i < salas.size(); i++)
            if(numerosala.equals(salas.get(i)))
                return true;
        
        return false;
    }
    
    
}
