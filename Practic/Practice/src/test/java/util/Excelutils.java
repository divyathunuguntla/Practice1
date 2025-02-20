package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelutils {
	
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\admin\\eclipse-workspace\\Practice\\Excel\\name.xls";
		FileInputStream inputstream = new FileInputStream(path);	
        XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		System.out.println("Number of rows : " + rows);
			
		
	}
}

