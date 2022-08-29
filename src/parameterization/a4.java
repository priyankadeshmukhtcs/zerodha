package parameterization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a4 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\JPTL\\Documents\\may2.xlsx");
	 boolean data1 = WorkbookFactory.create(file).getSheet("may2").getRow(2).getCell(1).getBooleanCellValue();
	System.out.println(data1);
}
}
