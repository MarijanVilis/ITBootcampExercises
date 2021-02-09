package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RacunMainCitanje {

public static void main(String[] args) throws IOException {
		
		File fajl = new File("data/domaci1.xlsx");
		FileInputStream fis = new FileInputStream(fajl);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("DomaciUpisivanje"); //iz kog sheeta cita
		
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			
			XSSFCell prviRed = row.getCell(0);
			XSSFCell drugiRed = row.getCell(1);
			XSSFCell treciRed = row.getCell(2);
			XSSFCell cetvrtiRed = row.getCell(3);
		
			
			System.out.print(prviRed.getStringCellValue() + ", ");
			System.out.print(drugiRed.getNumericCellValue() + ", ");
			System.out.print(treciRed.getNumericCellValue() + ", ");
			System.out.println(cetvrtiRed.getNumericCellValue());
			
		}
		fis.close();
		wb.close();
	}

}

