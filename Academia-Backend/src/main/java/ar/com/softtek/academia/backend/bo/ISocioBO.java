package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.exceptions.BusinessException;
import ar.com.softtek.academia.backend.dao.impl.SocioDAOimp;

public interface ISocioBO {
	
	public void setSocioDAO(SocioDAOimp socioDAO) throws BusinessException;
	
	public void crearSocio(String nombreYapellido, String documento, String direccion, Integer telefono, String mail,
			String fechaDeNacimiento, String sexo, String plan) throws BusinessException;
	
	public List<SocioDTO> getAllSocios() throws BusinessException;
	
	public SocioDTO getSocioByName(String nombre) throws BusinessException;
	
	public void borrarSocio(String nombre) throws BusinessException;

	public void actualizarSocio(String nombre, String nuevoNombre) throws BusinessException;
	
}
