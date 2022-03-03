//package Utility;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelUtility {
//	   @DataProvider
//		public Object[][] dp() throws IOException,BiffException{
//
//			FileInputStream f = new FileInputStream("C:\\Users\\asnab\\OneDrive\\Desktop\\loginform.xls");
//				
//		Workbook w = Workbook.getWorkbook(f);
//		
//			Sheet s= w.getSheet("Sheet1");
//
//			int c = s.getColumns();
//			int r = s.getRows();
//
//			String input[][] = new String[r][c];
//			for (int i = 0; i < r; i++) {
//				for (int j = 0; j < c; j++) {
//					Cell cc = s.getCell(j,i);
//					input[i][j] = cc.getContents();
//					}}
//	    return input;
//		}

