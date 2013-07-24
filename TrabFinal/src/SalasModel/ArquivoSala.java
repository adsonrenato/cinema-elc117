/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SalasModel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Guilherme
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
            bw.write(sala+", "+lotacao);
            bw.newLine();
            bw.close();
            fw.close();
       }catch(IOException e){
            e.printStackTrace();
       }
    }
    
}
