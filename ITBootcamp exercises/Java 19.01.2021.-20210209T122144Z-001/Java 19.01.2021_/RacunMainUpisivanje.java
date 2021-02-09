package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RacunMainUpisivanje {

	public static void main(String[] args) throws IOException {
		File fajl = new File("data/domaci1.xlsx");
		FileOutputStream fos = new FileOutputStream(fajl);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet list1 = wb.createSheet("DomaciUpisivanje");
		
		Racun stanje01 = new Racun("111");
		
//		XSSFRow red1 = list1.createRow(0);
//		XSSFCell polje0 = red1.createCell(0);
//		XSSFCell polje1 = red1.createCell(1);
//		XSSFCell polje2 = red1.createCell(2);
//		XSSFCell polje3 = red1.createCell(3);
//		polje0.setCellValue("Broj Racuna");
//		polje1.setCellValue("Stanje");
//		polje2.setCellValue("Dodavanje");
//		polje3.setCellValue("Oduzimanje");  
		
//hteo sam da dodam i iznad polja da pise sta je sta ali su string a ovde imam i numeraciju pa nije hteo da ocita :(
		
		for (int i = 0; i < 1; i++) {
			XSSFRow red = list1.createRow(i);
			
			XSSFCell polja1 = red.createCell(0); //kolona
			XSSFCell polja2 = red.createCell(1);
			XSSFCell polja3 = red.createCell(2);
			XSSFCell polja4 = red.createCell(3);
			
			polja1.setCellValue(stanje01.getBrRacuna());
			polja2.setCellValue(stanje01.getStanje());
			polja3.setCellValue(stanje01.dodavanje(100));
			polja4.setCellValue(stanje01.oduzimanje(55));
		}
		wb.write(fos);
		wb.close();
		
		
	}

}
