package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelEx_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File myfile=new File("C:\\\\Users\\\\user\\\\Downloads\\\\SelinumFiles\\\\16julyEven.xlsx");
		
		Workbook Myworkbook = WorkbookFactory.create(myfile);
		
		Sheet MySheet = Myworkbook.getSheet("Sheet2");
		
		Row MyRow = MySheet.getRow(0);
		
		Cell Mycell = MyRow.getCell(0);
		
		 CellType celltype = Mycell.getCellType();
		
		System.out.println(celltype);
		
System.out.println("================================================================================");

Workbook Myworkbook1 = WorkbookFactory.create(myfile);

Sheet MySheet2 = Myworkbook1.getSheet("Sheet2");

Row MyRow2 = MySheet2.getRow(0);

Cell Mycell1 = MyRow2.getCell(1);

CellType celltype1 = Mycell1.getCellType();

System.out.println(celltype1);

System.out.println("==============================================================================");

Workbook Myworkbook3 = WorkbookFactory.create(myfile);

Sheet mySheet3 = Myworkbook3.getSheet("Sheet2");

Row myrow3 = mySheet3.getRow(0);

Cell Mycell3 = myrow3.getCell(2);

CellType Mycelltype3 = Mycell3.getCellType();

System.out.println(Mycelltype3);



















		
		
		
		
		

	}

}
