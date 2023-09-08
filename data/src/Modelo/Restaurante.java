package Modelo;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Modelo.Pedido;
import procesamiento.LoaderRestaurante;
import Modelo.Pedido;

public class Restaurante {
	LoaderRestaurante loaderRestaurante = new LoaderRestaurante();
	Pedido ped=new Pedido();
	
	
	private ArrayList<ProductoMenu> productosMenu;
	private ArrayList<Combo> combo;
	private ArrayList<Ingrediente> ingrediente;
	private ArrayList<Pedido> pedido;
	
	public void cargarInformacionRestaurante() throws FileNotFoundException, IOException{
		cargarMenu("./data/menu.txt");
		cargarCombo("./data/combos.txt");
		cargarIngredientes("./data/ingredientes.txt");
	}
	
	public void iniciarPedido(String nombre,String direccion) {
		ped.iniciarPedido(nombre, direccion);
		
	}
	
	
	private void cargarMenu(String ArchivoIngredientes) throws FileNotFoundException, IOException {
			this.productosMenu= loaderRestaurante.cargarMenu(ArchivoIngredientes);
			
		}
	public void cargarCombo(String Archivo) throws FileNotFoundException, IOException {
		ArrayList<ProductoMenu> x= getProductoMenu(); 
		this.combo = loaderRestaurante.cargarCombo(Archivo,x );
	}
	
	private void cargarIngredientes(String Archivo) throws  FileNotFoundException, IOException{
		
		this.ingrediente = loaderRestaurante.cargarIngredientes(Archivo);
		
	}
	
	public ArrayList<Combo> getCombo(){
		return combo;
	}
	
	public ArrayList<ProductoMenu> getProductoMenu() {
		return productosMenu;
	}



	public ArrayList<Ingrediente> getIngrediente() {
		return ingrediente;
	}

	}



	
	
	

