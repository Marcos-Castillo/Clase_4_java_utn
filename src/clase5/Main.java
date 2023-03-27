package clase5;


import java.util.List;

public class Main {
	static List<Producto> listaProd = IO.productosCsv();

	public static void main(String[] args) {
		
		//inicializar productos
		System.out.println("##########################");
		System.out.println("Estos son los productos disponibles:");
		System.out.println(listaProd);
		System.out.println("##########################");
		Carrito carrito1 = new Carrito();
		boolean var=true;
		do {
			
		System.out.println("ingrse el id del producto q desea o si desea salir presione una letra");
		
		try {
			Integer numero =Integer.parseInt(IO.lector());
			System.out.println("usted seleciono"+ listaProd.get(--numero));
			System.out.println("cuantos quiere");
			Integer cantidad =Integer.parseInt(IO.lector());
			carrito1.comprar(cantidad,listaProd.get(numero));
			
		} catch (Exception e) {
			var= false;
		}
		
		}while(var);
		System.out.println("##########################");
		System.out.println("##########################");
		System.out.println(carrito1.toString());
		
		

	}

}
