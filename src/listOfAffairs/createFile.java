package listOfAffairs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class createFile implements create{
	public void createFile(String fileName)
	{
		try
		{
			File file = new File(fileName);
			if (!file.exists())
			{
				file.createNewFile();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
