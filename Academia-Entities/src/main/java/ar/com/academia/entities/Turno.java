package ar.com.academia.entities;

import java.util.Date;

public class Turno {
	//Atributos
	
	private Integer id;
	private Date fechaYHora;
	private String prestacion;
	private String especialista;
	
	
	private Socio socio;
		
	//Constructor
	public Turno() {}
	
	public Turno(Integer id, Date fechaYHora, String prestacion, String especialista) {
		this.id = id;
		this.fechaYHora = fechaYHora;
		this.prestacion = prestacion;
		this.especialista = especialista;
	}
	
	//Getter Setter
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(Date fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public String getPrestacion() {
		return prestacion;
	}

	public void setPrestacion(String prestacion) {
		this.prestacion = prestacion;
	}

	public String getEspecialista() {
		return especialista;
	}

	public void setEspecialista(String especialista) {
		this.especialista = especialista;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
}
