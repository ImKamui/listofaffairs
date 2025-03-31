package listOfAffairs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.time.LocalDate;

public class writeToFile implements write{
	public void writeToFile(String pathToFileWithName, Scanner scanner)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFileWithName, true));
			boolean flag = true;
			List<String> arrayList = new ArrayList<>();
			int i = 0;
			while(flag)
			{
				String info = scanner.nextLine();
				if ("Exit".equalsIgnoreCase(info))
				{
					flag = false;
				}
				else
				{
					i++;
					arrayList.add(i + ". " + info);
				}
			}
			LocalDate date = LocalDate.now();
			writer.write("\n" + String.valueOf(date) + "\n");
			writer.write(String.join("\n", arrayList));
			writer.close();
			chooser useChoose = new chooser();
			useChoose.chooseVariant();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
