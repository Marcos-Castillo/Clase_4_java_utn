package clase4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase4ejer2 {
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

	private static Integer[] readFile(String file) {
		// StringBuffer fileData = new StringBuffer();
		Integer[] data = new Integer[10];
		String line;
		int i = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				data[i] = Integer.parseInt(line);
				i++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found in specifid path " + file);
		} catch (IOException e) {
			System.out.println("Error while reading the xml file");
		}
		return data;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String file = "/home/marcos/Documentos/textardo.txt";
		char oper = 'm';
		int resultado = 0;
		boolean bandera = true;
		if (args.length > 0) {
			file = (args[0]).toString();
		}
		System.out.println("File: " + file);
		do {
			System.out.println("para multiplicar los numeros presione 'm' y para sumar 's'");
			oper = lector().charAt(0);

		} while (!((oper == 's') || (oper == 'm')));
		Integer[] x = readFile(file);
		for (Integer cadena : x) {
			if (cadena != null) {
				System.out.println(cadena);
				if (bandera) {
					resultado = cadena;
					bandera = false;

				} else {
					if ('s' == oper) {
						resultado += cadena;
					} else if ('m' == oper) {
						resultado *= cadena;
					}
				}

			}
		}
		System.out.println(resultado);
	}// main
}