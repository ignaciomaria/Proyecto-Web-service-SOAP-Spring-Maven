package ar.com.softtek.academia.frontend.action;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.services.SocioService;


@SuppressWarnings("serial")
public class SocioAction extends ActionSupport{

	private SocioService socioService;

	private String nombreSocio;
	
	private String nuevoNombre;
	
	//Constructor 
	public SocioAction() {}
	
	//Getter Setter
	public SocioService getSocioService() {
		return socioService;
	}

	public void setSocioService(SocioService socioService) {
		this.socioService = socioService;
	}
	
	public String getNombreSocio() {
		return nombreSocio;
	}

	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}
	
	public String getNuevoNombre() {
		return nuevoNombre;
	}

	public void setNuevoNombre(String nuevoNombre) {
		this.nuevoNombre = nuevoNombre;
	}

	//----------------------------------------------------------------------------
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "SUCCESS";
	}
	
	public String addSocio() throws Exception {
		this.socioService.add(this.getNombreSocio(), null, null, null, null, null, null, null);
		return "SUCCESS";
	}
	
	public String modSocio() throws Exception {
		this.socioService.update(this.getNombreSocio(), this.getNuevoNombre());
		return "SUCCESS";
	}
	
	public String delSocio()throws Exception {
		this.socioService.remuveByName(this.nombreSocio);
		return "SUCCESS";
	}
}
