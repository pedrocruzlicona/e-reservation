package com.platzi.ereservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;
/**
 * Interface para definir las operaciones de bdd relacionadas con cliente
 * @author pedro
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente,String> {

	/**
	 * Definición de método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
    
	/**
	 * NamedQuey
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacionCli);
	
	
}
