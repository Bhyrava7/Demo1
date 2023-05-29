package fetchdata;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_data1 {
	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream();
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		String value=c.toString();
				System.out.println(value);
		
		
		
		
	}

}
