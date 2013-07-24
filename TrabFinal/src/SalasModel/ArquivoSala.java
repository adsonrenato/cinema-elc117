/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SalasModel;

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
public class ArquivoSala {
       File arquivo = new File( "Salas.csv" );
     
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
    
     
     public void insere(String sala, int lotacao){
       try{
            
            FileWriter fw = new FileWriter( arquivo, false );
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write(sala+","+lotacao);
            bw.newLine();
            bw.close();
            fw.close();
       }catch(IOException e){
            e.printStackTrace();
       }
    }
     
    public ArrayList<String> lerSalas(){
        ArrayList<String> salas = new ArrayList<>();
        try{
              String array [] = new String[2];
              
              FileReader fr = new FileReader( arquivo );
              BufferedReader br = new BufferedReader( fr );
                while( br.ready() ){
                    String linha = br.readLine();
                    array = linha.split(",");
                    salas.add(array[0]);    
                }
  
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
        return salas;
    }
    
}
