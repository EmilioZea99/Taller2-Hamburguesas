package consola;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Combo;
import Modelo.ProductoMenu;
import Modelo.Restaurante;
import Modelo.Ingrediente;
import Modelo.Pedido;

public class aplicacion {
	Restaurante restaurante = new Restaurante();
	Pedido ped= new Pedido();
	
	public void mostrarMenu() {
		System.out.println("Seleccione una opcion");
		System.out.println("1. Mostrar el Menu");
		System.out.println("2. Iniciar pedido");
		System.out.println("3. Agregar Producto");
		System.out.println("4. Guardar pedido y factura");
		System.out.println("5. Consultar pedido por id");
		System.out.println("6. Cerrar el programa");
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		
		aplicacion consola = new aplicacion();
		consola.ejecutarCarga();
		consola.ejecutarAplicacion();

	}

	
	public void ejecutarAplicacion() throws FileNotFoundException, IOException {
		Scanner lectura = new Scanner(System.in);
	
		
		
		
		Boolean si = true;
		while(si) {
			mostrarMenu();
			int opcion = lectura.nextInt();
		if (opcion == 1) {
			ejecutarMenu();
	}
		else if(opcion == 2) {
			ejecutarIniciarPedido();
		}
		else if(opcion == 3) {
			
		}
		else if(opcion == 4) {
			
		}
		else if(opcion == 5) {
			
		}
		else if(opcion == 6) {
			si=false;
		}
		}
	}

	private void ejecutarIniciarPedido() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba su nombre");
		String nombre = scan.next();
		System.out.println("Escriba su direccion");
		String direccion = scan.next();
		restaurante.iniciarPedido(nombre, direccion);
		
	}
	
	private void ejecutarMenu() {
		ArrayList<ProductoMenu> p= restaurante.getProductoMenu();
		System.out.println("Menu:");
		for(int i=0;i<p.size();i++) {
			ProductoMenu prin=p.get(i);
			
				String u =prin.getNombre();
				int e= prin.getPrecioBase();
				System.out.println(u+" precio "+e);
	
		}
		System.out.println(" ");
		System.out.println("Combos:");
		ArrayList<Combo> c= restaurante.getCombo();
		for(int i=0;i<c.size();i++) {
			Combo prin=c.get(i);
			
				double u =prin.getDescuento();
				int e= prin.getPrecio();
				String n=prin.getNombreCombo();
				System.out.println(n+" Precio: "+e+" Descuento: "+u+"%");
				
	
		}
		System.out.println(" ");
ArrayList<Ingrediente> in=restaurante.getIngrediente();
		
		
		
		System.out.println("Ingredientes Extra: ");
		for(int i=0;i<in.size();i++) {
			Ingrediente prin=in.get(i);
			
				String u =prin.getNombre();
				int e= prin.getCostoAdicional();
				System.out.println(u+" costo adicional: "+e);
	
		}
	}
	
	private void ejecutarCarga() throws FileNotFoundException, IOException {
		restaurante.cargarInformacionRestaurante();
		
		
	
	}
}