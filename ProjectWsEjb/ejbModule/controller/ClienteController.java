package controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dto.ClienteDto;
import model.Cliente;

/**
 * Session Bean implementation class ClienteController
 */
@Stateless
@LocalBean
public class ClienteController implements ClienteControllerRemote {
	
	@PersistenceContext
	EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public ClienteController() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public ClienteDto findCliente(int codcliente) {
		// TODO Auto-generated method stub
		
		Cliente cliente=entityManager.find(Cliente.class, codcliente);
		ClienteDto clienteDto=new ClienteDto();
		clienteDto.setCodigoCliente(cliente.getCodigoCliente());
		clienteDto.setNombreCliente(cliente.getNombreCliente());
		return clienteDto;
	}
    
    
    
    
}
