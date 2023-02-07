package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		
		String MYCELL = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();

		System.out.println(MYCELL);
		
	}
	//C:\Users\user\eclipse-workspace\16july_evening_selenium
}
