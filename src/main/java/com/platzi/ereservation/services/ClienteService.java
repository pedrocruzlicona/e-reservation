package com.platzi.ereservation.services;



import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.repository.ClienteRepository;
import com.platzi.ereservation.modelo.Cliente;

/**
 * Clase para definir los servicios del cliente
 * @author pedro
 *
 */
@Service
@Transactional(readOnly=true)
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		// TODO Auto-generated constructor stub
		this.clienteRepository = clienteRepository; 
	}
	
	/**
	 * Método para realizar la operación de guardar un cliente
	 * @param cliente
	 * @return
	 */
    @Transactional
	public Cliente create(Cliente cliente) {
		
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de actualizar un cliente
	 * @param cliente
	 * @return
	 */
    @Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de eliminar un cliente
	 * @param cliente
	 */
    @Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Método para conssultar un cliente por su identificación
	 * @param identificacionCli
	 * @return
	 */
   
	public Cliente findByIdentificacion(String identificacionCli) {
	  return this.clienteRepository.findByIdentificacion(identificacionCli);
	}

	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return this.clienteRepository.findAll();
	}

}
