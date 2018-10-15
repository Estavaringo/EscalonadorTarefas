/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author scart
 */

public class Arquivos {
    
    static int q;
    
    public static void atribuiQuantum(){     
        try{
            FileReader quant = new FileReader("SO/processos/quantum.txt");
            BufferedReader lequant = new BufferedReader(quant); 
            String qua = lequant.readLine();
            q = Integer.parseInt(qua);
        }catch(IOException e){
            System.out.println("Erro na abertura do arquivo quantum.txt");
        }
        
    }
    
    Arquivos(){
        atribuiQuantum();
    }
    
}
