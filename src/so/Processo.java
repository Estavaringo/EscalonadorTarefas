/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Processo implements Comparable<Processo>{
    private int qtdQuantum;
    private int creditos;


    Processo(int qtdQuantum, int creditos) {
        this.creditos = creditos;
        this.qtdQuantum = qtdQuantum;
    }

    /**
     * @return the qtdQuantum
     */
    public int getQtdQuantum() {
        return qtdQuantum;
    }

    /**
     * @param qtdQuantum the qtdQuantum to set
     */
    public void setQtdQuantum(int qtdQuantum) {
        this.qtdQuantum = qtdQuantum;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public int compareTo(Processo o) {
        return this.creditos - o.creditos;
    }
}
