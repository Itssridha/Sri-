package sri;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;



public class files {
	
public static void main (String []args) throws IOException {
	
	File f= new File("C:\\Users\\MJ\\Desktop");
	FileInputStream  f1 =new FileInputStream (f);
	HSSFWorkbook w= new HSSFWorkbook(f1);
	Sheet s=w.getSheet("Sheet1");
	
	for (int i=0;i<s.getPhysicalNumberOfRows();i++) {
	Row r=s.getRow(i);
	
	for (int j=0;j<r.getPhysicalNumberOfCells();j++) {

		Cell c = r.getCell(j);
		

		int cellType = c.getCellType();
		
		if (cellType==1) {
			
		String v =c.getStringCellValue();
		
		System.out.println(v);
	}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date d=c.getDateCellValue();
				SimpleDateFormat sd= new  SimpleDateFormat("MM/dd/yyyy");
				String v= sd.format(d);
				System.out.println(v);
			}
		}
	
}
}
}

}

