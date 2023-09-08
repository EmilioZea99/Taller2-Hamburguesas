package procesamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import Modelo.Combo;
import Modelo.ProductoMenu;
import Modelo.Ingrediente;


public class LoaderRestaurante {
	public static ArrayList<ProductoMenu> cargarMenu(String nombreArch)throws FileNotFoundException, IOException {
		ArrayList<ProductoMenu> productosMenu = new ArrayList<ProductoMenu>();
		BufferedReader br = new BufferedReader(new FileReader(nombreArch));
		String linea = br.readLine(); 
		while (linea != null) {
			String[] partes = linea.split(";");
			String nombre =partes[0];
			int precio = Integer.parseInt(partes[1]);
			ProductoMenu nuevoProducto = new ProductoMenu(nombre,precio);
			productosMenu.add( nuevoProducto );
			linea = br.readLine();
			
		}
		br.close();
		
		return productosMenu;
	}
	public static ArrayList<Combo> cargarCombo(String Arch, ArrayList<ProductoMenu> productos)throws FileNotFoundException, IOException{
		ArrayList<Combo> combos = new ArrayList<Combo>();
		BufferedReader br = new BufferedReader(new FileReader(Arch));
		String linea = br.readLine();
		while (linea != null) {
			String[] partes = linea.split(";");
			double porcentaje = Double.parseDouble( partes[1].substring(0, partes[1].length()-1));
			Combo nuevoCombo = new Combo(partes[0], porcentaje); 
			for (int i = 2; i < partes.length; i++)
			{
				for (ProductoMenu j:productos)
				{
					if (j.getNombre().equals(partes[i]))
					{
						nuevoCombo.agregarItemACombo(j);
					}
				}
				    
			}
			
			combos.add( nuevoCombo );
			linea = br.readLine();
			
		}
		br.close();
		return combos;
	}
	public static ArrayList<Ingrediente> cargarIngredientes(String Arch)throws FileNotFoundException, IOException{
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		BufferedReader br = new BufferedReader(new FileReader(Arch));
		String linea = br.readLine(); 
		while (linea != null) {
			String[] partes = linea.split(";");
			String nombre =partes[0];
			int precio = Integer.parseInt(partes[1]);
			Ingrediente nuevoIngrediente = new Ingrediente(nombre,precio);
			ingredientes.add( nuevoIngrediente );
			linea = br.readLine();
			
		}
		br.close();
		
		return ingredientes;
	}
	
}
