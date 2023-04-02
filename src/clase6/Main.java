package clase6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		
		double resultado=0;
		
		resultado=calc.multiplicar(80, 3); // 240
		System.out.println(resultado);
		resultado=calc.dividir(calc.sumar(150,180), 3); // 110
		System.out.println(resultado);
		resultado=calc.multiplicar(calc.restar(90,50),15);// !=605
		System.out.println(resultado);
		resultado=calc.multiplicar(calc.sumar(70, 40),25);// !=2700
		System.out.println(resultado);
	}

}
