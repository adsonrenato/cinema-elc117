/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessoesModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 */
public class ArquivoSessao {
       File arquivo = new File( "Sessoes.csv" );
     
     public void criaarquivo(){
       try {  
              
            boolean success = arquivo.createNewFile();  
            if (success) {  
                // arquivo n existia e foi criado
            } else {  
                // arquivo ja existia
             }  
        } catch (IOException e) { 
            e.printStackTrace();
        }  
     }
     
         
     public void zera(){
          try{
            
            FileWriter fw = new FileWriter( arquivo, false );
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write("");
            bw.close();
            fw.close();
       }catch(IOException e){
            e.printStackTrace();
       }
         
     }
     
     public void insere(String sessao, int ingressos,int vendidos){
       try{
            
            FileWriter fw = new FileWriter( arquivo, true );
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write(sessao+","+ingressos+","+vendidos);
            bw.newLine();
            bw.close();
            fw.close();
       }catch(IOException e){
            e.printStackTrace();
       }
    }
     
       public ArrayList<String> lerSessoes(){
        ArrayList<String> sessao = new ArrayList<>();
        try{
              String array [] = new String[3];
              
              FileReader fr = new FileReader( arquivo );
              BufferedReader br = new BufferedReader( fr );
                while( br.ready() ){
                    String linha = br.readLine();
                    array = linha.split(",");
                    sessao.add(array[0]);    
                }
  
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return sessao;
       }
       
       public ArrayList<Integer> lerlotacao(){
       
           ArrayList<Integer> lotacao = new ArrayList<>();
        
        try{
              String array [] = new String[3];
              Integer vagas;
              FileReader fr = new FileReader( arquivo );
              BufferedReader br = new BufferedReader( fr );
                while( br.ready() ){
                    String linha = br.readLine();
                    array = linha.split(",");
                    vagas = Integer.parseInt(array[1]);
                    lotacao.add(vagas);    
                }
              
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return lotacao;
       }
       
       public ArrayList<Integer> lerVendidos(){
       
           ArrayList<Integer> ingressos = new ArrayList<>();
        
        try{
              String array [] = new String[3];
              Integer vendidos;
              FileReader fr = new FileReader( arquivo );
              BufferedReader br = new BufferedReader( fr );
                while( br.ready() ){
                    String linha = br.readLine();
                    array = linha.split(",");
                    vendidos = Integer.parseInt(array[2]);
                    ingressos.add(vendidos);    
                }
              
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return ingressos;
       }
       
    
}
