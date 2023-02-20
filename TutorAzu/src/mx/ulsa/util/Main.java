package mx.ulsa.util;

import org.w3c.dom.Text;
public class Main {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 7; i++){
			
			TextThread hilo1 = new TextThread("C:\\archivos\\datos\\misdatos.txt", "misdatos"+i+".txt", "\\\\175.1.43.125\\archivos\\destino");
			TextThread hilo3 = new TextThread("C:\\archivos\\datos\\msword.docx", "msword"+i+".docx", "\\\\175.1.43.125\\archivos\\destino");
			TextThread hilo2 = new TextThread("C:\\archivos\\multimedia\\Video 5MB.mp4", "video 5MB"+i+".mp4", "\\\\175.1.43.125\\archivos\\destino");
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