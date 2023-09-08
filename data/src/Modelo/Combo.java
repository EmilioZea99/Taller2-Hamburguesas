package Modelo;

import java.util.ArrayList;
import Modelo.ProductoMenu;

public class Combo {
	
	private double descuento;
	private String nombreCombo;
	private double precio;
	private ArrayList<ProductoMenu> productos;
	
	
	
	public Combo(String nombreP, double descuentoP) {
		descuento= (100-descuentoP)*0.01;
		nombreCombo=nombreP;
		this.productos = new ArrayList<ProductoMenu>();
		
	}
	
	public void agregarItemACombo(ProductoMenu prod) {
		productos.add(prod)	;
		precio=precio+prod.getPrecioBase();
		
		
	}
	public int getPrecio() {
		double precioFinal =precio*descuento;
		return (int)precioFinal;
	}
	
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public String getNombreCombo() {
		return nombreCombo;
	}
	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}
	
}
