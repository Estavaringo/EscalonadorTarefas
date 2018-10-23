/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author gabri
 */
//Armazena os bcps dos processos
public class TabelaProcessos {

    public HashMap<Processo,BCP> bcps =  new HashMap<Processo,BCP>();

    public TabelaProcessos() {
    }

    public BCP recuperaBCP(Processo processo){
        return bcps.get(processo);
    }
    
    public void adicionaProcesso(Processo processo, BCP bcp){
        bcps.put(processo, bcp);
    }    
    
    public void removeProcesso(Processo processo){
        bcps.remove(processo);
    }
    
}
