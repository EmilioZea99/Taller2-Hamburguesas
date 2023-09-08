package Modelo;

import java.util.ArrayList;

public class ProductoMenu {
	
	private int precioBase;
	private String nombre;
	
	public ProductoMenu(String nombreP, int precioBaseP) {
		
		nombre=nombreP;
		precioBase=precioBaseP;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
}
