package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class verification {
	public static void main(String []args) throws IOException {
File f = new File("C:\\Users\\MJ\\eclipse-workspace\\MavenProject\\target\\sri.xlsx");
FileOutputStream f1 = new FileOutputStream(f);
HSSFWorkbook work = new HSSFWorkbook();
HSSFSheet sheet =work.createSheet("students");
HSSFRow row=sheet.createRow(0);
HSSFCell cell =row.createCell(0);
cell.setCellValue("sridhar");



List<String> a=new ArrayList<>();
a.add("stephan");
a.add("azhagar");
a.add("poyyali");
a.add("manikandan");

for (int i=0;i<a.size();i++) {
	HSSFRow row1=sheet.createRow(i+1);
	HSSFCell cell1 =row1.createCell(0);
	
	cell1.setCellValue(a.get(i));
}
	work.write(f1);
	


FileInputStream s=new FileInputStream(f);
HSSFWorkbook w1 = new HSSFWorkbook(s
		);
HSSFSheet s1 =w1.getSheet("students");
HSSFRow r2=s1.getRow(0);
HSSFCell c2 =r2.getCell(0);

String StringCellValue =c2.getStringCellValue();
System.out.println(StringCellValue);
	}
}





