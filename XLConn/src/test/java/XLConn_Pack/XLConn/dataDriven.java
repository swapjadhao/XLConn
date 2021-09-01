package XLConn_Pack.XLConn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream Fis= new FileInputStream("E:\\Swapnil\\Automation\\XLConn\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		int SheetCount =workbook.getNumberOfSheets();
		
		for(int i=0;i<SheetCount;i++)
		{
			String SheetName=workbook.getSheetName(i);
			
			
			if(SheetName.equalsIgnoreCase("TestData"))
			{
				XSSFSheet Sheet=workbook.getSheetAt(i);
				
				Iterator<Row> Rows=Sheet.iterator();
				Row firstRow= Rows.next();
				Iterator<Cell> Ce=firstRow.iterator();
				int k=0;
				int column=0;
				
				while(Ce.hasNext())
				{
					Cell value=Ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
					{
						
						column=k;
					}
					k++;
					
				}
				System.out.println(column);
			}
		}
		
		

	}

}
