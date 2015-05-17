/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.ena.servico;

import mz.ena.dao.ClienteDAO;
import mz.ena.modelo.Cliente;


/**
 *
 * @author Celina
 */
public class ClienteSRV {
    private ClienteDAO clienteDAO;

    public ClienteSRV() {
       clienteDAO = new ClienteDAO();
    }
    
   public void registarclienteDAO(Cliente cliente) {
        clienteDAO.create(cliente);
        
    }
}
