/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VendasController;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 */
public class ArquivoRelatorio {
     File arquivo = new File( "relatorio.csv" );
     
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
     

         
     
     
     public void insere(String sessao,int ingressos){
       try{
            
            FileWriter fw = new FileWriter( arquivo, false );
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write(sessao+","+ingressos);
            bw.newLine();
            bw.close();
            fw.close();
       }catch(IOException e){
            e.printStackTrace();
       }
    }
    
}
