package listOfAffairs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class checkOrEditFile implements checkOrEdit{
	
	public void checkOrEditFile(String fileName, Scanner scan)
	{
		int numRows = -1;
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null)
			{
				numRows++;
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
			writer.newLine();
			boolean flag = true;
			List<String> arrayList = new ArrayList<>();
			while(flag)
			{
				String info = scan.nextLine();
				if ("Exit".equalsIgnoreCase(info))
				{
					flag = false;
				}
				else
				{
					numRows++;
					arrayList.add(numRows + ". " + info);
				}
			}
			writer.write(String.join("\n", arrayList));
			writer.close();
			chooser useChooser = new chooser();
			useChooser.chooseVariant();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
