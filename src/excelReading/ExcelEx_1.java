package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File Myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		
		String Value1 = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Value1);
		
	System.out.println("=====================================================================");
	
	      double Value2 = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(Value2);
		
		    boolean Value3 = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(0).getCell(2).getBooleanCellValue();
		
		System.out.println(Value3);
		
	System.out.println("==============================================================================");
		
 String value4 = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(0).getCell(3).getStringCellValue();
	
	System.out.println(value4);
	
	double value5 = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(0).getCell(4).getNumericCellValue();
	
	System.out.println(value5);
	
	boolean value6 = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(0).getCell(5).getBooleanCellValue();
	System.out.println(value6);

	}

}
