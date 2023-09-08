package Modelo;

public class Pedido {
private int numeroDePedidos;
private int idDelPedido;
private String nombreCliente;
private String direccionCliente;

public void iniciarPedido(String nombreClienteP, String direccionClienteP) {
	this.nombreCliente=nombreClienteP;
	this.direccionCliente=direccionClienteP;

}
public String getNombreCliente() {
	return nombreCliente;
}

public String getDireccionCliente() {
	return direccionCliente;
}

public int getIdDelPedido() {
	return idDelPedido;
}
public void agregarProducto(Producto nuevoItem) {
	
}

}
