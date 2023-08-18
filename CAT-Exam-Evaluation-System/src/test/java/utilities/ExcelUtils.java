package utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String path, String sheetName) throws Exception {
		workbook = new XSSFWorkbook(path);
		sheet = workbook.getSheet(sheetName);
	}
	public static void getCellData(int row, int col) {
		DataFormatter format = new DataFormatter();
		Object value = format.formatCellValue(sheet.getRow(row).getCell(col));
		System.out.println(value);		
	}

	public static int getRowCount() {
		int rowCount = 0;
		for (Row row : sheet) {
			if (row.getPhysicalNumberOfCells() > 0) {
				rowCount++;
			}
		}
		return rowCount;
	}
}
