//leerExcel("4_ejercicioSIMD-Ventas.xlsx", "PPM01")
//leerExcel("4_ejercicioSIMD-Ventas.xlsx", "EQP01")

//

package mx.ulsa.util;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static void main(String[] args) {
		
		ExcelUtil eu = new ExcelUtil();
		//Hilo procesoUno = eu.new Hilo("PROCESADOR UNO **", "4_ejercicioSIMD-Ventas.xls", "PPM01");
		//Hilo procesoDos= eu.new Hilo("PROCESADOR UNO **", "4_ejercicioSIMD-Ventas.xls", "EQP01");
		//procUno.start();
		//ProcDos.start();
		
		
	}
	
	public static void leerExcel(String nombreArchivo, String categoria) {
		
		String nombreArchivoS = categoria+".xlsx";
		String rutaArchivo = "archivos\\" + nombreArchivo;
		String hoja = "Hoja1";
		
		try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
			// leer archivo excel
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			//obtener la hoja que se va leer
			XSSFSheet sheet = worbook.getSheetAt(0);
			//obtener todas las filas de la hoja excel
			Iterator<Row> rowIterator = sheet.iterator();

			Row row;
			// se recorre cada fila hasta el final
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				//se obtiene las celdas por fila
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				//se recorre cada celda
				while (cellIterator.hasNext()) {
					// se obtiene la celda en espec�fico y se la imprime
					cell = cellIterator.next();
					System.out.print(cell.getStringCellValue()+" | ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
	