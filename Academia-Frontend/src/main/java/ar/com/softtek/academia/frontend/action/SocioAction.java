package ar.com.softtek.academia.frontend.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.dto.SocioDTO;
import ar.com.academia.services.SocioService;


@SuppressWarnings("serial")
public class SocioAction extends ActionSupport{

	private SocioService socioService;

	private String nombreSocio;
	private String nuevoNombre;
	private String documento;
	private String direccion;
	private String telefono;
	private String mail;
	private String fechaDeNacimiento;
	private String sexo;
	private String plan;
	private List<SocioDTO> socios = new ArrayList<SocioDTO>();
	
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
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public List<SocioDTO> getSocios() {
		return socios;
	}

	public void setSocios(List<SocioDTO> socios) {
		this.socios = socios;
	}
	
	//----------------------------------------------------------------------------
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "SUCCESS";
	}
	
	public String addSocio() throws Exception {
		this.socioService.add(this.getNombreSocio(), this.getDocumento(), 
							this.getDireccion(), Integer.parseInt(this.getTelefono()), 
							this.getMail(), this.getFechaDeNacimiento(), this.getSexo(), this.getPlan());
		return "SUCCESS";
	}
	
	public String modSocio() throws Exception {
		this.socioService.update(this.getNombreSocio(), this.getNuevoNombre());
		return "SUCCESS";
	}
	
	public String delSocio() throws Exception {
		this.socioService.remuveByName(this.nombreSocio);
		return "SUCCESS";
	}
	
	public String getAll() throws Exception {
		this.socios = socioService.getAll();
		return "SUCCESS";
	}
}
