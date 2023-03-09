package ar.com.softtek.academia.backend.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.exceptions.BusinessException;
import ar.com.academia.exceptions.ServiceException;
import ar.com.academia.services.SocioService;
import ar.com.softtek.academia.backend.bo.impl.SocioBOimp;

@WebService(endpointInterface = "ar.com.academia.services.SocioService", serviceName = "SocioService")
public class SocioServiceImp implements SocioService{
	
	@Autowired
	private SocioBOimp socioBO;
	
	public void setSocioBO(SocioBOimp socioBO) {
		this.socioBO = socioBO;
	}

	@Override
	public String mensaje() {
		// TODO Auto-generated method stub
		return "Exponiendo servicio";
	}
	
	@PostConstruct
	public void init() {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	@Override
	public void add(String nombre) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			socioBO.crearSocio(nombre);
		} catch (BusinessException be) {
			// TODO Auto-generated catch block
			throw new ServiceException();
		}
	}

	public List<SocioDTO> getAll() throws ServiceException {
		// TODO Auto-generated method stub
		List<SocioDTO> sociosDto = new ArrayList<SocioDTO>();
		try {
			sociosDto = socioBO.getAllSocios();
		}catch(BusinessException be) {
			throw new ServiceException();
		}
		return sociosDto;
	}

	public SocioDTO getByName(String nombre) throws ServiceException {
		// TODO Auto-generated method stub
		SocioDTO socioDto;
		try {
			socioDto = socioBO.getSocioByName(nombre);
		} catch (BusinessException be) {
			// TODO Auto-generated catch block
			throw new ServiceException();
		}
		return socioDto;
	}

	public void remuveByName(String nombre) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			socioBO.borrarSocio(nombre);
		} catch (BusinessException be) {
			// TODO Auto-generated catch block
			throw new ServiceException();
		}
	}
	
	@Override
	public void update(String nombre, String nuevoNombre) throws ServiceException{
		// TODO Auto-generated method stub
		try {
			socioBO.actualizarSocio(nombre, nuevoNombre);
		} catch (BusinessException be) {
			// TODO Auto-generated catch block
			throw new ServiceException();
		}
	}
}
