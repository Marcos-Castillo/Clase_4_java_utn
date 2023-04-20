package clase13;

import java.io.*;
import java.util.*;

public class ChatProgram {

    private static final String FILENAME = "chat.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        File file = new File(FILENAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Thread leerMensajesThread = new Thread(() -> {
            while (true) {
                leerArchivo();
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        leerMensajesThread.start();

        while (true) {
            System.out.print("Escribir mensaje (o escribir '##' para leer los mensajes): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("##")) {
                leerArchivo();
            } else {
                escribirArchivo(nombre + ": " + entrada);
            }
        }
    }

    private static void leerArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escribirArchivo(String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, true))) {
            bw.write(mensaje);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
