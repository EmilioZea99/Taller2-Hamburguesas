package Modelo;

public class Ingrediente {

	private String nombre;
	private int costoAdicional;
	
	
	
	public Ingrediente(String nombre2, int precio) {
		this.nombre=nombre2;
		this.costoAdicional=precio;
	}


	public String getNombre() {
		return nombre;
	}
	
	

	public int getCostoAdicional() {
		return costoAdicional;
	}
	
	
	
	
	
	
}
