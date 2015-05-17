/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.ena.dao;

import mz.ena.cmn.dao.GenericDAO;
import mz.ena.modelo.Cliente;




/**
 *
 * @author Celina
 */
public class ClienteDAO extends GenericDAO<Cliente>{

    public ClienteDAO() {
        super(Cliente.class);
    }
}
