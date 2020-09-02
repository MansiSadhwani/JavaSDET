package Activity4_2;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) 
	{
	try {
		File file = new File("src/Activity4_2/input.txt");
		Boolean status = file.createNewFile();
		if(status)
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("File already exist");
		}
		File fileUtil = FileUtils.getFile("src/Activity4_2/input.text");
	
		System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
		File destDir = new File("resources");
		FileUtils.copyFileToDirectory(file, destDir);
		File newFile = FileUtils.getFile(destDir,"input.txt");
		String newReadData = FileUtils.readFileToString(newFile, "UTF8");
		System.out.println("Data in file: "+newReadData);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

}
