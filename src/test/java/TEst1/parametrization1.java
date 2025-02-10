package TEst1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		//Create an object of FileInputStrem class with excel sheet path as input in constructor.
		
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\TestAutomation2\\target\\Test1.xls");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		System.out.println(value);
	}

}
