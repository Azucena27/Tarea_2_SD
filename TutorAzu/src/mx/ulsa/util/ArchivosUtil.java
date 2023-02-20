package mx.ulsa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivosUtil {
	//
	//private static String pathOrigen = "archivos\\original.txt";
	//private static String pathOrigen = "archivos\\Invetarios.xlsx";
	private static String pathOrigen = "archivos\\Captura de pantalla_20230201_130735.png";
	private static String pathDestino = "\\\\175.1.59.30\\archivos\\multimedia\\equipo2.png";
	
	private static String pathsOrigen [] = {
			"archivos\\Azucena.txt",
			"archivos\\Reyes.txt"
			};
	private static String pathsDestino [] = {
			"\\\\175.1.41.52\\archivos\\A.txt",
			"\\\\175.1.41.66\\archivos\\R.txt",
			"\\\\175.1.36.159\\archivos\\Azucena.png"};
	
	public ArchivosUtil(String archivoFuente, String archivoDestino) {
		System.out.println("Ruta origen: " + archivoFuente);
		System.out.println("Ruta destino: " + archivoDestino);

		try {
			File archivoEntreda = new File(archivoFuente);
			File archivoSalida = new File(archivoDestino);

			FileInputStream in = new FileInputStream(archivoEntreda);
			FileOutputStream out = new FileOutputStream(archivoSalida);

			int c;
			while ((c = in.read()) != -1)
				out.write(c);

			in.close();
			out.close();
			System.out.println("!! Archivo copiado exitosamente !!");
		} catch (IOException e) {
			System.err.println("Error de entrada/salida...");
                        e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new ArchivosUtil(pathOrigen, pathDestino);
		//new ArchivosUtil(pathsOrigen[0], pathsDestino[1]);
		/*for(int i=0; i<3; i++) {
			new ArchivosUtil(pathsOrigen[i], pathsDestino[i]);
		}*/
		/*
		if (args.length == 2)
			new ArchivosUtil(args[0], args[1]);
		else
			System.out.println("Error, ingrese dos parametros");
		*/
	}

}
