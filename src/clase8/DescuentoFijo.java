package clase8;

public class DescuentoFijo extends Descuento{

	public DescuentoFijo(double descuento) {
		super(descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcular(double total) {
		
		return super.getDescuento();
	}

}
