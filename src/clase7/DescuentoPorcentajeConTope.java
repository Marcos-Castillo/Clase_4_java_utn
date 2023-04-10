package clase7;

public class DescuentoPorcentajeConTope extends Descuento{
	private double topeDescuento = 50;

	public DescuentoPorcentajeConTope(double descuento) {
		super(descuento);
        if(descuento>topeDescuento) {
        	super.setDescuento(topeDescuento);	
		}
		
	}

	public double getTopeDescuento() {
		return topeDescuento;
	}

	public void setTopeDescuento(double topeDescuento) {
		this.topeDescuento = topeDescuento;
	}

	@Override
	public double calcular(double total) {

		return total*getDescuento()/100;
	}


	

}
