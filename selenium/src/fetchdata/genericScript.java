package fetchdata;

import java.io.FileInputStream;

import org.apache.batik.css.engine.value.StringValue;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class genericScript
{
public static String get_data(String sh,int r,int c)
{
StringValue="";
try {
	FileInputStream fis=new FileInputStream("");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("sheet");
	Row r=sh.getRow(0);
	Cell c=r.getCell(0);
	value=cell.toString();
}
	catch(Exception e)
{
	System.out.println();
}
return value;
}
