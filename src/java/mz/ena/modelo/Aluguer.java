/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.ena.modelo;

import java.util.Date;



/**
 *
 * @author Celina
 */
public class Aluguer {
    
    private int numero;
    private Date data;
    private Date prazo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }
    
    
    
    
}
