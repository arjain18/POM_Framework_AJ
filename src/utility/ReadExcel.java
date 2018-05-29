package utility;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadExcel {
	static String rUsername;
	static String rPassword;
	static String rURL;
	public static String readUsername() {
		try {
			  File src=new File("C:\\Development\\Eclipse\\POM_Framework_AJ\\src\\utility\\TestData.xls");
			  FileInputStream fis=new FileInputStream(src);
			  @SuppressWarnings("resource")
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			  HSSFSheet sh1= wb.getSheetAt(0);
			  
			  rUsername = sh1.getRow(1).getCell(1).getStringCellValue();
			  
			  } catch (Exception e) {

			   System.out.println(e.getMessage());

			  }
		return rUsername;
	}
	public static String readPassword() {
		try {
			  File src=new File("C:\\Development\\Eclipse\\POM_Framework_AJ\\src\\utility\\TestData.xls");
			  FileInputStream fis=new FileInputStream(src);
			  @SuppressWarnings("resource")
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			  HSSFSheet sh1= wb.getSheetAt(0);
			  
			  rPassword = sh1.getRow(1).getCell(2).getStringCellValue();
			  
			  } catch (Exception e) {

			   System.out.println(e.getMessage());

			  }
		return rPassword;
	}
	public static String readURL() {
		try {
			  File src=new File("C:\\Development\\Eclipse\\POM_Framework_AJ\\src\\utility\\TestData.xls");
			  FileInputStream fis=new FileInputStream(src);
			  @SuppressWarnings("resource")
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			  HSSFSheet sh1= wb.getSheetAt(0);
			  
			  rURL = sh1.getRow(1).getCell(3).getStringCellValue();
			  
			  } catch (Exception e) {

			   System.out.println(e.getMessage());

			  }
		return rURL;
	}
		
	
}
