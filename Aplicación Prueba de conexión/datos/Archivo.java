package datos;

public class Archivo {
	
	private String nombre;
	private String ruta;
	private Boolean oculto;
	
	public Archivo()
	{
		this.nombre = null;
		this.ruta = null;
		this.oculto = false;
	}
	
	

	public Archivo(String nombre, String ruta, Boolean oculto) {
		super();
		this.nombre = nombre;
		this.ruta = ruta;
		this.oculto = oculto;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Boolean getOculto() {
		return oculto;
	}

	public void setOculto(Boolean oculto) {
		this.oculto = oculto;
	}	

	
	
}


