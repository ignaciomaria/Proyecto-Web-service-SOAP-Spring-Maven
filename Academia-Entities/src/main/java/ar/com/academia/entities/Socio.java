package ar.com.academia.entities;

public class Socio {
	//Atributos
	
	private Integer numeroDeSocio;
	private String nombreYapellido;
	private String documento;
	private String direccion;
	private Integer telefono;
	private String mail;
	private String fechaDeNacimiento;
	private String sexo;
	private String plan;
	
	
	//Constructor
	public Socio() {}

	public Socio(String nombreYapellido, String documento,
			String direccion, Integer telefono, String mail, String fechaDeNacimiento, String sexo, String plan) {
		super();
		this.nombreYapellido = nombreYapellido;
		this.documento = documento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sexo = sexo;
		this.plan = plan;
	}

	//Getter Setter
	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}


	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}


	public String getNombreYapellido() {
		return nombreYapellido;
	}


	public void setNombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
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


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
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
		
}
