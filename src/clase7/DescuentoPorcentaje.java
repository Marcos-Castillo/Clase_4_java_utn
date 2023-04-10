package clase7;

public class DescuentoPorcentaje extends Descuento{
	

	public DescuentoPorcentaje(double descuento) {
		super(descuento);
        
		
	}

	@Override
	public double calcular(double total) {

		return total*getDescuento()/100;
	}


	

}
