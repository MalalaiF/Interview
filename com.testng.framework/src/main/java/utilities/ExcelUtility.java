package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	// 1. setting the path for the computer and excel file
	public static String excelPath = System.getProperty("user.dir") + "/src/test/resources/InputData/DataInput.xlsx";

	// 2. creating an instance of Workbook
	public static Workbook book;
	// 3. creating an instance of Sheet
	public static Sheet sheet;

	public static Object[][] getData(String sheetName) {

		try {
			FileInputStream file = new FileInputStream(excelPath);

			book = WorkbookFactory.create(file);
			
			sheet = book.getSheet(sheetName);
			
			Object data[][]= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					data[i][j] = sheet.getRow(i+1).getCell(j).toString();
					
				}
				
			} 
			return data;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (InvalidFormatException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

		return null;

	}
}
