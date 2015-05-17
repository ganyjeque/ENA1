/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.ena.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Celina
 */
@Entity
@Table(name = "ena_cliente")


public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero")
    private int numero;
    @Column(name = "nomeCompleto" )
    private String nomeCompleto;
    @Column(name = "nuit")
    private int nuit;
    @Column(name = "nBi")
    private String nBi;

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public String getnBi() {
        return nBi;
    }

    public void setnBi(String nBi) {
        this.nBi = nBi;
    }
    
    
            
}
