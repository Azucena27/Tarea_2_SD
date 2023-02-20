package mx.ulsa.util;

import java.io.*;

public class CompartirArchivos extends Thread {
	private String nombreCarpeta1 = "datos";
	private String nombreCarpeta2 = "multimedia";
	private String rutaArchivo1 = "archivos\\" + nombreCarpeta1;
	private String rutaArchivo2 = "archivos\\" + nombreCarpeta2;
	private String ip;

	public CompartirArchivos() {

	}
/*
	public void run() {
		File sourceFile1 = new File("archivos\\multimedia\\Audio 2MB.mp3");
		File sourceFile2 = new File("archivos\\datos\\misdatos.txt");
		File destinationDirectory = new File("archivos\\destino");
		File destinationFile1 = new File(destinationDirectory, "Audio 2MB.mp3");
		File destinationFile2 = new File(destinationDirectory, "misdatos.txt");
		try (InputStream in = new FileInputStream(sourceFile1);
				OutputStream out = new FileOutputStream(destinationFile1)) {
			int bytes;
			byte[] buffer = new byte[1024];
			while ((bytes = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (InputStream in = new FileInputStream(sourceFile2);
				OutputStream out = new FileOutputStream(destinationFile2)) {
			int bytes;
			byte[] buffer = new byte[1024];
			while ((bytes = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		CompartirArchivos prueba = new CompartirArchivos();
		prueba.run();
	}*/
}