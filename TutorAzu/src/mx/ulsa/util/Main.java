package mx.ulsa.util;

import org.w3c.dom.Text;
public class Main {
	private static String rutaOrigen = "C:\\archivos\\";
	private static String rutaDestino = "\\\\175.1.44.45\\archivos\\destino";
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 7; i++){
			
			TextThread hilo1 = new TextThread(rutaOrigen+"datos\\misdatos.txt", "misdatos"+i+".txt", rutaDestino);
			TextThread hilo3 = new TextThread(rutaOrigen+"datos\\msword.docx", "msword"+i+".docx", rutaDestino);
			TextThread hilo2 = new TextThread(rutaOrigen+"multimedia\\Video 5MB.mp4", "video 5MB"+i+".mp4", rutaDestino);
			hilo1.run();
			hilo2.run();
			hilo3.run();
			//.run();        
		} 
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Tiempo de ejecucion: " + (executionTime/1000) + " segundos.");
		}
	
	}