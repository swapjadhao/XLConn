package SQLConnection;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLConnection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileInputStream fis = new FileInputStream("E:\\\\Swapnil\\\\DummyAuto.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(0);
            //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
            //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
Row row = sheet.getRow(1);
Cell cell = row.getCell(1);
           	System.out.println(cell);
System.out.println(sheet.getRow(2).getCell(2));
//String cellval = cell.getStringCellValue();
//System.out.println(cellval);



FileInputStream fis1= new FileInputStream("E:\\\\Swapnil\\\\DummyAuto.xlsx");
XSSFWorkbook WB= new XSSFWorkbook(fis1);
XSSFSheet Sh= WB.getSheetAt(0);
Row row1= Sh.getRow(3);
Cell col= row1.getCell(1);
System.out.println(col);

		
		
		
		
	}

}
