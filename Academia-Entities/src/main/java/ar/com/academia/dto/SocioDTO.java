package ar.com.academia.dto;

public class SocioDTO {
	
	//Atributos
	private String nombreYapellido;
	private String sexo;
	private String direccion;
	private Integer telefono;
	private String mail;
	private String fechaDeNacimiento;
	
	//Constructor
	public SocioDTO() {}
	
	//Getter Setter
	public String getNombreYapellido() {
		return nombreYapellido;
	}
	
	public void setNombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	
	
}
