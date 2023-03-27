package clase5;

public class Producto {
	
	private static int idProd=0;
	private int id=0;
	private String nombre;
	private double precio;
	
	public  Producto() {
		
	}
	public Producto(String nombre,double precio) {
		Producto.idProd++;
		this.id=idProd;
		this.nombre=nombre;
		this.precio=precio;
	}

	public int getId() {
		return id;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "\n id=" + id + ", nombre=" + nombre + ", precio=" + precio ;
	} 

}
