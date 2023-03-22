package clase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase4ejer1 {

	public static String lector() {
		String aux = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			aux = br.readLine();
		} catch (Exception e) {
		}
		return aux;
	}

	public static Integer lectorEnteros() {

		Integer aux2 = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			aux2 = Integer.parseInt(br.readLine());

		} catch (Exception e) {
			boolean var = true;
			do {

				System.out.println("debe ingresar un entero");
				try {
					aux2 = Integer.parseInt(br.readLine());
					var = false;

				} catch (NumberFormatException | IOException e1) {

				}
			} while (var);

		} finally {

		}

		return aux2;
	}

	public static int[] ordenar(int a, int b, int c, char letra) {
		int[] vect = { 0, 0, 0 };
		if (letra == 'a' || letra == 'd') {

			if (b <= a && b <= c) {
				vect[0] = b;
				if (a < c) {
					vect[1] = a;
					vect[2] = c;
				} else {
					vect[2] = a;
					vect[1] = c;
				}

			} else if (a <= b && a <= c) {
				vect[0] = a;
				if (b < c) {
					vect[1] = b;
					vect[2] = c;
				} else {
					vect[2] = b;
					vect[1] = c;
				}
			} else {
				vect[0] = c;
				if (a < b) {
					vect[1] = a;
					vect[2] = b;
				} else {
					vect[2] = a;
					vect[1] = b;
				}
			}
			if (letra == 'd') {
				int aux = vect[2];
				vect[2] = vect[0];
				vect[0] = aux;
			}
		}
		return vect;
	}

	public static void main(String[] args) {
		System.out.println("Ejercicio 1");

		int a = 0;
		int b = 0;
		int c = 0;
		char letra = 'a';
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
			letra = args[3].charAt(0);
		} catch (Exception e) {
			System.out.println("Main sin parametros correctos");
			System.out.println("ingrese manualmente");
			System.out.println("entrero 1");
			a = lectorEnteros();
			System.out.println("entrero 2");
			b = lectorEnteros();
			System.out.println("entrero 3");
			c = lectorEnteros();
			System.out.println("Para ordenarlos acendente presione 'a' y desendente 'd'");
			letra = lector().charAt(0);
		}
		System.out.println("Se ordenaron segun '" + letra + "' : acendente 'a' y desendente 'd'");
		int[] ordenado = ordenar(a, b, c, letra);
		System.out.println(ordenado[0]);
		System.out.println(ordenado[1]);
		System.out.println(ordenado[2]);

		System.exit(1);
	}

}
