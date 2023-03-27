package clase5;

public class Descuento {
	private double descuento;

	@Override
	public String toString() {
		return "Descuento [descuento=" + descuento + "]";
	}

	public Descuento(double descuento) {
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}
