package Activity4_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;


public class Activity4_3 {
	

	private static String filepath = "C://SDET//Input.xlxs";

	public static void main(String[] args) {
		
		XSSFWorkbook xwb = new XSSFWorkbook();
		XSSFSheet Sh = xwb.getSheet("");
		
		Object[][] datatypes = {
			    {"Datatype", "Type", "Size(in bytes)"},
			    {"int", "Primitive", 2},
			    {"float", "Primitive", 4},
			    {"double", "Primitive", 8},
			    {"char", "Primitive", 1},
			    {"String", "Non-Primitive", "No fixed size"}
			};
		
		int rowNum = 0;

		for (Object[] datatype : datatypes) 
		{
		    Row row = Sh.createRow(rowNum++);
		    int colNum = 0;
		    for (Object field : datatype) 
		    {
		        Cell cell = row.createCell(colNum++);
		        if (field instanceof String) 
		        {
		            cell.setCellValue((String) field);
		        } else if (field instanceof Integer) {
		            cell.setCellValue((Integer) field);
		        }
		    }
		    try {
	            FileOutputStream outputStream = new FileOutputStream(filepath);
	            xwb.write(outputStream);
	            xwb.close();
	        } catch (FileNotFoundException e) 
          {
	            e.printStackTrace();
	        } 
          catch (IOException e) 
          {
	            e.printStackTrace();
	        }

		}
		
		

	}

}
