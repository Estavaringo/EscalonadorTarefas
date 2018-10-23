/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scart
 */
public abstract class Arquivos {

    static final int qtdProcessos = 10;

    public static ArrayList<BCP> lerArquivos() throws FileNotFoundException {
        ArrayList<BCP> listaProcessos = new ArrayList(qtdProcessos);
        BufferedReader arqProcessos, arqPrioridades, arqQuantum;

        try {

            //abre arquivos
            arqPrioridades = new BufferedReader(new FileReader(new File("SO/processos/prioridades.txt")));
            arqQuantum = new BufferedReader(new FileReader(new File("SO/processos/quantum.txt")));

            for (int i = 0; i < qtdProcessos; i++) {
                if (i == 10) {
                    arqProcessos = new BufferedReader(new FileReader(new File("SO/processos/10.txt")));
                } else {
                    arqProcessos = new BufferedReader(new FileReader(new File("SO/processos/0" + Integer.toString(i) + ".txt")));
                }
                BCP bcp = new BCP();

                //le todas as linhas de codigo do arquivos do processo
                while (arqProcessos.ready()) {
                    ArrayList<String> codigo = new ArrayList();
                    codigo.add(arqProcessos.readLine());
                }
                bcp.setPrioridade(Integer.parseInt(arqPrioridades.readLine())); //lÊ prioridades e guarda em seu processo

                arqProcessos.close();
                listaProcessos.add(bcp);  //insere processo na fila de prontos
            }
            SO.quantum = Integer.parseInt(arqQuantum.readLine());
            arqPrioridades.close();
            arqQuantum.close();

            return listaProcessos;

            //prioridades[i] = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("ERRO NA LEITURA DE ARQUIVOS");
        }
        finally{
            return null;
        }
        
    }
}
