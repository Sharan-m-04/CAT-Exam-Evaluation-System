package utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String path, String sheetName) throws Exception {
		workbook = new XSSFWorkbook(path);
		sheet = workbook.getSheet(sheetName);
	}
	public static void getCellData(int row, int col) throws IOException{
		DataFormatter format = new DataFormatter();
		Object value = format.formatCellValue(sheet.getRow(row).getCell(col));
		System.out.println(value);		
	}
	//TODO: Row count not working
	public static int getRowCount() throws Exception {
		int rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;
	}
}
