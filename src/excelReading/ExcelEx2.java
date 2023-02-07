package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File Myfile=new File("C:\\\\Users\\\\user\\\\Downloads\\\\SelinumFiles\\\\16julyEven.xlsx");
		
		Workbook myfile = WorkbookFactory.create(Myfile);
		
		Sheet mysheet = myfile.getSheet("Sheet1");
		
		Row myRow = mysheet.getRow(0);
		
		Cell mycell = myRow.getCell(0);
		
		String Mycellvalue = mycell.getStringCellValue();
		
		System.out.println(Mycellvalue);
		
		
		
		
		
		

	}

}
