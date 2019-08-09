package org.jboss.samples.webservices;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import controller.ClienteControllerRemote;
import dto.ClienteDto;

@WebService()
public class ClienteWs {
	
	@EJB
	ClienteControllerRemote clientecon;
	
	@WebMethod()
	public ClienteDto sayHello() {
	    return clientecon.findCliente(101);
	}
}
