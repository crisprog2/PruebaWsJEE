package controller;

import javax.ejb.Remote;

import dto.ClienteDto;

@Remote
public interface ClienteControllerRemote {
	
	public ClienteDto findCliente(int codcliente);
	
}
