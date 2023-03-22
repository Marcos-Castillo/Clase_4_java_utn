package clase4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase4ejer3 {
	private static String saveFile(String file, String data) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(data);
			writer.close();
			System.out.println("Frase guardada en " + file);
		} catch (Exception e) {
			System.out.println("Fallo en almacenar el archivo.");
		}
		return data;
	}

	private static String readFile(String file) {

		String data = "";
		String line;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				data += "\n" + line.toLowerCase();

			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Fallo en lectura del archivo " + file);
		}

		return data;
	}

	public static String codificar(String texto, int desplazamiento) {

		String abecedario = "abcdefghijklmnñopqrstuvwxyz .,;áéíóú";
		String egreso = "";
		for (int i = 0; i < texto.length(); i++) {
			int temp = abecedario.indexOf(texto.charAt(i)) + desplazamiento;
			if (temp < 0) {
				temp += abecedario.length();
			}
			if (temp > abecedario.length()) {
				temp -= abecedario.length();
			}
			egreso += abecedario.charAt(temp);
		}
		return egreso;
	}

	public static String lector() {
		String aux = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			aux = br.readLine();
		} catch (Exception e) {
		}
		return aux.toLowerCase();
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

	public static void main(String[] args) {
		String ingreso = "bc";
		int desplazamiento = 2;
		char clave = 'c';
		System.out.println("Frase a codificar o decofificar");

		ingreso = readFile("/home/marcos/Documentos/ingreso.txt");
		System.out.println("Ingrese desplazamiento");
		desplazamiento = lectorEnteros();

		do {
			System.out.println("Ingrese la letra 'c' para codifificar y 'd' decofificar");
			clave = lector().charAt(0);
		} while (!((clave == 'c') || (clave == 'd')));
		if (clave == 'd') {
			desplazamiento = -(desplazamiento);
		}

		saveFile("/home/marcos/Documentos/Egreso.txt", codificar(ingreso, desplazamiento));

	}

}
