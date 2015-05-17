/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.ena.controlador;

import mz.ena.modelo.Cliente;
import mz.ena.servico.ClienteSRV;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;




/**
 *
 * @author Celina
 */
public class ClienteCTL extends GenericForwardComposer{
    private Button regitar;
    private ClienteSRV clientSrv;
    private Cliente cl;

    public ClienteCTL() {
        clientSrv = new ClienteSRV();
    }
    
    public void onClick$regitar(Event e){
        
        cl = new Cliente();
        cl.setNomeCompleto("Vitalina");
        cl.setNuit(1234567890);
        cl.setNumero(54444444);
        cl.setnBi("123456789");
        
        clientSrv.registarclienteDAO(cl);
        
    }
    
}
