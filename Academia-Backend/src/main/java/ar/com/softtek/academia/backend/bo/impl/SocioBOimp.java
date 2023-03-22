package ar.com.softtek.academia.backend.bo.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.entities.Socio;
import ar.com.academia.exceptions.BusinessException;
import ar.com.academia.exceptions.PersistenceException;
import ar.com.academia.mapper.SocioMapper;
import ar.com.softtek.academia.backend.bo.ISocioBO;
import ar.com.softtek.academia.backend.dao.impl.SocioDAOimp;

public class SocioBOimp implements ISocioBO{
	
	private SocioDAOimp socioDAO;
	
	public SocioBOimp() {}


	@Override
	public void setSocioDAO(SocioDAOimp socioDAO) throws BusinessException{
		// TODO Auto-generated method stub
		this.socioDAO = socioDAO;
	}

	@Override
	public void crearSocio(String nombreYapellido, String documento, String direccion, Integer telefono, String mail,
			String fechaDeNacimiento, String sexo, String plan) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			Socio socio = new Socio(nombreYapellido, documento, direccion, telefono, mail, fechaDeNacimiento, sexo, plan);
			this.socioDAO.save(socio);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			throw new BusinessException();
		}
	}

	@Override
	public List<SocioDTO> getAllSocios() throws BusinessException{
		// TODO Auto-generated method stub
		try {	
			List<SocioDTO> sociosDto=new ArrayList<SocioDTO>();
			SocioDTO socioDto;
			List<Socio> socios = this.socioDAO.getAll();
			for(Socio s: socios) {
				socioDto = SocioMapper.INSTANCE.toDto(s);
				sociosDto.add(socioDto);
			}
			return sociosDto;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			throw new BusinessException();
		}
	}

	@Override
	public SocioDTO getSocioByName(String nombre) throws BusinessException{
		// TODO Auto-generated method stub
		try {
			Socio socio = this.socioDAO.getByName(nombre);
			SocioDTO socioDto = SocioMapper.INSTANCE.toDto(socio);
			return socioDto;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			throw new BusinessException();
		}	
	}

	@Override
	public void borrarSocio(String nombre) throws BusinessException{
		// TODO Auto-generated method stub
		try {
			this.socioDAO.delete(nombre);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			throw new BusinessException();
		}
	}

	@Override
	public void actualizarSocio(String nombre, String nuevoNombre) throws BusinessException{
		// TODO Auto-generated method stub
		try {
			Socio socio = this.socioDAO.getByName(nombre);
			socio.setNombreYapellido(nuevoNombre);
			this.socioDAO.update(socio);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			throw new BusinessException();
		}
	}

}
