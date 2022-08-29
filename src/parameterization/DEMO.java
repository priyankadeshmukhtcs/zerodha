package parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;




public class DEMO {
public static void main(String[] args)throws Throwable {
	//CREATE objectof fileinputstream class
	FileInputStream file=new FileInputStream("C:\\Users\\JPTL\\Desktop\\deshmukh.xlsx");
//open excel sheet using create method
	String data = WorkbookFactory.create(file).getSheet("deshmukh").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);

}
}