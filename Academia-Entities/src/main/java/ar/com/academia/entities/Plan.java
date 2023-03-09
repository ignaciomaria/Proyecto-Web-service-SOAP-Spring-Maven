package ar.com.academia.entities;


public class Plan {
	//Atributos
	
	private Integer id;
	private String descripcion;
	private Socio socio;
	
	//Constructor
	public Plan() {}
	
	public Plan(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Getter Setter
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
}
