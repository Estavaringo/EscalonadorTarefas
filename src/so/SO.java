/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scart
 */
//atribui e redistribui creditos
public class SO {

    public static int medInterrompido = 0; // contador para a média de processos interrompidos
    public static int medInstrucao = 0; // contador para a média do número de instruções por quantum
    public static int totalQuantum = 0;// contador geral de quantuns, em relação a todos os processos
    public static int quantum;
    public static TabelaProcessos tabelaProcessos;
    public static int maxPrioridade = 0;

    public static void main(String[] args) {
        tabelaProcessos = new TabelaProcessos();
        try {
            ArrayDeque<Processo> listaBloqueados = new ArrayDeque();
            ArrayList<BCP> listaBCPS = Arquivos.lerArquivos();
            PriorityQueue<Processo> listaProntos = new PriorityQueue();
            ArrayList<PriorityQueue<Processo>> multiplasFilas = new ArrayList();

            //distribui creditos e quantas aos processos
            //preenche tabela de processos
            for (BCP bcp : listaBCPS) {
                if (bcp.getPrioridade() > maxPrioridade) {
                    maxPrioridade = bcp.getPrioridade();
                }
                Processo processo = new Processo(1, bcp.getPrioridade());
                listaProntos.offer(processo);
                tabelaProcessos.adicionaProcesso(processo, bcp);
            }

            //cria multiplas filas
            for (int i = 0; i <= maxPrioridade; i++) {
                multiplasFilas.add(new PriorityQueue<Processo>());
            }

            //insere processos nas multiplas filas
            for (Processo processo : listaProntos) {
                   multiplasFilas.get(processo.getCreditos()).offer(processo); 
            }
            
            
            //Cria Multiplas Filas
        } catch (FileNotFoundException ex) {
            System.out.println("Erro na leitura de arquivos");
        }
    }

}
