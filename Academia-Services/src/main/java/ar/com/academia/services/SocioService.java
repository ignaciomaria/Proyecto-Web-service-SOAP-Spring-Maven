package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.exceptions.ServiceException;

@WebService(name = "Socio")
public interface SocioService {
	
	@WebMethod(operationName = "Msj")
	@WebResult(name = "MsjResult")
	public String mensaje();
	
	
	@WebMethod(operationName = "Add")
	@WebResult(name = "AddResult")
	public void add(@WebParam(name = "Nombre") String nombre ) throws ServiceException;
	
	
	@WebMethod(operationName = "GetAll")
	@WebResult(name = "GetAllResult")
	public List<SocioDTO> getAll() throws ServiceException;
	
	
	@WebMethod(operationName = "GetByName")
	@WebResult(name = "GetByNameResult")
	public SocioDTO getByName(@WebParam(name = "Nombre") String nombre) throws ServiceException;
	
	@WebMethod(operationName = "Update")
	@WebResult(name = "UpdateResult")
	public void update(@WebParam(name = "Nombre") String nombre, @WebParam(name = "NuevoNombre") String nuevoNombre) throws ServiceException;
	
	@WebMethod(operationName = "RemuveByName")
	@WebResult(name = "RemuveByNameResult")
	public void remuveByName(@WebParam(name = "Nombre") String nombre) throws ServiceException;
	

}
