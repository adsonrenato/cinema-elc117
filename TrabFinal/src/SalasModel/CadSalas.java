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
    
    private String numerosala;
    private int lotacao;


    private ArrayList<String> salalist = new ArrayList<>();

    CadSalas(String numerosala,int lotacao){
        this.numerosala = numerosala;
        this.lotacao = lotacao;
        
     }
    
    
    public int getLotacao() {
        return lotacao;
    }
    
    public ArrayList<String> getList() {
        return salalist;
    }
        
     public void addsala(){
         salalist.add(numerosala);
         
     }
    
    
    
}
