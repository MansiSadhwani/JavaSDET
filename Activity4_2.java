package Activity4_2;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException
	{
	try {
		File file = new File("C://SDET//SDET.txt");
		Boolean status = file.createNewFile();
		if(status)
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("File already exist");
		}
      File fileUtil = FileUtils.getFile("C://SDET//SDET.txt");
	
		System.out.println("Data in original file : " + FileUtils.readFileToString(fileUtil, "UTF8"));
		File destDir = new File("resources");
		FileUtils.copyFileToDirectory(file, destDir);
		File newFile = FileUtils.getFile(destDir,"SDET.txt");
		String newReadData = FileUtils.readFileToString(newFile, "UTF8");
		System.out.println("Data in new file: "+newReadData);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

}
