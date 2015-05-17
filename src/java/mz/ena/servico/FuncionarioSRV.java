/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.ena.servico;

import mz.ena.dao.FuncionarioDAO;
import mz.ena.modelo.Funcionario;



/**
 *
 * @author Celina
 */
public class FuncionarioSRV {
    private FuncionarioDAO funcionarioDAO;

    public FuncionarioSRV() {
       funcionarioDAO = new  FuncionarioDAO();
    }
    
    public void registarFuncionario(Funcionario funcionario){
        funcionarioDAO.create(funcionario);
    }
 
}
