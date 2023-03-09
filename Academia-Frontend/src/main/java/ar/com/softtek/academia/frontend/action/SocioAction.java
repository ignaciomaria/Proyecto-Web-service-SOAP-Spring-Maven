package ar.com.softtek.academia.frontend.action;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.services.SocioService;

public class SocioAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SocioService socioService;
	
	public SocioService getSocioService() {
		return socioService;
	}

	public void setSocioService(SocioService socioService) {
		this.socioService = socioService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private String nombreSocio;
	
	private String mensaje;
	
	private String prueba;
	
	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}

	//Constructor 
	public SocioAction() {}
	


	//Getter Setter
	public String getNombreSocio() {
		return nombreSocio;
	}

	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		//this.setMensaje("El nombre del socio es: "+this.getNombreSocio());
		this.socioService.add(this.getNombreSocio());
		return "SUCCESS";
	}
	
}
