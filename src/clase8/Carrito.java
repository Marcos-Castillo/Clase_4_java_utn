package clase8;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private List<ItemCarrito> listaItems;
	private Descuento descuento;
	
	public Carrito (){
		this.descuento= new Descuento(0.0);
		this.listaItems= new ArrayList<>();
	}
	
	public List<ItemCarrito> getListaItems() {
		return listaItems;
	}
	public void setListaItems(ItemCarrito item) {
		this.listaItems.add(item);
	}
	public Descuento getDescuento() {
		return descuento;
	}
	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	public void comprar(int cantidad, Producto producto) {
		ItemCarrito item = new ItemCarrito(cantidad,producto);
		this.listaItems.add(item);
	}
	public double precioFinal() {
		double total=0.0;
		for(ItemCarrito item :listaItems) {
			total+= item.getCantidad()*item.getProducto().getPrecio();
		}
		return total-descuento.calcular(total);
	}
	
	public void tipoDescuento(String tipo,Double valor) {
		switch (tipo) {
		case "a": {
			descuento = new DescuentoPorcentaje(valor);
			break;
		}
		case "b": {
			descuento = new DescuentoPorcentajeConTope(valor);
			break;
		}
		case "c": {
			descuento = new DescuentoFijo(valor);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
	}
	@Override
	public String toString() {
		return "Carrito [\nlistaItems=\n" + listaItems.toString() + ", \n descuento=" + descuento.toString() + ""
				+ "\n] Precio total: "+precioFinal();
	}
	
	
}
