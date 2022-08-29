package parameterization1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a1 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\JPTL\\Documents\\may7.xlsx");//shift+right click on target file =getpath option
double data = WorkbookFactory.create(file).getSheet("may7").getRow(0).getCell(0).getNumericCellValue();
System.out.println(data);
}
}
