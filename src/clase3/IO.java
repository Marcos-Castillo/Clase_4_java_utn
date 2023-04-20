package clase3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IO {
			
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
					
			public static List<Producto> productosCsv() {
				String file="/home/marcos/Documentos/productos.csv";
				List<Producto> data = new ArrayList<>();
				String line;
				
				try {
					BufferedReader reader = new BufferedReader(new FileReader(file));
					while ((line = reader.readLine()) != null) {
						//System.out.println(line.split(";")[0]+" "+line.split(";")[1]);
						data.add(new Producto(line.split(",")[0],Integer.parseInt(line.split(",")[1])));
					
					}
					reader.close();
				} catch (FileNotFoundException e) {
					System.out.println("File not found in specifid path " + file);
				} catch (IOException e) {
					System.out.println("Error while reading the xml file");
				}
				return data;
			}
}
