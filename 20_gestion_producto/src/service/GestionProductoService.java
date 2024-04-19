package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GestionProductoService {
	/*Programa para gestión de productos.

	Cada producto tendrá: nombre, precio, categoria

	La lógica de negocio, expondrá los siguientes métodos:

	-eliminarPorCategoria: elimina de la lista aquellos productos que pertenezcan a la categoría indicada

	-bajarPrecio: Baja el precio de todos productos en el porcentaje indicado

	-subirPrecioCategoria: Sube el precio a todos los productos de la categoría indicada, en el porcentaje indicado

	-obtenerProductos: Devuelve la lista de productos existentes
	-agregarProducto: Añade el producto recibido 
	-ordenarPprPrecio*/
	
	List<ProductoBean> productos = new ArrayList<>();
	
	public void altaProducto(ProductoBean producto) {
		
		productos.add(producto);
		
	}
	

	public void eliminarPorCategoria(ProductoBean categoria) {
		
		productos.removeIf(n->n.getCategoria().equals(categoria));
		
	}
	
	public void  bajarElPrecio(int porcentaje) {
		
		productos.forEach(p->p.setPrecio(p.getPrecio()*((100-porcentaje)/100)));
		
		
		
		
		
	}
	
	public void subirElPrecio(int porcentaje) {
		productos.forEach(p->p.setPrecio(p.getPrecio()*((100+porcentaje)/100)));
		
		
	}
	
	public List<ProductoBean> obtenerProductos(){
		
		return productos;
		
		
	}
	
	public void ordenarPorPrecio(double precio) { 
		//nums.sort((a,b)->Double.compare(a, b));
		productos.sort((a,b)->Double.compare(a.getPrecio(),b.getPrecio()));
		
	}
}

