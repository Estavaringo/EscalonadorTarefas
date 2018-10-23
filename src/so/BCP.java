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


public class BCP  {
    private int PC;
    private String estado;
    private int prioridade;
    private int registradorX; 
    private int registradorY;
    private ArrayList<String> codigo = new ArrayList(22);

    /**
     * @return the PC
     */
    public int getPC() {
        return PC;
    }

    /**
     * @param PC the PC to set
     */
    public void setPC(int PC) {
        this.PC = PC;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the prioridade
     */
    public int getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the registradorX
     */
    public int getRegistradorX() {
        return registradorX;
    }

    /**
     * @param registradorX the registradorX to set
     */
    public void setRegistradorX(int registradorX) {
        this.registradorX = registradorX;
    }

    /**
     * @return the registradorY
     */
    public int getRegistradorY() {
        return registradorY;
    }

    /**
     * @param registradorY the registradorY to set
     */
    public void setRegistradorY(int registradorY) {
        this.registradorY = registradorY;
    }

    /**
     * @return the codigo
     */
    public ArrayList<String> getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(ArrayList<String> codigo) {
        this.codigo = codigo;
    }
    
}
